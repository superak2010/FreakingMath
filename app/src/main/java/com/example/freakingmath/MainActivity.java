package com.example.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button mtick, mcross, mplay;
    TextView mnumber1, mnumber2, mresult;
    Random mRandom, mRandom1, mRandom2;
    ArrayList<Integer> mArray, mArray2, mArray3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mplay = findViewById(R.id.play);
    mnumber1 = findViewById(R.id.number1);
    mnumber2 = findViewById(R.id.number2);
    mresult = findViewById(R.id.result);
    mtick = findViewById(R.id.tick);
    mcross = findViewById(R.id.cross);
    mRandom = new Random();
    mRandom1 = new Random();
    mRandom2 = new Random();
    mArray = new ArrayList<>();
    mArray2 = new ArrayList<>();
    mArray3 = new ArrayList<>();
    addNumberinArray();
    mplay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int index1 = mRandom.nextInt(mArray.size());
            int value1 = mArray.get(index1);
            mnumber1.setText(value1 + "");
            int index2 = mRandom1.nextInt(mArray.size());
            int value2 = mArray.get(index2);
            mnumber2.setText(value2 + "");
            addNumberinArray2();
            int index3 = mRandom2.nextInt(mArray2.size());
            int value3 = mArray2.get(index3);
            mresult.setText(value3 + "");
        }
    });
        int index1 = mRandom.nextInt(mArray.size());
        int value1 = mArray.get(index1);
        int index2 = mRandom1.nextInt(mArray.size());
        int value2 = mArray.get(index2);
        int index3 = mRandom2.nextInt(mArray2.size());
        int value3 = mArray2.get(index3);
    mtick.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int resulttick = value1 + value2;
            if (resulttick != value3) {
                Toast.makeText(MainActivity.this, "You lose.", Toast.LENGTH_SHORT).show();
                return;
            }
        }
    });
    mcross.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int resultcross = value1 + value2;
            if (resultcross == value3) {
                Toast.makeText(MainActivity.this, "You lose.", Toast.LENGTH_SHORT).show();
                return;
            }
        }
    });
    }
    private void addNumberinArray() {
        for (int i = 0; i < 10; i++) {
            mArray.add(i);
        }
    }
    private void addNumberinArray2() {
        for (int i = 0; i < 19; i++) {
            mArray2.add(i);
        }
    }
    private void addNumberinArray3() {
        for (int i = 0; i <= 0;  i++) {
            mArray3.add(i);
        }
    }
}