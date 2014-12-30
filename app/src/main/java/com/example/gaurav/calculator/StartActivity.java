package com.example.gaurav.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Utils.hasLollipop()) {
            startActivity(new Intent(this, CalculatorL.class));
        } else {
            startActivity(new Intent(this, CalculatorGB.class));
        }
        finish();
    }
}
