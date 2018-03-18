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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    /**
     * This method will create a list of views in each of which there is the name of the event,
     * when and where the event takes place, and a picture of the event/event logo.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.jazz_en_place), getString(R.string.when_where_jazz), R.drawable.jazz_en_place));
        words.add(new Word(getString(R.string.fete_remparts), getString(R.string.when_where_fetedesremparts), R.drawable.fete_des_remparts));
        words.add(new Word(getString(R.string.armor_a_sons), getString(R.string.when_where_armorsons), R.drawable.armor_a_sons));
        words.add(new Word(getString(R.string.rencarts), getString(R.string.when_where_rencarts), R.drawable.rencarts));
        words.add(new Word(getString(R.string.harpes_celtiques), getString(R.string.when_where_harpesceltiques), R.drawable.harpes_celtiques));
        words.add(new Word(getString(R.string.theatre_rance), getString(R.string.when_where_theatrerance), R.drawable.theatre_en_rance));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_events);

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
