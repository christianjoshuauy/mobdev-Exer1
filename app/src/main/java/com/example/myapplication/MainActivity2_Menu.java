package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity2_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity2_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch(item.getItemId()) {
            case R.id.menuItem1:
                Toast.makeText(this, "Register Menu Item is Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Activity_Registration.class);
                startActivity(intent);
                break;
            case R.id.menuItem2:
                Toast.makeText(this, "View List Menu Item is Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Activity_ListDisplay.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}