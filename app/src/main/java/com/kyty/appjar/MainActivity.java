package com.kyty.appjar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.kyty.mylibrary.ZhiFuActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private android.widget.Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this, ZhiFuActivity.class);
        startActivity(intent);

    }
}
