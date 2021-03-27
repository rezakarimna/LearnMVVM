package com.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // test github
        a();
    }

    private void  a(){
        Toast.makeText(this, "github", Toast.LENGTH_SHORT).show();
    }
}