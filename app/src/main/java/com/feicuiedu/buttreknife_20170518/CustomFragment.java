package com.feicuiedu.buttreknife_20170518;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by gqq on 2017/5/18.
 */

public class CustomFragment extends Fragment {

    // 使用方法与Activity一样
    @BindView(R.id.tvShow)
    TextView mTextView;
    @BindView(R.id.tv1)
    TextView mTv1;
    @BindView(R.id.tv2)
    TextView mTv2;
    @BindView(R.id.tv3)
    TextView mTv3;
    @BindView(R.id.tvShow)
    TextView mTvShow;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main, container, false);
//        mUnbinder = ButterKnife.bind(this, view);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();// 绑定重置
    }

    @OnClick({R.id.btnShow, R.id.btnShow1, R.id.btnShow2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnShow:
                break;
            case R.id.btnShow1:
                break;
            case R.id.btnShow2:
                break;
        }
    }
}
