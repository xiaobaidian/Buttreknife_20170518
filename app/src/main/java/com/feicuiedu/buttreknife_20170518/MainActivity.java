package com.feicuiedu.buttreknife_20170518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // alt+enter 查看错误的解决提示信息
        // 代码放大：双击shift-->搜索font-->Mouse 打开
        // ctrl+p：查看方法的参数
        // ctrl+alt+空格：提示
        ButterKnife.bind(this);

        // 绑定资源
//        final int color = getResources().getColor(R.color.colorAccent);
//        String string = getResources().getString(R.string.app_name);

        // 设置监听
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTextView.setText(appName);
                mTextView.setTextColor(color);
            }
        });
    }
}
