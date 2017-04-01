package com.example.lunger.view.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lunger on 2017/3/31.
 * ListView适配器ViewHolder的封装
 */

public class ViewHolder {
    private final SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;

    private ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.mPosition = position;
        this.mViews = new SparseArray();
        this.mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        this.mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        return convertView == null?new ViewHolder(context, parent, layoutId, position):(ViewHolder)convertView.getTag();
    }

    public View getConvertView() {
        return this.mConvertView;
    }

    public <T extends View> T getView(int viewId) {
        View view = this.mViews.get(viewId);
        if(view == null) {
            view = this.mConvertView.findViewById(viewId);
            this.mViews.put(viewId, view);
        }
        return (T) view;
    }

    public ViewHolder setText(int viewId, String text) {
        TextView view = (TextView)this.getView(viewId);
        view.setText(text);
        return this;
    }

    public ViewHolder setImageResource(int viewId, int drawableId) {
        ImageView view = (ImageView)this.getView(viewId);
        view.setImageResource(drawableId);
        return this;
    }

    public ViewHolder setImageBitmap(int viewId, Bitmap bm) {
        ImageView view = (ImageView)this.getView(viewId);
        view.setImageBitmap(bm);
        return this;
    }

    public int getPosition() {
        return this.mPosition;
    }
}