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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    public void checkClicked(View v){
        CheckBox checkbox = (CheckBox) v;
        String text = checkbox.getText().toString();
        Log.d("potato", "checkClicked: ");

        if(checkbox.isChecked() == true){
            int resID = checkbox.getResources().getIdentifier(text, "id", getPackageName());
            ImageView image = (ImageView) findViewById(resID);
            image.setVisibility(View.VISIBLE);
        }
        else{
            int resID = checkbox.getResources().getIdentifier(text, "id", getPackageName());
            ImageView image = (ImageView) findViewById(resID);
            image.setVisibility(View.INVISIBLE);
        }
    }
}
