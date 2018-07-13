package com.example.johnwick.agreggatecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nust ;
    Button fast, pieas, giki, ist, uetLahore, uetPeshawar, uetTaxila, qau, muet ;
    Button custom, comsat ;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>Aggregate Calculator</font>"));

        assign();
        allListeners() ;








    }

    void assign(){
        nust = findViewById(R.id.main_btn_next);
        fast = findViewById(R.id.main_btn_fast);
        pieas = findViewById(R.id.main_btn_pieas);
        giki = findViewById(R.id.main_btn_giki);
        ist = findViewById(R.id.main_btn_ist);
        uetLahore = findViewById(R.id.main_btn_uetLahore);
        uetPeshawar = findViewById(R.id.main_btn_uetPeshawar);
        uetTaxila = findViewById(R.id.main_btn_uetTaxila);
        qau = findViewById(R.id.main_btn_qau);
        //comsats.findViewById(R.id.main_btn_comsats);
        comsat = findViewById(R.id.main_btn_comsat);
        muet = findViewById(R.id.main_btn_muet);
        custom = findViewById(R.id.main_btn_custom);
    }

    void allListeners(){
        nust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", nust.getText().toString());
                intent.putExtra("entryTest%", 75);
                intent.putExtra("fsc%", 15);
                intent.putExtra("matric%", 10);
                startActivity(intent);
            }
        });


        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", fast.getText().toString());
                intent.putExtra("entryTest%", 50);
                intent.putExtra("fsc%", 50);
                startActivity(intent);
            }
        });




        pieas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", pieas.getText().toString());
                intent.putExtra("entryTest%", 60);
                intent.putExtra("fsc%", 25);
                intent.putExtra("matric%", 15);

                startActivity(intent);
            }
        });

        giki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", giki.getText().toString());
                intent.putExtra("entryTest%", 85);
                intent.putExtra("fsc%", 10);
                intent.putExtra("matric%", 5);

                startActivity(intent);
            }
        });
        ist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", ist.getText().toString());
                intent.putExtra("entryTest%", 40);
                intent.putExtra("fsc%", 40);
                intent.putExtra("matric%", 20);

                startActivity(intent);
            }
        });
        uetLahore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", uetLahore.getText().toString());
                intent.putExtra("entryTest%", 30);
                intent.putExtra("fsc%", 70);
                startActivity(intent);
            }
        });
        uetPeshawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", uetPeshawar.getText().toString());
                intent.putExtra("entryTest%", 50);
                intent.putExtra("fsc%", 40);
                intent.putExtra("matric%", 10);

                startActivity(intent);
            }
        });
        uetTaxila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", fast.getText().toString());
                intent.putExtra("entryTest%", 30);
                intent.putExtra("fsc%", 70);
                startActivity(intent);
            }
        });
        qau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", qau.getText().toString());
                intent.putExtra("entryTest%", 70);
                intent.putExtra("matric%", 30);

                startActivity(intent);
            }
        });
        comsat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", comsat.getText().toString());
                intent.putExtra("entryTest%", 50);
                intent.putExtra("fsc%", 40);
                intent.putExtra("matric%", 10);

                startActivity(intent);
            }
        });
        muet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", muet.getText().toString());
                intent.putExtra("entryTest%", 60);
                intent.putExtra("fsc%", 30);
                intent.putExtra("matric%", 10);

                startActivity(intent);
            }
        });
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Uni_Info_Activity.class);
                intent.putExtra("uniName", fast.getText().toString());
                intent.putExtra("entryTest%", 50);
                intent.putExtra("fsc%", 50);
                startActivity(intent);
            }
        });






        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, custom.class);
                intent.putExtra("uniName", custom.getText().toString());
                startActivity(intent);
            }
        });
    }
}
