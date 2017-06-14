package com.example.android.de_app_slicing.propeditor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.de_app_slicing.propeditor.R;
import com.example.android.de_app_slicing.propeditor.activities.BaseActivity;

public class PhoneRing extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_ring);
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
