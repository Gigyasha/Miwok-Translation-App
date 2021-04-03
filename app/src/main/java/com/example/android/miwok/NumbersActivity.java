package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //List of Objects
        ArrayList<Word> listOfNumbers=new ArrayList<Word>();
        listOfNumbers.add(new Word("One","lutti",R.drawable.number_one));
        listOfNumbers.add(new Word("Two","otiiko",R.drawable.number_two));
        listOfNumbers.add(new Word("Three","tolookosu",R.drawable.number_three));
        listOfNumbers.add(new Word("Four","oyyisa",R.drawable.number_four));
        listOfNumbers.add(new Word("Five","massokka",R.drawable.number_five));
        listOfNumbers.add(new Word("Six","temmokka",R.drawable.number_six));
        listOfNumbers.add(new Word("Seven","kenekaku",R.drawable.number_seven));
        listOfNumbers.add(new Word("Eight","kawinta",R.drawable.number_eight));
        listOfNumbers.add(new Word("Nine","wo’e",R.drawable.number_nine));
        listOfNumbers.add(new Word("Ten","na’aacha",R.drawable.number_ten));

        //Adding elements into xml
//        for(int i=0;i<=listOfNumbers.size();i++){
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.numberRootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(listOfNumbers.get(i));
//        }
        //creating the object of our adapter
        //why our adapter not the predefined bcoz in the predefined adapter the view is set(that is only one textView)
        //and in our app we are using our view/layout(which combines of two text views)
        WordAdapter wordadapter = new WordAdapter(this, listOfNumbers,R.color.category_numbers);

        //finding the list view using the id
        ListView listView = (ListView) findViewById(R.id.list_view);

        //connecting the list view with our adapter
        listView.setAdapter(wordadapter);

    }
}