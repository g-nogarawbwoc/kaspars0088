package com.david.dandroidutils;
/*
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @OsChina空间: https://my.oschina.net/mcxiaobing
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.david.dandroidutils.activity.LoadingActivity;

/**
 * 首界面
 */
public class MainActivity extends AppCompatActivity {


    private Button btn_loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setOnclickListener();

    }

    private void setOnclickListener() {
        /**
         * loading等待提示框功能展示
         */
        btn_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoadingActivity.class));
            }
        });

    }

    private void initView() {
        btn_loading = (Button) findViewById(R.id.btn_loading);
    }
}