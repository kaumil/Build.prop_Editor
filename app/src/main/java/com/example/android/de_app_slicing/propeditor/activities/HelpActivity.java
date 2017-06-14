package com.example.android.de_app_slicing.propeditor.activities;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.android.de_app_slicing.propeditor.R;

public class HelpActivity extends BaseActivity {
    private String version = "1.0";

    /**
     * Prepare Help activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_help);
        setMenuId(R.menu.back_only_menu);
        TextView txt=(TextView)findViewById(R.id.helptitleTextView);
        txt.setText(R.string.help);
        TextView txt1=(TextView)findViewById(R.id.helpTextView);
        txt1.setText(Html.fromHtml(prepareHelpText()));
    }

    /**
     * Prepare the full help text adding the version number, stored on the
     * Application manifest file.
     *
     * @return The about text.
     */
    private String prepareHelpText() {
        String aboutText = "";
        try {
            version = this.getPackageManager().getPackageInfo(
                    this.getPackageName(), 0).versionName;
        } catch (Exception e) {
        }
        aboutText = getString(R.string.help_text, version);
        return aboutText;
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
