package com.example.anj.nestclone;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

//This is the main page where the buttons call on methods through the buttons.

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)){
                Toast.makeText(this, "The permission to get BLE location data is required", Toast.LENGTH_SHORT).show();
            }else{
                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }
        }else{
            Toast.makeText(this, "Location permissions already granted", Toast.LENGTH_SHORT).show();
        }
    }

    public void nextActivity(View view){
        Intent startNewActivity = new Intent(this, DeviceControlActivity.class);



        startActivity(startNewActivity);

        Intent startNewActivity2 = new Intent(this, DeviceScanActivity.class);

        startActivity(startNewActivity2);

    }

    public void registerActivity(View view){
        Intent addNewActivity = new Intent(this, ReaderActivity.class);



        startActivity(addNewActivity);



    }

    public void loginActivity(View view){
        Intent loginNewActivity = new Intent(this, Main2Activity.class);



        startActivity(loginNewActivity);



    }

    public void storeActivity(View view){
        Intent storeNewActivity = new Intent(this, StoreActivity.class);



        startActivity(storeNewActivity);



    }
}
