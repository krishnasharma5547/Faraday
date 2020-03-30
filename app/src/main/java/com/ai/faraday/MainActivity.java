package com.ai.faraday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    TextView view;
    Button submitButton;
    SettingUp user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        view=findViewById(R.id.setting_up_faraday);
        text=findViewById(R.id.getName);
        submitButton=findViewById(R.id.submitButton);
        user=new SettingUp();

        submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                user.setName(text.getText().toString());
                view.setText(user.getName());
                Intent i = new Intent(getApplicationContext(),Activity_2.class);
                startActivity(i);
                setContentView(R.layout.activity_2);
            }

        });















    }
}
