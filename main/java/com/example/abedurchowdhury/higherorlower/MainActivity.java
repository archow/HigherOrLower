package com.example.abedurchowdhury.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int myNumber;

    public void generateNumber() {
        myNumber = rand.nextInt(20) + 1;
    }

    public void guessFunction(View view) {
        EditText numberEdit = (EditText) findViewById(R.id.number_edit);
        int userNumber = Integer.parseInt(numberEdit.getText().toString());

        if (userNumber < myNumber) {
            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else if (userNumber>myNumber) {
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "You won! Play again? I picked a new number", Toast.LENGTH_LONG).show();
            generateNumber();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNumber = rand.nextInt(20) + 1;
    }
}
