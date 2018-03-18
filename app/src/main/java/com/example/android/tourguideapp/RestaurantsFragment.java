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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    /**
     * This method will create a list of views in each of which there is the name of the restaurant,
     * the adress, and a picture of said restaurant.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.trois_lunes), getString(R.string.adress_troislunes), R.drawable.trois_lunes));
        words.add(new Word(getString(R.string.mere_pourcel), getString(R.string.adress_merepourcel), R.drawable.mere_pourcel));
        words.add(new Word(getString(R.string.atypique), getString(R.string.adress_atypique), R.drawable.atypique));
        words.add(new Word(getString(R.string.pub_saint_sauveur), getString(R.string.saint_sauveur), R.drawable.saint_sauveur_pub));
        words.add(new Word(getString(R.string.creperie_ahna), getString(R.string.adress_creperieahna), R.drawable.ahna_creperie));
        words.add(new Word(getString(R.string.tomate), getString(R.string.adress_tomate), R.drawable.la_tomate));
        words.add(new Word(getString(R.string.nez_rouge), getString(R.string.adress_nezrouge), R.drawable.le_nez_rouge));
        words.add(new Word(getString(R.string.dici_dela), getString(R.string.adress_dicidela), R.drawable.dici_dela));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);

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

