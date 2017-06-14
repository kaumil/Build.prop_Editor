package com.example.android.de_app_slicing.propeditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.de_app_slicing.propeditor.R.layout.info_activity_2);
    }
    public void nextpage2(View view)
    {
        Intent intent=new Intent(this,InfoActivity3.class);
        startActivity(intent);
    }
}
