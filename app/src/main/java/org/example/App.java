package org.example;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;

public class App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TextView tv = new TextView(this);
        RelativeLayout loginBox = new RelativeLayout(this);
        Button btn = new Button(this);

        setContentView(R.layout.app_main);

        // Hides Title Bar at the top of activity. Must be placed in every activity.
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }

    // public String getGreeting() {
    // return "Hello World!";
    // }

    // public static void main(String[] args) {
    // System.out.println(new App().getGreeting());
    // }
}