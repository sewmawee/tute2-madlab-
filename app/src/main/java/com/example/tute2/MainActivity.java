package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button btn1;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        e1 = findViewById(R.id.editText);
        e2 =findViewById(R.id.editText2);
    }


    @Override
    protected void onResume() {
        super.onResume();
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s1= e1.getText().toString();
                s2=e2.getText().toString();

                Intent intent = new  Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("val1",s1);
                intent.putExtra("val2",s2);

                startActivity(intent);
            }
        });
    }
}

