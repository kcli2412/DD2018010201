package com.example.student.dd2018010201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt3;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt3 = (Button) findViewById(R.id.button3);
        bt3.setOnClickListener(this);
        tb =findViewById(R.id.toggleButton);
        tb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                if (tb.isChecked())
                {
                    Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "目前關閉中", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void click1(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this, "Test1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Test2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button3:
                Toast.makeText(MainActivity.this, "Test3", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void clickCheck(View v)
    {
        if (tb.isChecked())
        {
            Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "目前關閉中", Toast.LENGTH_SHORT).show();
        }
    }
}
