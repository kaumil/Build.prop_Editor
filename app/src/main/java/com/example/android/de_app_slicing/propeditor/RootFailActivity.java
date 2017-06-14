package com.example.android.de_app_slicing.propeditor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RootFailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_root_fail);
        Button button=(Button)findViewById(R.id.btn_root);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent browserintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://rootingandroidphoneinformation.blogspot.in/"));
                                          startActivity(browserintent);
                                      }
                                  }
        );
    }
}
