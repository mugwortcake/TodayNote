package com.a4kku.todaynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("32비트는 씹 똥 컴 입니다");
        setContentView(R.layout.activity_main);
    }
}
