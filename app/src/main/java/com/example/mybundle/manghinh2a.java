package com.example.mybundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class manghinh2a extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manghinh2a);

        txtView = findViewById(R.id.textView);


        // nhaanj du lieu
        Intent intent = getIntent();
        //String NoiDung = intent.getStringExtra("dulieu");

        //int NoiDung = intent.getIntExtra("nam",21);

        //txtView.setText(NoiDung+"");

        //String[] arrayVEE = intent.getStringArrayExtra("VE");
        //txtView.setText(arrayVEE.length+""+arrayVEE[2]);

        //MoTa MT = (MoTa) intent.getSerializableExtra("MotA");
        //txtView.setText(MT.getTen()+"--"+MT.getKg());


        //
        Bundle bundle = intent.getBundleExtra("DuLieu");

        if (bundle!=null)
        {
            String ten = bundle.getString("N" + "ame");
            txtView.setText(ten);

            int so = bundle.getInt("Number",123);
            String[] mang = bundle.getStringArray("NameAll");

            MoTa moTa = (MoTa) bundle.getSerializable("Motaa");

            txtView.setText(ten+"\n"+so+"\n"+mang[0]+"\n"+moTa.getTen());

        }







    }
}