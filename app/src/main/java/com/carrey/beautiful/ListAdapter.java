package com.carrey.beautiful;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.carrey.beautiful.bean.CategoryList;
import com.carrey.beautiful.util.UrlConst;

import java.util.List;

/**
 * @author : carrey
 * @Date : 16-7-7
 * @describe :
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<CategoryList.TngouBean> mItems;
    private Context mContext;

    public ListAdapter(Context context, List<CategoryList.TngouBean> items) {
        mItems = items;
        mContext = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_images, null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final CategoryList.TngouBean tngouBean = mItems.get(position);
        Glide.with(mContext).load(UrlConst.ImageHost + tngouBean.img + "_320x240").into(holder.mImageView);
        holder.mTextView.setText(tngouBean.title);
        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemClickLinster.onItemClick(tngouBean);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.image);
            mTextView = (TextView) itemView.findViewById(R.id.name);
        }
    }

    public ItemClickLinster mItemClickLinster;

    interface ItemClickLinster {
        void onItemClick(CategoryList.TngouBean tngouBean);
    }
}
