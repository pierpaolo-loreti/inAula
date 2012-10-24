package com.example.immagininasa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ImmaginiNasa extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immagini_nasa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_immagini_nasa, menu);
        return true;
    }
}
