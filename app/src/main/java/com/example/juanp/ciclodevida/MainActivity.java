package com.example.juanp.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Ejecutando onCreate", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onStart() {
        super.onStart();
        Toast.makeText(this, " Ejecutando onStart", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Ejecutando onResume", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onPause() {
        Toast.makeText(this, "Ejecutando onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Ejecutando onStop", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Ejecutando onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Ejecutando onDestroy", Toast.LENGTH_SHORT).show();
    }
}
