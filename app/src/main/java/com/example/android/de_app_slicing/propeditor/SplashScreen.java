package com.example.android.de_app_slicing.propeditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.os.Build.VERSION_CODES.M;

public class SplashScreen extends AppCompatActivity {
    public boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        Thread mythread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent;
                    if(flag){
                        intent=new Intent(getApplicationContext(),MainActivity.class);
                    }
                    else{
                        intent=new Intent(getApplicationContext(),RootFailActivity.class);
                    }
                    startActivity(intent);
                }
            }
        };
        mythread.start();
        flag=RootUtil.isDeviceRooted();
    }
}
