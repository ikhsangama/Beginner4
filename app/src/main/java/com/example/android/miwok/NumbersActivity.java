package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList <Word> words = new ArrayList<Word>();
        words.add(new Word("one", "satu"));
        words.add(new Word("two", "dua"));
        words.add(new Word("three","tiga"));
        words.add(new Word("four","empat"));
        words.add(new Word("five","lima"));
        words.add(new Word("six","enam"));
        words.add(new Word("seven","tujuh"));
        words.add(new Word("eight","delapan"));
        words.add(new Word("nine","sembilan"));
        words.add(new Word("ten","sepuluh"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        LinearLayout RootView = (LinearLayout) findViewById(R.id.rootView_id);
//
//        for (int index = 0; index < words.size(); index++ ){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            RootView.addView(wordView);
//        }
//        while (index < words.size()){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            RootView.addView(wordView);
//            index++;
//        }

    }

    public void Back_btn(View view) {
        onBackPressed();
    }
}
