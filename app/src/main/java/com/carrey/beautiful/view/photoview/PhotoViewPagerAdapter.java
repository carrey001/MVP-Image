package com.carrey.beautiful.view.photoview;

import android.app.Activity;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.carrey.beautiful.R;

import java.util.List;

/**
 * 图集模式
 * PhotoViewPagerAdapter
 * chenbo
 * 2015年3月17日 下午2:25:45
 * @version 1.0
 */
public class PhotoViewPagerAdapter extends RecyclingPagerAdapter {
    private Context mContext;
    private List<String> mPhotos;
    private SparseIntArray flags;
    
    public PhotoViewPagerAdapter(Context context, List<String> photos) {
        mContext = context;
        mPhotos = photos;
        
        flags = new SparseIntArray();

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup container) {
        Holder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_photo_view, null);
            holder = new Holder(convertView);
        } else {
            holder = (Holder) convertView.getTag();
        }
        final PhotoView photoView = holder.photoView;
        final String url = mPhotos.get(position);
        photoView.init();

        photoView.setOnViewTapListener(new PhotoViewAttacher.OnViewTapListener() {
            @Override
            public void onViewTap(View view, float x, float y) {
                ((Activity)mContext).finish();
            }
        });
//        Glide.with(mContext).load(url).into(photoView);
        Glide.with(mContext).load(url).into(photoView);
//        mBitmapTools.display(photoView, url, new DefaultBitmapLoadCallBack<View>() {
//
//            @Override
//            public void onLoadCompleted(View container, String uri, Bitmap bitmap, BitmapDisplayConfig config, BitmapLoadFrom from) {
//                super.onLoadCompleted(container, uri, bitmap, config, from);
//                flags.put(position, 100);
//                prsbar.setVisibility(View.GONE);
//            }
//
//            @Override
//            public void onLoadFailed(View container, String uri, Drawable drawable) {
//                super.onLoadFailed(container, uri, drawable);
//                flags.put(position, 100);
//                prsbar.setVisibility(View.GONE);
//            }
//
//            @Override
//            public void onLoading(View container, String uri, BitmapDisplayConfig config, long total, long current) {
//                super.onLoading(container, uri, config, total, current);
//                int progress = (int) (100f * current / total);
//                flags.put(position, progress);
//                if (Integer.parseInt(prsbar.getTag().toString()) == position) {
//                    prsbar.setVisibility(View.VISIBLE);
//                    prsbar.setProgress(progress);
//
//                }
//            }
//        });
        return convertView;
    }

    @Override
    public int getCount() {
        return mPhotos.size();
    }
    
    static class Holder {
        public PhotoView photoView;

        public Holder(View v) {
            v.setTag(this);
            photoView = (PhotoView) v.findViewById(R.id.photoview);
        }
        
    }

}
