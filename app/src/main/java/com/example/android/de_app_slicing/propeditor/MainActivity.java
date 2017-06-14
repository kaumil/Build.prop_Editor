package com.example.android.de_app_slicing.propeditor;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.de_app_slicing.propeditor.activities.BaseActivity;
import com.example.android.de_app_slicing.propeditor.activities.PropEditorActivity;
import com.example.android.de_app_slicing.propeditor.tasks.DelayAsyncTask;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setMenuId(R.menu.main_menu);

        String m=Build.MANUFACTURER;
        String mo=Build.MODEL;
        String s=String.valueOf(Build.VERSION.SDK_INT);
        String v=Build.VERSION.RELEASE;
        TextView txtmanufact=(TextView)findViewById(R.id.txtmanufact);
        TextView txtmodel=(TextView)findViewById(R.id.txtmodel);
        TextView txtsdk=(TextView)findViewById(R.id.txtsdk);
        TextView txtversion=(TextView)findViewById(R.id.txtversion);
        txtmanufact.setText(m);
        txtmodel.setText(mo);
        txtsdk.setText(s);
        txtversion.setText(v);
        Button button=(Button)findViewById(R.id.btnprop);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PropEditorActivity.class);
                startActivity(intent);
            }
        });
        Button button1=(Button)findViewById(R.id.btngraph);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Infoactivity7.class);
                startActivity(intent);
            }
        });

    }

    /**
     * Prepare Option menu
     */
    @Override
    protected boolean onMenuItemSelected(int menuItemId) {
        boolean processed = false;
        switch (menuItemId) {
            case R.id.item_exit:
                processed = true;
                finish();
                break;
        }
        return processed;
    }


    @Override
    protected void onDestroy() {
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }
}
