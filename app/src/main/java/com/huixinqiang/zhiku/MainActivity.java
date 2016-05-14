package com.huixinqiang.zhiku;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if(info != null)
        {
            Toast.makeText(MainActivity.this, "联网成功"+info.getTypeName(), Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "未联网", Toast.LENGTH_SHORT).show();
        }
        Button button = (Button) findViewById(R.id.button_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RegisterPage.class);
                startActivity(intent);
            }
        });
    }
}
