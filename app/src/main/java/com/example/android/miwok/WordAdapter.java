package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colourId;

    public WordAdapter(Activity context, ArrayList<Word> wordArrayList, int colorId){
        //layout resource id as 0 because we are inflating the layout ourselves in getView
        super(context,0,wordArrayList);
        this.colourId=colorId;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        //checking is there any view to reuse or not as convert view is the existing view that we can reuse
        //null means there is no view which we can reuse
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //get word located at this position
        Word currentWord = getItem(position);

        //finding the text view in list item
        TextView baseTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //get the base translation from the currentword
        baseTextView.setText(currentWord.getBaseTranslation());

        //finding 2nd text view and pass the value corresponding to the position
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());


        //image view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img_id);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Setting the background color dynamically
        View text_container=listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colourId);
        text_container.setBackgroundColor(color);
        return listItemView;
    }
}
