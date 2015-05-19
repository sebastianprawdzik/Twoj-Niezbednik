package com.example.sebastian.pliki;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class PlikiGlowny extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pliki_glowny);
    }

    public void LadujDrugaAktywnosc(View view){
        Intent intent = new Intent(new Intent(PlikiGlowny.this, DrugaAktywnosc.class));
        EditText editText = (EditText) findViewById(R.id.wiadomosc);
        String message = editText.getText().toString();
        intent.putExtra("textmessage", message);

        startActivity(intent);

    }

    public void oautorze(View view){
        Toast info = Toast.makeText(PlikiGlowny.this, "Sebastian Prawdzik - 125 NCI C", 50000);
        info.setGravity(Gravity.CENTER,0,0);
        info.show();
    }

/*    public void zamknij(View arg0){
        AlertDialog.Builder builder = new AlertDialog.Builder(PlikiGlowny.this);
        builder.setMessage("Zamknąć aplikację?");
        builder.setCancelable(true);
        builder.setPositiveButton("Tak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                PlikiGlowny.this.finish();
            }
        });
        builder.setNegativeButton()"Nie", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
    };

        AlertDialog

        */


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pliki_glowny, menu);
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
