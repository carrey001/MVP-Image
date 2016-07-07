package com.carrey.beautiful;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * @author : carrey
 * @Date : 16-7-6
 * @describe :
 */
public class CategoryAdapter<T> extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<T> mItems;
    private Context mContext;

    public CategoryAdapter(Context context, List<T> t) {
        mItems = t;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_category, null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (mItems == null) {
            return 0;
        }
        return mItems.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "111", 1).show();
                }
            });
        }
    }
}
