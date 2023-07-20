package com.example.apptestsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testedoctorsdk.TestEdoctorSDK;
import com.example.testedoctorsdk.Utils.Option;

public class MainActivity extends AppCompatActivity {

    private Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBtn = findViewById(R.id.btn_id);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Option option = new Option(true, "Manh", com.example.testedoctorsdk.R.drawable.baseline_arrow_back_ios_24);
                TestEdoctorSDK.openWebView(MainActivity.this, option);
            }
        });
    }
}