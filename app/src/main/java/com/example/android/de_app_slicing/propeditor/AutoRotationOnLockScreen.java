package com.example.android.de_app_slicing.propeditor;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.android.de_app_slicing.propeditor.R;
import com.example.android.de_app_slicing.propeditor.activities.BaseActivity;

import static android.R.attr.version;

public class AutoRotationOnLockScreen extends BaseActivity {
    private String version = "1.0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_rotation_on_lock_screen);
        setMenuId(R.menu.back_only_menu);
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
