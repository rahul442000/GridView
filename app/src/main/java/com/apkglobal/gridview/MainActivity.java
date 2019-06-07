package com.apkglobal.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridView lv;
String name[]={"rahul","ram","sham","dawa"};
Integer image[]={R.drawable.aaa,R.drawable.aaa,R.drawable.aaa,R.drawable.aaa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.grid);
        Custome cs=new Custome(MainActivity.this,name,image);

        lv.setAdapter(cs);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:

                        Toast.makeText(MainActivity.this, "Hiii rahul", Toast.LENGTH_SHORT).show();

                        break;

                    case 1:

                        Toast.makeText(MainActivity.this, "Hiii ram", Toast.LENGTH_SHORT).show();

                        break;

                    case 2:

                        Toast.makeText(MainActivity.this, "Hiii sham", Toast.LENGTH_SHORT).show();

                        break;

                    case 3:

                        Toast.makeText(MainActivity.this, "Hiii dawa", Toast.LENGTH_SHORT).show();

                        break;

                }}

        });

    }

}