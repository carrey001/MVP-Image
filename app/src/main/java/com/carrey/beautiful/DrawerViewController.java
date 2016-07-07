package com.carrey.beautiful;


import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.nineoldandroids.view.ViewHelper;

import java.util.List;

/**
 * Created by sunning on 16/3/3.
 */
public class DrawerViewController {

    private DrawerLayout mDrawerLayout;
    private RecyclerView categorylist;
    private Context context;
    private CategoryAdapter mCategoryAdapter;

    public DrawerViewController(Context context, View decorView) {
        this.context = context;
        mDrawerLayout = (DrawerLayout) LayoutInflater.from(context).inflate(R.layout.drawer_layout, null);
        mDrawerLayout.addView(decorView, 0);
        // 防止返回失效
        mDrawerLayout.setFocusableInTouchMode(false);
        setDrawerAnimation();
        findView();
        initData();
    }

    private void findView() {
        categorylist = (RecyclerView) mDrawerLayout.findViewById(R.id.rv_category);
        categorylist.setLayoutManager(new LinearLayoutManager(context));
    }

    private void initData() {
    }

    private void setDrawerAnimation() {
        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                View mContent = mDrawerLayout.getChildAt(0);
                View mMenu = drawerView;
                float scale = 1 - slideOffset;
                ViewHelper.setAlpha(mMenu, 0.6f + 0.4f * (1 - scale));
                ViewHelper.setTranslationX(mContent, mMenu.getMeasuredWidth() * (1 - scale));
                mContent.invalidate();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
            }

            @Override
            public void onDrawerClosed(View drawerView) {
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }


    public void setCategorylist(List data) {
        if (mCategoryAdapter == null) {
            mCategoryAdapter = new CategoryAdapter(context, data);
            categorylist.setAdapter(mCategoryAdapter);
        }
    }

    public DrawerLayout getDrawerLayout() {
        return mDrawerLayout;
    }

}
