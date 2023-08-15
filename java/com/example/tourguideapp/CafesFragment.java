package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CafesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Cafe Ginger","3rd Floor, Chunmun City Mall, New Jawahar Nagar, Jalandhar, Punjab","Monday-Sunday: 11AM to 11:30PM",R.drawable.cafe_ginger));
        places.add(new Place("Berlin - All Day Cafe Bar","251, New Jawahar Nagar, Model Town, Jalandhar, Punjab","Monday-Sunday: 11AM to 11PM",R.drawable.berlin_cafe));
        places.add(new Place("The Reefer Café & Eatery","398-L, Model Town Rd, Model Town, Jalandhar, Punjab","Monday-Sunday: 11AM to 11PM",R.drawable.reefer_cafe));
        places.add(new Place("Retro Cafe","Urban Estate phase 2 road, Cheema chownk, near SBI bank, Jalandhar, Punjab","Monday-Sunday: 11AM to 11PM",R.drawable.retro_cafe));
        places.add(new Place("Cafe Brew Bunny"," Ladhewali Road, opposite Green County At Nekdil Tower, Jalandhar, Punjab","Monday-Sunday: 10AM to 10:30PM",R.drawable.cafe_brew_bunny));
        places.add(new Place("The Chocolate Room","SCO-84, Phase 2, Urban Estate phase II, Jalandhar, Punjab","Monday-Sunday: 11AM to 11PM",R.drawable.chocolate_room));
        places.add(new Place("Cafe Mango Tree","335 R, Model Town Rd, near Mata Rani Chowk, Model Town, Jalandhar, Punjab","Monday-Sunday: 12:00PM to 11:30PM",R.drawable.cafe_mango_tree));
        places.add(new Place("The Coffee bean and tea leaf","585R, Model Town, Jalandhar, Punjab","Monday-Sunday: 9:30AM to 11PM",R.drawable.coffee_bean));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
