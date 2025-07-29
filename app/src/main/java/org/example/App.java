package org.example;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;

public class App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        // tv.setText("Hello World");
        // setContentView(tv);

        Button btn = new Button(this);
        setContentView(R.layout.app_main);
    }

    // public String getGreeting() {
    // return "Hello World!";
    // }

    // public static void main(String[] args) {
    // System.out.println(new App().getGreeting());
    // }
}