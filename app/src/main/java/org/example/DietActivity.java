package org.example;

import android.app.Activity;
import android.os.Bundle;

/**
 *  Activity to create diets and show the user the nutritional values.
 */
public class DietActivity  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Links java class with XML UI design
        setContentView(R.layout.app_diet);

        // TODO: Ask user to input current weight

        // TODO: Ask user to input target weight. If different from current weight, calculate calories needed.

        // TODO: Ask user to input age

        // TODO: Ask user to input gender

        // TODO: Ask user to input activity level

        // TODO: Ask user to input current diet

    }

}
