package com.cse4035.j_comp.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;


public class SplashActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        text = findViewById(R.id.textView);
        text.setText("                  Done By\n17BIS0076 Ajay Kumar Vutty \n17BIS0099 Nakka Abhishek \n17BIS0090 Teja Venkat");
        String[] para = text.getText().toString().split("\r\n\r\n");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(SplashActivity.this, "Use DARK MODE for Better Experience    ",Toast.LENGTH_SHORT).show();
                Intent mySuperIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mySuperIntent);
                finish();

            }
        },2000);
    }
}
