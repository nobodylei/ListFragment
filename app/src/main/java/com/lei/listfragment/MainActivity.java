package com.lei.listfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * 演示ListFragment的使用
 * 1.ListFragment的布局 listview的id是固定的
 * 2.绑定数据   setListAdapter() 绑定每项点击事件重写OnClickItemClick()
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
