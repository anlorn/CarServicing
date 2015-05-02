package com.example.carservicing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;


public class MainMenuActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random rand = new Random();
        setTitle(R.string.title_activity_main_menu);
        setContentView(R.layout.activity_main);
        TextView helloWorldText = (TextView)findViewById(R.id.helloWorld);
        helloWorldText.setText("Hello World " + rand.nextInt());
    }

}