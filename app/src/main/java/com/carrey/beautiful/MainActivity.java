package com.carrey.beautiful;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.carrey.beautiful.view.photoview.PhotoViewActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private DrawerViewController drawerViewController;

    private ArrayList<String> images = new ArrayList() {
    };

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

        drawerViewController.setCategorylist(Arrays.asList(1, 2, 3, 4, 5, 6));

        images.add("http://jcodecraeer.com/uploads/20150327/1427445293137409.jpg");
        images.add("https://github.com/elementary/mvp/blob/master/images/notebook.png");

        final ImageView imageView = (ImageView) findViewById(R.id.image);
        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Glide.with(MainActivity.this).load(images.get(0)).fitCenter().error(R.mipmap.ic_launcher).into(imageView);
                loadData();
//                if (drawerViewController != null) {
//                    DrawerLayout drawer = drawerViewController.getDrawerLayout();
//                    if (drawer != null) {
//                        boolean open = drawer.isDrawerOpen(Gravity.LEFT);
//                        if (open) {
//                            drawer.closeDrawer(Gravity.LEFT);
//                        } else {
//                            drawer.openDrawer(Gravity.LEFT);
//                        }
//                    }
//                }
            }
        });


//        loadData();
    }

    private void loadData() {

        startActivity(new Intent(this, PhotoViewActivity.class).putStringArrayListExtra(PhotoViewActivity.EXTRA_PHOTOS, images));
    }


}
