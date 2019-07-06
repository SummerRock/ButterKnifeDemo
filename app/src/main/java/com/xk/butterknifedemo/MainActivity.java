package com.xk.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.xk.annotation_lib.BindView;
import com.xk.butterknifelib.InjectUtil;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.text)
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtil.bind(this);
    }

    public void showToast(View view) {
        String toastString = textView == null ? "textView 为空！" : "textView 正常";
        Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
    }
}


