package com.t0rr3sp3dr0.binarydecimal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    public TextView binaryDecimal;
    public TextView resultBD;
    public EditText decimalBinary;
    public TextView resultDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binaryDecimal = (EditText) findViewById(R.id.binaryDecimal);
        resultBD = (TextView) findViewById(R.id.resultBD);
        decimalBinary = (EditText) findViewById(R.id.decimalBinary);
        resultDB = (TextView) findViewById(R.id.resultDB);
    }

    public void convert(View view) {

        binaryDecimal.setText(binaryDecimal.getText().toString()
                .replaceAll("2", "")
                .replaceAll("3", "")
                .replaceAll("4", "")
                .replaceAll("5", "")
                .replaceAll("6", "")
                .replaceAll("7", "")
                .replaceAll("8", "")
                .replaceAll("9", "")
        );
        try {
            resultBD.setText(new BigInteger(binaryDecimal.getText().toString(), 2).toString(10));
        } catch (Exception e) {
        }
        try {
            resultDB.setText(new BigInteger(decimalBinary.getText().toString(), 10).toString(2));
        } catch (Exception e) {
        }
    }
}
