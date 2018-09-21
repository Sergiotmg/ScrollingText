package com.example.sergio.scrollingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarToast(View view) {
        Toast.makeText(this,"Hola que tal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",Toast.LENGTH_LONG).show();//solo info

    }
}
