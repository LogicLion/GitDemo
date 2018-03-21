package com.moonlion.hellogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("首次提交");
        //制造冲突
        System.out.println("二次提交,对二次提交进行修改");
        System.out.println("在另一个项目提交");
    }
}
