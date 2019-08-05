package com.example.mainactivitylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {
    Button mbtnLogin;
    EditText mEditTextUsername;
    EditText medtPass;

    String USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextUsername = (EditText) findViewById(R.id.username);
        medtPass = (EditText) findViewById(R.id.password);
        mbtnLogin = (Button) findViewById(R.id.btnLogin);


        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mEditTextUsername.getText().toString().trim();
                String password = medtPass.getText().toString().trim();
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Chưa nhập đầy đủ thông tin", Toast.LENGTH_LONG).show();

                    return;
                }
                Intent intent = new Intent(MainActivity.this, Activity_ListItem.class);
                intent.putExtra("username", username);
                startActivity(intent);
//
//                if(mEditTextUsername.getText().equals("") || medtPass.getText().equals("")){
//                    Context context= getApplicationContext();
//                    Toast toast= Toast.makeText(context, "Chưa nhập đầy đủ thông tin", Toast.LENGTH_LONG);
//                    toast.show();
//                }else {
//                    Intent intent = new Intent(MainActivity.this, Activity_Login.class);
//                    intent.putExtra("username", mEditTextUsername.getText().toString());
//                    startActivity(intent);
//                }
            }
        });

    }
}
