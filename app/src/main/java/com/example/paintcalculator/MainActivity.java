package com.example.paintcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private com.example.paintcalculator.InteriorRoom room;
private TextView gallonsView;
private EditText lengthET;
private EditText widthET;
private EditText heightET;
private EditText numDoorET;
private EditText numWindowsET;
private TextView surfaceAreaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        room = new com.example.paintcalculator.InteriorRoom();
        lengthET = (EditText) findViewById(R.id.editTextLength);
        widthET = (EditText) findViewById(R.id.editTextWidth);
        heightET = (EditText) findViewById(R.id.editTextHeight);
        numDoorET = (EditText) findViewById(R.id.editTextNumDoors);
        numWindowsET = (EditText) findViewById(R.id.editTextNumWindows);
        gallonsView = (TextView)findViewById(R.id.gallons_text);
        surfaceAreaView = (TextView)findViewById((R.id.surface_area_text));
    }
    public void getHelp(View view) {
        Intent helpIntent = new Intent(com.example.paintcalculator.MainActivity.this, HelpActivity.class);
        startActivity(helpIntent);
    }
    public void computeGallons(View view){
        room.setLength(Double.valueOf(lengthET.getText().toString()));
        room.setWidth(Double.valueOf(widthET.getText().toString()));
        room.setHeight(Double.valueOf(heightET.getText().toString()));
        room.setNumDoors(Integer.valueOf(numDoorET.getText().toString()));
        room.setNumWindows(Integer.valueOf(numWindowsET.getText().toString()));
        int area = (int) room.getPaintArea();;
        int gal = room.getGallons();
        gallonsView.setText(String.valueOf(gal) + " gallons");
        surfaceAreaView.setText(String.valueOf(area) + " square feet");
    }
}