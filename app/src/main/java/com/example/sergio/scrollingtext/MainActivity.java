package com.example.sergio.scrollingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //4.3 menu and pickers ejercicio
        TextView article_text = findViewById(R.id.article);
        registerForContextMenu(article_text);
        //############################
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this,"Hola que tal!Me has girado????",Toast.LENGTH_LONG).show();
        // solo para comprobar que al girarse aparece el toast!!!

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_edit:
                displayToast("Edit choice clicked.");
                return true;
            case R.id.context_share:
                displayToast("Share choice clicked.");
                return true;
            case R.id.context_delete:
                displayToast("Delete choice clicked.");
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    // mostrar toast para las opciones
    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();;
    }



    public void mostrarToast(View view) {
    Toast.makeText(this,"Hola que tal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",Toast.LENGTH_LONG).show();//solo info

    }


}
