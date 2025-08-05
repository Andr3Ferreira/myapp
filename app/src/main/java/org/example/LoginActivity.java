package org.example;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
//import org.example.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

//    private ActivityMainBinding binding;

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

        TextView myTextView = findViewById(R.id.signup_view);
        String fullText = "Don't have an account yet? Sign up.";
        SpannableString spannableString = new SpannableString(fullText);

        // Define the start and end indices of the clickable part
        int startIndex = fullText.indexOf("Sign up");
        int endIndex = startIndex + "Sign up".length();

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Handle the click event here
                Toast.makeText(widget.getContext(), "Link clicked!", Toast.LENGTH_SHORT).show();
                // You can open a URL, navigate to another activity, etc.
            }
            
        };

        spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        myTextView.setText(spannableString);
        // Important: Enable link movement for the TextView
        myTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}