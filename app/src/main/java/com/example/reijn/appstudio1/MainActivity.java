package com.example.reijn.appstudio1;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Shoes;
    ImageView Mouth;
    ImageView Mustache;
    ImageView Hat;
    ImageView Ears;
    ImageView Arms;
    ImageView Nose;
    ImageView Glasses;
    ImageView Eyes;
    ImageView Eyebrows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arms = (ImageView) findViewById(R.id.arms);
        Nose = (ImageView) findViewById(R.id.nose);
        Glasses = (ImageView) findViewById(R.id.glasses);
        Shoes = (ImageView) findViewById(R.id.shoes);
        Hat = (ImageView) findViewById(R.id.hat);
        Ears = (ImageView) findViewById(R.id.ears);
        Mouth = (ImageView) findViewById(R.id.mouth);
        Mustache = (ImageView) findViewById(R.id.mustache);
        Eyes = (ImageView) findViewById(R.id.eyes);
        Eyebrows = (ImageView) findViewById(R.id.eyebrows);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Mouth", Mouth.getVisibility());
        outState.putInt("Mustache", Mustache.getVisibility());
        outState.putInt("Eyes", Eyes.getVisibility());
        outState.putInt("Eyebrows", Eyebrows.getVisibility());
        outState.putInt("Hat", Hat.getVisibility());
        outState.putInt("Ears", Ears.getVisibility());
        outState.putInt("Arms", Arms.getVisibility());
        outState.putInt("Nose", Nose.getVisibility());
        outState.putInt("Glasses", Glasses.getVisibility());
        outState.putInt("Shoes", Shoes.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Mouth.setVisibility(inState.getInt("Mouth"));
        Mustache.setVisibility(inState.getInt("Mustache"));
        Eyes.setVisibility(inState.getInt("Eyes"));
        Eyebrows.setVisibility(inState.getInt("Eyebrows"));
        Hat.setVisibility(inState.getInt("Hat"));
        Ears.setVisibility(inState.getInt("Ears"));
        Arms.setVisibility(inState.getInt("Arms"));
        Nose.setVisibility(inState.getInt("Nose"));
        Glasses.setVisibility(inState.getInt("Glasses"));
        Shoes.setVisibility(inState.getInt("Shoes"));

    }

    // if the checkbox get's clicked
    public void checkClicked(View v){
        CheckBox checkbox = (CheckBox) v;

        // convert the text to string
        String text = checkbox.getText().toString();
        Log.d("potato", "checkClicked: ");

        // if the checkbox is checked
        if(checkbox.isChecked() == true){

            //get the id of the checkbox
            int resID = checkbox.getResources().getIdentifier(text, "id", getPackageName());

            // change the visibility
            ImageView image = (ImageView) findViewById(resID);
            image.setVisibility(View.VISIBLE);
        }
        else{
            //get the id of the checkbox
            int resID = checkbox.getResources().getIdentifier(text, "id", getPackageName());

            // change the visibility
            ImageView image = (ImageView) findViewById(resID);
            image.setVisibility(View.INVISIBLE);
        }
    }
}
