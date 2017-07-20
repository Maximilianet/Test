package ru.maxim.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast toast = Toast.makeText(getApplicationContext(),"WELCOME TO PAGE #2",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickPreviousPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickImageButton(View view) {
        Toast.makeText(getApplicationContext(),"Тадам", Toast.LENGTH_SHORT).show();
    }
}
