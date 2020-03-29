package com.ai.faraday;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    EditText setname;
    SettingUp settingup;
    Button submitbutton;


    public TextView getDisplay() {
        return display;
    }
    public void setDisplay(TextView display) {
        this.display = display;
    }

    public SettingUp getSettingup() {
        return settingup;
    }
    public void setSettingup(SettingUp settingup) {
        this.settingup = settingup;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingup=new SettingUp();
        display = findViewById(R.id.textView1);
        display.setText(R.string.settingupfaraday);
        setname=findViewById(R.id.getName);
        submitbutton=findViewById(R.id.submitButton);
        submitbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                settingup.setName(setname.getText().toString());
            }
        });
        display.setText(String.format("Hello%s", settingup.getName().toString()));








    }
}
