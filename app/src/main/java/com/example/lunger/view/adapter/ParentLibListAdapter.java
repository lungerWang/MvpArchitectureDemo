package com.example.lunger.view.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

import com.example.lunger.R;
import com.example.lunger.domain.model.ParentLibListModel;
import com.example.lunger.view.base.BaseBKAdapter;
import com.example.lunger.view.base.ViewHolder;

import java.util.List;

/**
 * Created by Allen on 2017/04/01.
 */
public class ParentLibListAdapter extends BaseBKAdapter<ParentLibListModel.List> {

    private Context context;

    public ParentLibListAdapter(Context context, List<ParentLibListModel.List> mDatas) {
        super(context, mDatas, R.layout.item_parentlib_list);
        this.context = context;
    }

    @Override
    public void convert(final ViewHolder holder, ParentLibListModel.List data, final int position) {
        holder.setText(R.id.tv_title, data.getTitle());

    }

}
