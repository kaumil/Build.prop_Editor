package com.example.android.de_app_slicing.propeditor.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.de_app_slicing.propeditor.R;

public class SendFeedbackActivity extends BaseActivity {
    private String version = "1.0";
    TextView txt,totxt,subjecttxt;
    EditText contenttxt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_feedback);
        setMenuId(R.menu.back_only_menu);

        txt=(TextView)findViewById(R.id.feedbacktitleTextView);
        txt.setText(R.string.feedback);

        totxt=(TextView)findViewById(R.id.editTextEmailTo);
        totxt.setText(R.string.mailto);

        contenttxt=(EditText)findViewById(R.id.editTextEmailContent);

        subjecttxt=(TextView)findViewById(R.id.editTextEmailSubject);
        subjecttxt.setText(R.string.subject);

        btn=(Button)findViewById(R.id.buttonSend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get to, subject and content from the user input and store as string.
                String emailTo 		= totxt.getText().toString();
                String emailSubject 	= subjecttxt.getText().toString();
                String emailContent 	= contenttxt.getText().toString();

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{ emailTo});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, emailContent);

                //need this to prompts email client only
                emailIntent.setType("message/rfc822");

                startActivity(Intent.createChooser(emailIntent, "Select an Email Client:"));
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
