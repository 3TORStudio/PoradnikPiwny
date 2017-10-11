package com.example.marcin.doradcapiwny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    private boolean czyKlikniete = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        //utworzenie zmiennej referencyjnej do pola tekstowego w którym będzie
        //wyświetlona propozycja piwa
        TextView tekstZListaPiwa = (TextView) findViewById(R.id.brand);
        if (!czyKlikniete){
            tekstZListaPiwa.setText("Na razie nie wiem co zaproponować");
            czyKlikniete = true;
        } else {
            tekstZListaPiwa.setText("Daj spokój. Nic nie powiem");
        }

    }
}
