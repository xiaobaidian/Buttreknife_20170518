package com.feicuiedu.buttreknife_20170518;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnItemLongClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    // 控件的绑定
    @BindView(R.id.tvShow)
    TextView mTextView;
    @BindView(R.id.btnShow)
    Button mButton;

    // 绑定资源
    @BindColor(R.color.colorAccent)
    int color;
    @BindString(R.string.app_name)
    String appName;
    @BindDimen(R.dimen.activity_horizontal_margin)
    float dimen;

    // 绑定视图列表
    @BindViews({R.id.tv1,R.id.tv2,R.id.tv3})
    List<TextView> mViewList;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // alt+enter 查看错误的解决提示信息
        // 代码放大：双击shift-->搜索font-->Mouse 打开
        // ctrl+p：查看方法的参数
        // ctrl+alt+空格：提示
        // ctrl+alt+V 提取变量
        // ctrl+alt+F 提取为成员变量
        mUnbinder = ButterKnife.bind(this);

        // 绑定资源
//        final int color = getResources().getColor(R.color.colorAccent);
//        String string = getResources().getString(R.string.app_name);

        // 设置监听
//        mButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                mTextView.setText(appName);
//                mTextView.setTextColor(color);
//            }
//        });

        // 间接绑定
//        View view = ;
//        ButterKnife.findById(view,R.id.zzz);

        // 对视图列表进行操作
        ButterKnife.apply(mViewList,mAction);
    }

    // 创建Action，泛型就是视图列表的视图类型
    private ButterKnife.Action<TextView> mAction = new ButterKnife.Action<TextView>() {
        @Override
        public void apply(@NonNull TextView view, int index) {
            view.setText("视图列表的文本:"+index);
        }
    };

//    @OnClick
//    @OnItemClick
//    @OnItemLongClick

    // 设置监听
//    @OnClick(R.id.btnShow)
//    public void onClick(View view){
//        mTextView.setText(appName);
//        mTextView.setTextColor(color);
//    }

    @OnClick({R.id.btnShow,R.id.btnShow1,R.id.btnShow2})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnShow:
                Toast.makeText(this, "展示1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnShow1:
                Toast.makeText(this, "展示2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnShow2:
                Toast.makeText(this, "展示3", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 解绑的操作
        mUnbinder.unbind();
    }
}
