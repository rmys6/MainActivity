package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView logo;
    static int derssayisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner mySpinner;
        final TextView dsayisi = (TextView)this.findViewById(R.id.textView8);
        dsayisi.setText("Ders Sayınız: ");
        System.out.println(dsayisi);
        mySpinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter languagesAdapter = ArrayAdapter.createFromResource(this,R.array.spinnerdizisi,android.R.layout.simple_spinner_item);
        languagesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(languagesAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
            String s = mySpinner.getItemAtPosition(position).toString();
                dsayisi.setText(dsayisi.getText()+ s);
                derssayisi = Integer.parseInt(s);
                //Toast.makeText(MainActivity.this,mySpinner.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {}
        });

        btn = (Button)findViewById(R.id.hesapsayfasi);
        logo = (ImageView)findViewById(R.id.imageView1);

        //Butonumuza tıklama özelliği kazandırıyoruz.
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(final View v) {
                //Ardından Intent methodunu kullanarak nereden nereye gideceğini söylüyoruz.
                Intent intocan = new Intent();
                intocan.putExtra("sayi", (String) dsayisi.toString());
                intocan.setClass(MainActivity.this,hesap.class);
                startActivity(intocan);
            }
        });

    }
}
