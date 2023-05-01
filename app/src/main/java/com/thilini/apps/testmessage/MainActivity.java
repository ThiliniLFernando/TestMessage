package com.thilini.apps.testmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thilini.apps.message.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(getApplication(),"Hi Thilini");
    }
}