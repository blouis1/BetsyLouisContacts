package com.example.betsy.betsylouiscontacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button saveButton;
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText phoneEditText;
    private TextView savedTitleTextView;
    private TextView savedNameTextView;
    private TextView savedEmailTextView;
    private TextView savedPhoneTextView;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = (Button)findViewById(R.id.button_save);
        nameEditText = (EditText) findViewById(R.id.editText_name);
        emailEditText = (EditText) findViewById(R.id.editText_email);
        phoneEditText = (EditText) findViewById(R.id.editText_phone);
        savedTitleTextView = (TextView) findViewById(R.id.textView_savedTitle);
        savedNameTextView = (TextView) findViewById(R.id.textView_savedName);
        savedEmailTextView = (TextView) findViewById(R.id.textView_savedEmail);
        savedPhoneTextView = (TextView) findViewById(R.id.textView_savedPhone);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_type);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    /**
     * On click event handler for the save button. Displays the user-entered values in text areas.
     * @param v     the view
     */
    public void onClick(View v) {
        Button button=(Button) v;
        String phoneType = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
        savedTitleTextView.setText("Saved Details:");
        savedNameTextView.setText("Name: " + nameEditText.getText());
        savedEmailTextView.setText("Email: " + emailEditText.getText());
        savedPhoneTextView.setText("Phone: " + phoneEditText.getText() + " (" + phoneType + ")");
    }
}
