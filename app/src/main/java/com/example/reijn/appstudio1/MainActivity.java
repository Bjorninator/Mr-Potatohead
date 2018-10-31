package com.example.reijn.appstudio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
