package com.example.sebastian.pliki;

import android.hardware.Camera;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class latarka extends ActionBarActivity {

    private Camera CameraObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latarka);

        Button onButton = (Button) findViewById(R.id.onButton);
        Button offButton = (Button) findViewById(R.id.offButton);
        CameraObj = Camera.open();

        onButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Camera.Parameters CamPara = CameraObj.getParameters();
                CamPara.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                CameraObj.setParameters(CamPara);
                CameraObj.startPreview();

            }
        });

        offButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CameraObj.startPreview();
                CameraObj.release();


            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_latarka, menu);
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
