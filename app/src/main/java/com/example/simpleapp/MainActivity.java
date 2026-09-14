package com.example.simpleapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 画面に文字を表示するだけのシンプルなアプリ
        TextView tv = new TextView(this);
        tv.setText("こんにちは！GitHub Actionsで作ったAPKです。");
        tv.setTextSize(20);
        setContentView(tv);
    }
}