package com.example.sebastian.pliki;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class DrugaAktywnosc extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktywnosc);
        TextView displaymessage = (TextView) findViewById(R.id.wiadomoscwyswietlona);
        displaymessage.setText(getIntent().getExtras().getString("textmessage"));
    }

    public void NawigacjaGPS(View view){
        startActivity(new Intent(DrugaAktywnosc.this, GPS.class));
    }

    public void latarka(View view){
        startActivity(new Intent(DrugaAktywnosc.this, latarka.class));
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_druga_aktywnosc, menu);
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
