package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Ikhsan on 12/10/2017.
 */

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "List Numbers", Toast.LENGTH_SHORT).show();
    }
}
