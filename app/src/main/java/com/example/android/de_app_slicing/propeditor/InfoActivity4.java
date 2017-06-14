package com.example.android.de_app_slicing.propeditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.de_app_slicing.propeditor.InfoActivity5;
import com.example.android.de_app_slicing.propeditor.R;

public class InfoActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity_4);
    }
    public void nextpage4(View view)
    {
        Intent intent=new Intent(this,InfoActivity5.class);
        startActivity(intent);
    }
}
