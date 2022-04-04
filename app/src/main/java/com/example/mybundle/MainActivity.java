package com.example.mybundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button btkSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btkSend = findViewById(R.id.buttonSend);

        btkSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,manghinh2a.class);

                // truyen kieu mang
                String[] arrayVE = {"C","Q","B","D"};
                intent.putExtra("VE",arrayVE);
                // truyen chuoi
                intent.putExtra("dulieu","noi dung chuoi");
                // truyen so
                intent.putExtra("nam",2017);
                // truyen doi tuong
                MoTa moTa = new MoTa("CAM",2);
                intent.putExtra("MotA", moTa);
                // bundle

                MoTa moTa1 = new MoTa("Hung",50);

                String[] arrayName = {"Nguyen Duc A","Nguyen Duc B","Nguyen Duc C"};
                Bundle bundle = new Bundle();
                bundle.putString("Name","Nguyen Duc Hung");
                bundle.putInt("Number",22);
                bundle.putStringArray("NameAll",arrayName);
                bundle.putSerializable("Motaa",moTa1);

                intent.putExtra("DuLieu",bundle);

                startActivity(intent);


            }
        });


    }
}