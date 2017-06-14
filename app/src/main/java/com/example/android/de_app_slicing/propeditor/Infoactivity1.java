package com.example.android.de_app_slicing.propeditor;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.de_app_slicing.propeditor.R;

public class Infoactivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity_1);
    }
    public void nextpage1(View view)
    {
        Intent intent=new Intent(this,InfoActivity2.class);
        startActivity(intent);
    }
}
