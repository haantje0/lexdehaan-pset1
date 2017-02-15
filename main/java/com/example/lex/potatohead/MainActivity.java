package com.example.lex.potatohead;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.UpdateAppearance;
import android.text.style.UpdateLayout;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        setContentView(R.layout.activity_main);
    }

    // when changing the screen orientation, all checkboxes will be unchecked
    // all images are made invissible automatically
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        CheckBox arms = (CheckBox)findViewById(R.id.checkbox_arms);
        CheckBox ears = (CheckBox)findViewById(R.id.checkbox_ears);
        CheckBox eyebrows = (CheckBox)findViewById(R.id.checkbox_eyebrows);
        CheckBox eyes = (CheckBox)findViewById(R.id.checkbox_eyes);
        CheckBox glasses = (CheckBox)findViewById(R.id.checkbox_glasses);
        CheckBox hat = (CheckBox)findViewById(R.id.checkbox_hat);
        CheckBox mouth = (CheckBox)findViewById(R.id.checkbox_mouth);
        CheckBox mustache = (CheckBox)findViewById(R.id.checkbox_mustache);
        CheckBox nose = (CheckBox)findViewById(R.id.checkbox_nose);
        CheckBox shoes = (CheckBox)findViewById(R.id.checkbox_shoes);

        arms.setChecked(false);
        ears.setChecked(false);
        eyebrows.setChecked(false);
        eyes.setChecked(false);
        glasses.setChecked(false);
        hat.setChecked(false);
        mouth.setChecked(false);
        mustache.setChecked(false);
        nose.setChecked(false);
        shoes.setChecked(false);
    }

    // checkboxes
    public void onCheckboxCLicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        // make a case for alle the different checkboxes
        // and change the visibility of that part
        switch(view.getId()){
            case R.id.checkbox_arms:
                ImageView img =  (ImageView) findViewById(R.id.image_arms);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_ears:
                img =  (ImageView) findViewById(R.id.image_ears);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_eyebrows:
                img =  (ImageView) findViewById(R.id.image_eyebrows);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_eyes:
                img =  (ImageView) findViewById(R.id.image_eyes);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_glasses:
                img =  (ImageView) findViewById(R.id.image_glasses);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_hat:
                img =  (ImageView) findViewById(R.id.image_hat);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_mouth:
                img =  (ImageView) findViewById(R.id.image_mouth);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_mustache:
                img =  (ImageView) findViewById(R.id.image_mustache);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_nose:
                img =  (ImageView) findViewById(R.id.image_nose);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox_shoes:
                img =  (ImageView) findViewById(R.id.image_shoes);
                if (checked)
                    img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
