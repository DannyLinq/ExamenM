package com.univalle.examen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Temperatura
    Button btnCelciusFahren,btnFahrenCelcius,btnFahrenKelvin,btnCelciusKelvin;
    //Area
    Button btnHectMet2,btnMet2Hect,btnMet2Kil2,btnKil2Met2;
    String cuadrado,cuadrado1,cuadrado2,cuadrado3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCelciusFahren=findViewById(R.id.btnCenFah);
        btnFahrenCelcius=findViewById(R.id.btnFahCen);
        btnFahrenKelvin=findViewById(R.id.btnFahKel);
        btnCelciusKelvin=findViewById(R.id.btnCenKel);

        try{
            btnHectMet2=findViewById(R.id.btnHectMet);
            cuadrado=btnHectMet2.getText().toString();
            SpannableStringBuilder cs = new SpannableStringBuilder(cuadrado);
            cs.setSpan(new SuperscriptSpan(), 17, 18, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs.setSpan(new RelativeSizeSpan(0.75f), 17, 18, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            btnHectMet2.setText(cs);


            btnMet2Hect=findViewById(R.id.btnMetHect);
            cuadrado1=btnMet2Hect.getText().toString();
            SpannableStringBuilder cs1 = new SpannableStringBuilder(cuadrado1);
            cs1.setSpan(new SuperscriptSpan(), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs1.setSpan(new RelativeSizeSpan(0.75f), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            btnMet2Hect.setText(cs1);


            btnMet2Kil2=findViewById(R.id.btnmetKil);
            cuadrado2=btnMet2Kil2.getText().toString();
            SpannableStringBuilder cs2 = new SpannableStringBuilder(cuadrado2);
            cs2.setSpan(new SuperscriptSpan(), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs2.setSpan(new RelativeSizeSpan(0.75f), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs2.setSpan(new SuperscriptSpan(), cuadrado2.length()-1, cuadrado2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs2.setSpan(new RelativeSizeSpan(0.75f), cuadrado2.length()-1, cuadrado2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            btnMet2Kil2.setText(cs2);


            btnKil2Met2=findViewById(R.id.btnKilMet);
            cuadrado3=btnKil2Met2.getText().toString();
            SpannableStringBuilder cs3 = new SpannableStringBuilder(cuadrado3);
            cs3.setSpan(new SuperscriptSpan(), 10, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs3.setSpan(new RelativeSizeSpan(0.75f), 10, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs3.setSpan(new SuperscriptSpan(), cuadrado3.length()-1, cuadrado3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            cs3.setSpan(new RelativeSizeSpan(0.75f), cuadrado3.length()-1, cuadrado3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            btnKil2Met2.setText(cs3);
        }catch (Exception e){}



        //Temperatura
        btnCelciusFahren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","1");
                startActivity(intent);
                finish();
            }
        });
        btnFahrenCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","2");
                startActivity(intent);
                finish();
            }
        });
        btnFahrenKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","3");
                startActivity(intent);
                finish();
            }
        });

        btnCelciusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","4");
                startActivity(intent);
                finish();
            }
        });

        //Area

        btnHectMet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","5");
                startActivity(intent);
                finish();
            }
        });
        btnMet2Hect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","6");
                startActivity(intent);
                finish();
            }
        });
        btnMet2Kil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","7");
                startActivity(intent);
                finish();
            }
        });
        btnKil2Met2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","8");
                startActivity(intent);
                finish();
            }
        });
    }
}
