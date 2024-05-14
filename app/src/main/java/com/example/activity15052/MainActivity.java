package com.example.activity15052;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button button;
    ArrayList<String> Mylist;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spin);
        button = findViewById(R.id.button1278);
        Mylist = new ArrayList<>();

        Mylist.add("pargol");
        Mylist.add("subash");
        Mylist.add("dilpi");
        Mylist.add("suhas");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Mylist);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selecteditem = spinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, selecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}