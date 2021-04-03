package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> listOfFamilyMembers=new ArrayList<Word>();
        listOfFamilyMembers.add(new Word("father","әpә",R.drawable.family_father));
        listOfFamilyMembers.add(new Word("mother","әṭa",R.drawable.family_mother));
        listOfFamilyMembers.add(new Word("son","angsi",R.drawable.family_son));
        listOfFamilyMembers.add(new Word("daughter","tune",R.drawable.family_daughter));
        listOfFamilyMembers.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        listOfFamilyMembers.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        listOfFamilyMembers.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        listOfFamilyMembers.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        listOfFamilyMembers.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        listOfFamilyMembers.add(new Word("grandfather","paapa",R.drawable.family_grandfather));

        //Adding elements into xml
//        for(int i=0;i<=listOfNumbers.size();i++){
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.numberRootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(listOfNumbers.get(i));
//        }
        //creating the object of our adapter
        //why our adapter not the predefined bcoz in the predefined adapter the view is set(that is only one textView)
        //and in our app we are using our view/layout(which combines of two text views)
        WordAdapter wordadapter = new WordAdapter(this, listOfFamilyMembers,R.color.category_family);

        //finding the list view using the id
        ListView listView = (ListView) findViewById(R.id.list_view);

        //connecting the list view with our adapter
        listView.setAdapter(wordadapter);
    }
}