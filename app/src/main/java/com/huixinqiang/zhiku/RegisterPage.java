package com.huixinqiang.zhiku;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by huixinqiang on 2016/5/9.
 */
public class RegisterPage  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);
        Button button = (Button) findViewById(R.id.button_register1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = ((EditText) findViewById(R.id.editText_register_user)).getText().toString();
                String passwd = ((EditText) findViewById(R.id.editText_register_password)).getText().toString();
                String passwd_again = ((EditText) findViewById(R.id.editText_register_password_again)).getText().toString();
                String total = "user = " + user + "\npasswd = " + passwd + "\npasswd_again = " + passwd_again;
                Toast toast = Toast.makeText(RegisterPage.this, total, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button1 = (Button) findViewById(R.id.button_cancel);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
