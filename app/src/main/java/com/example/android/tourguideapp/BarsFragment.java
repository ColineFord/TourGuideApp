package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }

    /**
     * This method will create a list of views in each of which there is the name of the bar,
     * the adress, and a picture of said bar.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.saint_sauveur), getString(R.string.adress_saint_sauveur), R.drawable.saint_sauveur_pub));
        words.add(new Word(getString(R.string.nez_rouge), getString(R.string.adress_nez_rouge), R.drawable.le_nez_rouge));
        words.add(new Word(getString(R.string.duclos), getString(R.string.adress_duclos), R.drawable.duclos));
        words.add(new Word(getString(R.string.cafe_noir), getString(R.string.adress_cafe_noir), R.drawable.cafe_noir));
        words.add(new Word(getString(R.string.argile_et_vin), getString(R.string.adress_argile_vin), R.drawable.argile_et_vin));
        words.add(new Word(getString(R.string.enigme), getString(R.string.adress_enigme), R.drawable.lenigme));
        words.add(new Word(getString(R.string.canard_electrik), getString(R.string.adress_canard_electrik), R.drawable.canard_electrik));
        words.add(new Word(getString(R.string.zag), getString(R.string.adress_zag), R.drawable.zag));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_bars);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
