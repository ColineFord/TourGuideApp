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
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    /**
     * This method will create a list of views in each of which there is the name of the monument,
     * the adress, and a picture of said monument.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.tour_horloge), getString(R.string.adress_tourhorloge), R.drawable.tour_de_lhorloge));
        words.add(new Word(getString(R.string.chateau_dinan), getString(R.string.adress_chateau), R.drawable.chateau_dinan));
        words.add(new Word(getString(R.string.maison_gouverneur), getString(R.string.adress_maison_gouverneur), R.drawable.maison_gouverneur));
        words.add(new Word(getString(R.string.basilique_saint_sauveur), getString(R.string.adress_basilique), R.drawable.basilique_st_sauveur));
        words.add(new Word(getString(R.string.abbaye_lehon), getString(R.string.adress_abbaye), R.drawable.abbaye_lehon));
        words.add(new Word(getString(R.string.eglise_saint_malo), getString(R.string.adress_eglise_saint_malo), R.drawable.eglise_st_malo));
        words.add(new Word(getString(R.string.remparts), getString(R.string.adress_remparts), R.drawable.remparts));
        words.add(new Word(getString(R.string.musee_haffen), getString(R.string.adress_musee_haffen), R.drawable.yvonne_jean_haffen));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_monuments);

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
