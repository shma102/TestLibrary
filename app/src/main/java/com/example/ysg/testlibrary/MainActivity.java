package com.example.ysg.testlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testlibrary.TestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtil.getString();
    }
}
