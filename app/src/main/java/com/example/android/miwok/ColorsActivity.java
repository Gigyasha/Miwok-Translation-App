package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> listOfColors=new ArrayList<Word>();
        listOfColors.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        listOfColors.add(new Word("green","chokokki",R.drawable.color_green));
        listOfColors.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        listOfColors.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        listOfColors.add(new Word("black","kululli",R.drawable.color_black));
        listOfColors.add(new Word("white","kelelli",R.drawable.color_white));
        listOfColors.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        listOfColors.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        //Adding elements into xml
//        for(int i=0;i<=listOfNumbers.size();i++){
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.numberRootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(listOfNumbers.get(i));
//        }
        //creating the object of our adapter
        //why our adapter not the predefined bcoz in the predefined adapter the view is set(that is only one textView)
        //and in our app we are using our view/layout(which combines of two text views)
        WordAdapter wordadapter = new WordAdapter(this, listOfColors,R.color.category_colors);

        //finding the list view using the id
        ListView listView = (ListView) findViewById(R.id.list_view);

        //connecting the list view with our adapter
        listView.setAdapter(wordadapter);
    }
}