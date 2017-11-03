package com.example.jelle.jellevannoord_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout armsLinear, earsLinear, eyebrowsLinear, eyesLinear, glassesLinear, hatLinear, mouthLinear, mustacheLinear, noseLinear, shoesLinear;
    LinearLayout[] optionLayouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        armsLinear = findViewById(R.id.armsLinear);
        earsLinear = findViewById(R.id.earsLinear);
        eyebrowsLinear = findViewById(R.id.eyebrowsLinear);
        eyesLinear = findViewById(R.id.eyesLinear);
        glassesLinear = findViewById(R.id.glassesLinear);
        hatLinear = findViewById(R.id.hatLinear);
        mouthLinear = findViewById(R.id.mouthLinear);
        mustacheLinear = findViewById(R.id.mustacheLinear);
        noseLinear = findViewById(R.id.noseLinear);
        shoesLinear = findViewById(R.id.shoesLinear);
        optionLayouts = new LinearLayout[]{armsLinear, earsLinear, eyebrowsLinear, eyesLinear, glassesLinear, hatLinear, mouthLinear, mustacheLinear, noseLinear, shoesLinear};
    }

    public void onCheckboxClicked(View view) {
        int newState;
        if(((CheckBox) view).isChecked()) {
            newState = View.VISIBLE;
        } else {
            newState = View.INVISIBLE;
        }

        switch(view.getId()) {
            case R.id.armsCheckBox:
                armsLinear.setVisibility(newState);
                break;
            case R.id.earsCheckBox:
                earsLinear.setVisibility(newState);
                break;
            case R.id.eyebrowsCheckBox:
                eyebrowsLinear.setVisibility(newState);
                break;
            case R.id.eyesCheckbox:
                eyesLinear.setVisibility(newState);
                break;
            case R.id.glassesCheckbox:
                glassesLinear.setVisibility(newState);
                break;
            case R.id.hatCheckBox:
                hatLinear.setVisibility(newState);
                break;
            case R.id.mouthCheckBox:
                mouthLinear.setVisibility(newState);
                break;
            case R.id.mustacheCheckBox:
                mustacheLinear.setVisibility(newState);
                break;
            case R.id.noseCheckBox:
                noseLinear.setVisibility(newState);
                break;
            case R.id.shoesCheckBox:
                shoesLinear.setVisibility(newState);
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        for (int i = 0; i < optionLayouts.length; i++) {
            savedInstanceState.putInt(String.valueOf(optionLayouts[i].getId()), optionLayouts[i].getVisibility());
        }
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        for (int i = 0; i < optionLayouts.length; i++) {
            optionLayouts[i].setVisibility(savedInstanceState.getInt(String.valueOf(optionLayouts[i].getId())));
        }
    }
}
