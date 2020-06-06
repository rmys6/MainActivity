package com.example.phone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hesap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hesap);

        int derssayisi = MainActivity.derssayisi;

        final EditText ort_1 = (EditText) this.findViewById(R.id.ort_1);
        final EditText ort_2 = (EditText) this.findViewById(R.id.ort_2);
        final EditText ort_3 = (EditText) this.findViewById(R.id.ort_3);
        final EditText ort_4 = (EditText) this.findViewById(R.id.ort_4);
        final EditText ort_5 = (EditText) this.findViewById(R.id.ort_5);
        final EditText ort_6 = (EditText) this.findViewById(R.id.ort_6);
        final EditText ort_7 = (EditText) this.findViewById(R.id.ort_7);
        final EditText ort_8 = (EditText) this.findViewById(R.id.ort_8);
        final EditText ort_9 = (EditText) this.findViewById(R.id.ort_9);
        final EditText ort_10 = (EditText) this.findViewById(R.id.ort_10);


        final EditText saat_1 = (EditText) this.findViewById(R.id.saat_1);
        final EditText saat_2 = (EditText) this.findViewById(R.id.saat_2);
        final EditText saat_3 = (EditText) this.findViewById(R.id.saat_3);
        final EditText saat_4 = (EditText) this.findViewById(R.id.saat_4);
        final EditText saat_5 = (EditText) this.findViewById(R.id.saat_5);
        final EditText saat_6 = (EditText) this.findViewById(R.id.saat_6);
        final EditText saat_7 = (EditText) this.findViewById(R.id.saat_7);
        final EditText saat_8 = (EditText) this.findViewById(R.id.saat_8);
        final EditText saat_9 = (EditText) this.findViewById(R.id.saat_9);
        final EditText saat_10 = (EditText) this.findViewById(R.id.saat_10);

        EditText[] saatler = new EditText[10];
        saatler[0] = saat_1;
        saatler[1] = saat_2;
        saatler[2] = saat_3;
        saatler[3] = saat_4;
        saatler[4] = saat_5;
        saatler[5] = saat_6;
        saatler[6] = saat_7;
        saatler[7] = saat_8;
        saatler[8] = saat_9;
        saatler[9] = saat_10;


        for(int i = 9 ; i > 9 - derssayisi ; i--){
            saatler[i].setVisibility(View.INVISIBLE);
        }

        Button hesapla = (Button) this.findViewById(R.id.hesapla);
        final TextView sonuc = (TextView) this.findViewById(R.id.sonuc);

        //String derssayisi = getIntent().getExtras().getString("sayi");
        //final TextView dsayi = (TextView) this.findViewById(R.id.dsayi);

        System.out.println(derssayisi);

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                float o1,o2,o3,o4,o5,o6,o7,o8,o9,o10;
                o1 = Float.parseFloat(ort_1.getText().toString());
                o2 = Float.parseFloat(ort_2.getText().toString());
                o3 = Float.parseFloat(ort_3.getText().toString());
                o4 = Float.parseFloat(ort_4.getText().toString());
                o5 = Float.parseFloat(ort_5.getText().toString());
                o6 = Float.parseFloat(ort_6.getText().toString());
                o7 = Float.parseFloat(ort_7.getText().toString());
                o8 = Float.parseFloat(ort_8.getText().toString());
                o9 = Float.parseFloat(ort_9.getText().toString());
                o10 = Float.parseFloat(ort_10.getText().toString());

                int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
                s1 = Integer.parseInt(saat_1.getText().toString());
                s2 = Integer.parseInt(saat_2.getText().toString());
                s3 = Integer.parseInt(saat_3.getText().toString());
                s4 = Integer.parseInt(saat_4.getText().toString());
                s5 = Integer.parseInt(saat_5.getText().toString());
                s6 = Integer.parseInt(saat_6.getText().toString());
                s7 = Integer.parseInt(saat_7.getText().toString());
                s8 = Integer.parseInt(saat_8.getText().toString());
                s9 = Integer.parseInt(saat_9.getText().toString());
                s10 = Integer.parseInt(saat_10.getText().toString());

                float ortalama = ((o1*s1)+(o2*s2)+(o3*s3)+(o4*s4)+(o5*s5)+(o6*s6)+(o7*s7)+(o8*s8)+(o9*s9)+(o10*s10))/(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10);
                if(ortalama > 100){
                    sonuc.setText("Yanlış değer girdiniz!!");
                }else {
                    sonuc.setText(String.valueOf(ortalama));
                }

            }
        });


    }
}
