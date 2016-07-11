package com.carrey.beautiful;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import com.carrey.beautiful.bean.Category;
import com.carrey.beautiful.bean.CategoryList;
import com.carrey.beautiful.bean.ImageDetal;
import com.carrey.beautiful.server.MainServer;
import com.carrey.beautiful.view.photoview.PhotoViewActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private DrawerViewController drawerViewController;

    private ArrayList<String> images = new ArrayList();
    private View category_name;
    private RecyclerView mRecyclerView;

    private MainServer mMainServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View root = findViewById(R.id.root);
        final ViewGroup rootView = (ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content);
//        View baseView = getWindow().getDecorView();
        rootView.removeView(root);
        drawerViewController = new DrawerViewController(this, root);
        rootView.addView(drawerViewController.getDrawerLayout(), 0);

        category_name = findViewById(R.id.category_name);
        category_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerLayout = drawerViewController.getDrawerLayout();
                if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout.closeDrawer(Gravity.LEFT);
                } else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });
        mRecyclerView = (RecyclerView) findViewById(R.id.home_images);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mMainServer = new MainServer();


        mMainServer.getCategory().observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Action1<Category>() {
                    @Override
                    public void call(Category category) {
                        drawerViewController.setCategorylist(category);
                    }
                })
                .doOnError(new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                })
                .flatMap(new Func1<Category, Observable<CategoryList>>() {
                    @Override
                    public Observable<CategoryList> call(Category category) {
                        Map<String, String> map = new HashMap();
                        map.put("id", String.valueOf(category.tngou.get(0).id));

                        return mMainServer.getList(map);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CategoryList>() {
                    @Override
                    public void call(CategoryList categoryList) {
                        bindList(categoryList);
                        System.out.println("carrey-> next");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        System.out.println("carrey-> error"+throwable.getMessage());
                    }
                }, new Action0() {
                    @Override
                    public void call() {
                        System.out.println("carrey-> end");
                    }
                });
    }

    private void loadCategory() {
        new MainServer().getCategory().observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Category>() {
                    @Override
                    public void call(Category category) {
                        drawerViewController.setCategorylist(category);
                    }
                });
    }

    public void loadList(Category.TngouBean tngouBean) {
        Map<String, String> map = new HashMap();
        map.put("id", String.valueOf(tngouBean.id));

        new MainServer().getList(map).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CategoryList>() {
                    @Override
                    public void call(CategoryList categoryList) {
                        bindList(categoryList);
                    }
                });
//        startActivity(new Intent(this, PhotoViewActivity.class).putStringArrayListExtra(PhotoViewActivity.EXTRA_PHOTOS, images));
    }

    private List<CategoryList.TngouBean> data = new ArrayList<>();
    private ListAdapter listAdapter;

    private void bindList(CategoryList categoryList) {
        data.clear();
        data.addAll(categoryList.tngou);
        if (listAdapter == null) {
            listAdapter = new ListAdapter(MainActivity.this, data);
            listAdapter.mItemClickLinster = new ListAdapter.ItemClickLinster() {
                @Override
                public void onItemClick(CategoryList.TngouBean tngouBean) {
                    loadDetal(tngouBean.id);
                }
            };
            mRecyclerView.setAdapter(listAdapter);
        } else {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void loadDetal(int id) {
        images.clear();
        new MainServer().getDetal(String.valueOf(id)).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ImageDetal>() {
                               @Override
                               public void call(ImageDetal imageDetal) {
                                   for (ImageDetal.ListBean bean : imageDetal.list) {
                                       images.add(bean.src);
                                   }
                                   startActivity(new Intent(MainActivity.this, PhotoViewActivity.class).putStringArrayListExtra(PhotoViewActivity.EXTRA_PHOTOS, images));
                               }
                           }, new Action1<Throwable>() {
                               @Override
                               public void call(Throwable throwable) {

                               }
                           }

                );
    }

}
