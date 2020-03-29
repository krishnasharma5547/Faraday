package com.ai.faraday;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.Voice;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button voice;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        voice= findViewById(R.id.button);
        display=findViewById(R.id.textView1);

        voice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               display.setText("Listening.....");

            }
        }
        );

    }
}
