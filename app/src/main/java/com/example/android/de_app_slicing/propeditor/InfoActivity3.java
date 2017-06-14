package com.example.android.de_app_slicing.propeditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class InfoActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.de_app_slicing.propeditor.R.layout.info_activity_3);
        TextView link = (TextView) findViewById(com.example.android.de_app_slicing.propeditor.R.id.textView2);
        String linkText = " <a href='https://play.google.com/store/apps/details?id=com.jrummy.apps.build.prop.editor'>https://play.google.com/store/apps/details?id=com.jrummy.apps.build.prop.editor</a> .";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void nextpage3(View view)
    {
        Intent intent=new Intent(this,InfoActivity4.class);
        startActivity(intent);
    }

}
