package com.feicuiedu.buttreknife_20170518;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gqq on 2017/5/18.
 */

public class CustomAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        }

        return null;
    }

    static class ViewHolder {
        @BindView(R.id.tv1)
        TextView mTv1;
        @BindView(R.id.tv2)
        TextView mTv2;
        @BindView(R.id.tv3)
        TextView mTv3;
        @BindView(R.id.tvShow)
        TextView mTvShow;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

//    class ViewHolder{
//
//        @BindView(R.id.tvShow)
//        TextView mTextView;
//
//        public ViewHolder(View view) {
//            ButterKnife.bind(this,view);
//        }
//    }
}
