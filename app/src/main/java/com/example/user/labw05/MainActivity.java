package com.example.user.labw05;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView katya;
    Button olesya;
    int i = 1;
    int j = 0;
    double x = 0;
    double y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        katya = (TextView) findViewById(R.id.textView);
        olesya = (Button) findViewById(R.id.button);

        olesya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                x = (Math.random() * 90);
                y = (Math.random() * 120);
                olesya.setX((float) x);
                olesya.setY((float) y);
                j++;
                katya.setText("Кнопка была нажата " + j + " раз!");
                if (i == 1) {
                    katya.setHeight(60);
                    katya.setWidth(200);
                    katya.setTextColor(Color.BLUE);
                    katya.setBackgroundColor(Color.YELLOW);
                }else {
                    katya.setHeight(40);
                    katya.setWidth(220);
                    katya.setTextColor(Color.RED);
                    katya.setBackgroundColor(Color.GREEN);
                }
                i = i * (-1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
