package com.example.lunger.view.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Allen on 2017/3/31.
 * ListView BaseAdapter的封装
 */

public abstract class BaseBKAdapter<T> extends android.widget.BaseAdapter {
    protected LayoutInflater mInflater;
    protected Context mContext;
    protected List<T> mList;
    protected final int mItemLayoutId;

    public BaseBKAdapter(Context context, List<T> data, int itemLayoutId) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
        this.mList = data;
        this.mItemLayoutId = itemLayoutId;
    }

    public int getCount() {
        if (mList == null) {
            return 0;
        }
        return this.mList.size();
    }

    public T getItem(int position) {
        if (mList == null) {
            return null;
        }
        return this.mList.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = this.getViewHolder(position, convertView, parent);
        this.convert(viewHolder, this.getItem(position), position);
        return viewHolder.getConvertView();
    }

    public abstract void convert(ViewHolder holder, T data, int position);

    private ViewHolder getViewHolder(int position, View convertView, ViewGroup parent) {
        return ViewHolder.get(this.mContext, convertView, parent, this.mItemLayoutId, position);
    }
}
