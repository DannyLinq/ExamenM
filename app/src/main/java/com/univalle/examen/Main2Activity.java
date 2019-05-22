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
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button Calcular,Atras;
    EditText Unidad1;
    TextView Resultado;
    Double Unidad,Res;
    String val,codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado=findViewById(R.id.EtResultado);
        Calcular=findViewById(R.id.btnCalcular);
        Unidad1=findViewById(R.id.Unidad);
        Atras=findViewById(R.id.btnAtras);

        codigo=getIntent().getStringExtra("codigo");
        //Resultado.setText(codigo);

        switch (codigo){
                //Temperatura
            case "1":
                this.setTitle(R.string.btnTemperatura1);
                break;
            case "2":
                this.setTitle(R.string.btnTemperatura2);
                break;
            case "3":
                this.setTitle(R.string.btnTemperatura3);
                break;
            case "4":
                this.setTitle(R.string.btnTemperatura4);
                break;
                //Area
            case "5":
                String cuadrado=getString(R.string.btnArea1);
                SpannableStringBuilder cs = new SpannableStringBuilder(cuadrado);
                cs.setSpan(new SuperscriptSpan(), cuadrado.length()-1, cuadrado.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs.setSpan(new RelativeSizeSpan(0.75f), cuadrado.length()-1, cuadrado.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                this.setTitle(cs);
                break;
            case "6":
                String cuadrado1=getString(R.string.btnArea2);
                SpannableStringBuilder cs1 = new SpannableStringBuilder(cuadrado1);
                cs1.setSpan(new SuperscriptSpan(), 6,7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs1.setSpan(new RelativeSizeSpan(0.75f), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                this.setTitle(cs1);
                break;
            case "7":
                String cuadrado2=getString(R.string.btnArea3);
                SpannableStringBuilder cs2 = new SpannableStringBuilder(cuadrado2);
                cs2.setSpan(new SuperscriptSpan(), 6,7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs2.setSpan(new RelativeSizeSpan(0.75f), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs2.setSpan(new SuperscriptSpan(), cuadrado2.length()-1, cuadrado2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs2.setSpan(new RelativeSizeSpan(0.75f), cuadrado2.length()-1, cuadrado2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                this.setTitle(cs2);
                break;
            case "8":
                String cuadrado3=getString(R.string.btnArea4);
                SpannableStringBuilder cs3 = new SpannableStringBuilder(cuadrado3);
                cs3.setSpan(new SuperscriptSpan(), 10,11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs3.setSpan(new RelativeSizeSpan(0.75f), 10, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs3.setSpan(new SuperscriptSpan(), cuadrado3.length()-1, cuadrado3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                cs3.setSpan(new RelativeSizeSpan(0.75f), cuadrado3.length()-1, cuadrado3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                this.setTitle(cs3);
                break;

            default:
                this.setTitle(R.string.app_name);
                break;
        }
        cargarPreferencias();
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarPreferencias();
                try{
                    String aux=Unidad1.getText().toString();
                    Unidad=Double.parseDouble(aux);
                }catch (NumberFormatException nfe){}

                switch (codigo){
                    case "1":
                        Res=(Unidad*1.8)+32;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" ºF");
                        break;
                    case "2":
                        Res=(Unidad-32)/1.8;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" ºC");
                        break;
                    case "3":
                        Res=273.15+Unidad;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" ºK");
                        break;
                    case "4":
                        Res=Unidad-273.15;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" ºC");
                        break;
                    case "5":
                        Res=Unidad*10000;
                        val=String.valueOf(Res);
                        String cuadrado=val+" m2";
                        SpannableStringBuilder cs = new SpannableStringBuilder(cuadrado);
                        cs.setSpan(new SuperscriptSpan(), cuadrado.length()-1, cuadrado.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        cs.setSpan(new RelativeSizeSpan(0.75f), cuadrado.length()-1, cuadrado.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        Resultado.setText(cs);

                        break;
                    case "6":
                        Res=Unidad/10000;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Hect");
                        break;
                    case "7":
                        Res=Unidad/1000000;
                        val=String.valueOf(Res);
                        String cuadrado1=val+" km2";
                        SpannableStringBuilder cs1 = new SpannableStringBuilder(cuadrado1);
                        cs1.setSpan(new SuperscriptSpan(), cuadrado1.length()-1, cuadrado1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        cs1.setSpan(new RelativeSizeSpan(0.75f), cuadrado1.length()-1, cuadrado1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        Resultado.setText(cs1);
                        break;
                    case "8":
                        Res=Unidad*1000000;
                        val=String.valueOf(Res);
                        String cuadrado3=val+" m2";
                        SpannableStringBuilder cs3 = new SpannableStringBuilder(cuadrado3);
                        cs3.setSpan(new SuperscriptSpan(), cuadrado3.length()-1, cuadrado3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        cs3.setSpan(new RelativeSizeSpan(0.75f), cuadrado3.length()-1, cuadrado3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        Resultado.setText(cs3);
                        break;
                }
            }
        });
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void guardarPreferencias() {
        //SHARED PREFERENCES
        SharedPreferences prefs =
                getSharedPreferences("MisDatos", Context.MODE_PRIVATE);

        String UltimoNumero=Unidad1.getText().toString();

        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("Nombre",UltimoNumero);

       Unidad1.setText(UltimoNumero);

        editor.commit();

    }

    private  void cargarPreferencias(){

        SharedPreferences prefs =
                getSharedPreferences("MisDatos", Context.MODE_PRIVATE);
        String UltimoNumero = prefs.getString("Nombre","");

        Unidad1.setText(UltimoNumero);
    }
}
