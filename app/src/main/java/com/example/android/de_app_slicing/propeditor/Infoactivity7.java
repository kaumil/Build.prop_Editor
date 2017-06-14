package com.example.android.de_app_slicing.propeditor;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.android.de_app_slicing.propeditor.activities.BaseActivity;

public class Infoactivity7 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity_7);
        setMenuId(R.menu.back_only_menu);
        TextView link = (TextView) findViewById(R.id.textView2);
        String linkText = " <a href='http://www.apkhere.com/app/com.n0n3m4.gltools'>http://www.apkhere.com/app/com.n0n3m4.gltools</a> .";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void finish(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    /**
     * Prepare Option menu
     */
    @Override
    protected boolean onMenuItemSelected(int menuItemId) {
        boolean processed = false;
        switch (menuItemId) {
            case R.id.item_back:
                processed = true;
                goBack();
                break;
        }
        return processed;
    }
}
