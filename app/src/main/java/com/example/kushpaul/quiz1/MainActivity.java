package com.example.kushpaul.quiz1;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, DialogActivity.class));
            }
        });
        Button btn1 =(Button)findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, AdvanceListViewActivity.class));
            }
        });
    }




    public void login(View v){
        Toast.makeText(MainActivity.this,"You Clicked Login", Toast.LENGTH_SHORT).show();


    }
}