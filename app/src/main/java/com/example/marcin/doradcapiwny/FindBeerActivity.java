package com.example.marcin.doradcapiwny;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    //private boolean czyKlikniete = false;

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        //utworzenie zmiennej referencyjnej do pola tekstowego w którym będzie
        //wyświetlona propozycja piwa
        TextView tekstZListaPiwa = (TextView) findViewById(R.id.brand);

        //-----------------------------------------------------------------
        //utworzenie zmiennej referencyjnej do listy rozwijanej jako całości
        Spinner listaPiwa = (Spinner) findViewById(R.id.color);
        //pobranie jednego wpisu z listy piwa
        String rodzajPiwa = String.valueOf(listaPiwa.getSelectedItem());
        //-------------------------------------------------------------------

       //pobranie listy piw
        List<String> brandList = expert.getBrands(rodzajPiwa);
       // obiekt do tworzenia tekstów
        StringBuffer brandsFormatted = new StringBuffer();

        for (String pifko: brandList){
            brandsFormatted.append(pifko).append('\n');
        }

        tekstZListaPiwa.setText(brandsFormatted);
    }
}
