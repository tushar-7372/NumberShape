package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {

                return true;

            } else {

                return false;

            }

        }


    }

    public void testNumber(View view)
    {
        Log.i("Info","button clicked");
        EditText editText=(EditText)findViewById(R.id.editText);
        String message;
        if(editText.getText().toString().isEmpty())
        {
            message="Enter a number,Please!";
        }
        else {
            Number mynumber = new Number();
            mynumber.number = (Integer.parseInt(editText.getText().toString()));
            message = editText.getText().toString();

            if (mynumber.isSquare() && mynumber.isTriangular()) {
                message += " is both triangular and square number";
            } else if (mynumber.isSquare()) {
                message += " is a square number";
            } else if (mynumber.isTriangular()) {
                message += " is a triangular number";
            } else {
                message += " is neither triangular nor square number";
            }
        }
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}