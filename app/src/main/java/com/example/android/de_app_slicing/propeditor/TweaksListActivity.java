package com.example.android.de_app_slicing.propeditor;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.de_app_slicing.propeditor.activities.BaseActivity;

import java.util.ArrayList;

public class TweaksListActivity extends BaseActivity {
    private String version = "1.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweaks_list);
        setMenuId(R.menu.back_only_menu);

        TextView textView=(TextView)findViewById(R.id.tweaks_title);
        textView.setText(R.string.tweaks_title);

        ListView listView=(ListView)findViewById(R.id.tweaks_list);

        String values[]=new String[]{
                "Auto Rotation on Lock Screen",
                "Change DPI",
                "Force JPEG Encoding to be Top Quality",
                "Google DNS for Faster Internet",
                "Minimal Phone Ring Delay",
                "Making Apps Compatible"
        };

        final ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<values.length;i++){
            list.add(values[i]);
        }

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.tweaks_list_item_layout,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);

                switch (item){
                    case "Auto Rotation on Lock Screen":
                        Intent intent=new Intent(getApplicationContext(), AutoRotationOnLockScreen.class);
                        startActivity(intent);
                        break;
                    case "Change DPI":
                        Intent intent1=new Intent(getApplicationContext(), dpiChange.class);
                        startActivity(intent1);
                        break;
                    case "Force JPEG Encoding to be Top Quality":
                        Intent intent2=new Intent(getApplicationContext(), jpegEncoding.class);
                        startActivity(intent2);
                        break;
                    case "Google DNS for Faster Internet":
                        Intent intent3=new Intent(getApplicationContext(), googleDNS.class);
                        startActivity(intent3);
                        break;
                    case "Minimal Phone Ring Delay":
                        Intent intent4=new Intent(getApplicationContext(), PhoneRing.class);
                        startActivity(intent4);
                        break;
                    case "Making Apps Compatible":
                        Intent intent5=new Intent(getApplicationContext(),AppCompatible.class);
                        startActivity(intent5);
                        break;
                }
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
            case R.id.item_back:
                processed = true;
                goBack();
                break;
        }
        return processed;
    }

}
