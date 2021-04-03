package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> listOfPhrases=new ArrayList<Word>();
        listOfPhrases.add(new Word("Where are you going?","minto wuksus"));
        listOfPhrases.add(new Word("What is your name?","tinnә oyaase'nә"));
        listOfPhrases.add(new Word("My name is...","oyaaset..."));
        listOfPhrases.add(new Word("How are you feeling?","michәksәs?"));
        listOfPhrases.add(new Word("I’m feeling good.","kuchi achit"));
        listOfPhrases.add(new Word("Are you coming?","әәnәs'aa?"));
        listOfPhrases.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        listOfPhrases.add(new Word("I’m coming.","әәnәm"));
        listOfPhrases.add(new Word("Let’s go.","yoowutis"));
        listOfPhrases.add(new Word("Come here.","әnni'nem"));
        //Adding elements into xml
//        for(int i=0;i<=listOfNumbers.size();i++){
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.numberRootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(listOfNumbers.get(i));
//        }
        //creating the object of our adapter
        //why our adapter not the predefined bcoz in the predefined adapter the view is set(that is only one textView)
        //and in our app we are using our view/layout(which combines of two text views)
        WordAdapter wordadapter = new WordAdapter(this, listOfPhrases,R.color.category_phrases);

        //finding the list view using the id
        ListView listView = (ListView) findViewById(R.id.list_view);

        //connecting the list view with our adapter
        listView.setAdapter(wordadapter);
    }
}