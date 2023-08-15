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

public class MallsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("MBD Neopolis Mall","23, Jalandhar Cantt - Jandiala Rd, Sehdev Market, Jalandhar, Punjab","Monday-Sunday: 10AM to 10:30PM",R.drawable.mbd_mall));
        places.add(new Place("Centrum Jyoti Mall","Near Jyothi Chowk, Civil Line, Jalandhar, Punjab","Monday-Sunday: 10AM to 11PM",R.drawable.centrum_mall));
        places.add(new Place("Curo High Street Mall","66 Feet Rd, IsharPuri Colony, Mithapur, Jalandhar, Punjab ","Monday-Sunday: 10AM to 1AM",R.drawable.curo_mall));
        places.add(new Place("Reliance Mall","Opposite Govt Medical College,Choti Baradari 2,Puda,Jalandhar,Punjab","Monday-Sunday: 10AM to 10PM",R.drawable.reliance_mall));
        places.add(new Place("PPR Mall","Mithapur Rd, Ravindra Nagar, Phase 2, Urban Estate phase II, Jalandhar, Punjab","Monday-Sunday: 10AM to 11PM",R.drawable.ppr_mall));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Place currentPlace = adapter.getItem(position);
//
//                Uri heritagePlaceUri = Uri.parse(currentPlace.getPlaceUrl());
//
//                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, heritagePlaceUri);
//
//                startActivity(websiteIntent);
//            }
//        });

        return rootView;
    }
}
