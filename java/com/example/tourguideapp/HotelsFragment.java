package com.example.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Mariton Hotel","Grand Trunk Rd, opposite Hyundai Showroom,Bunga Colony, Jalandhar Cantt,Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.mariton));
        places.add(new Place("Best Western Plus","Near BSF Chowk, Grand Trunk Rd, Jalandhar, Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.best_western));
        places.add(new Place("Radisson Jalandhar","Gt Road, BMC Chowk, Sehdev Market, Jalandhar, Punjab","Check-in time: 12:00\n Check-out time: 12:00",R.drawable.radisson));
        places.add(new Place("Ramada by Wyndham","Namdev Chowk, Grand Trunk Rd, Sehdev Market, Jalandhar, Punjab","Check-in time: 12:00\nCheck-out time: 12:00",R.drawable.ramada_1));
        places.add(new Place("Hotel President","27, Police Line Rd, opposite Big bazaar, Jawahar Nagar, Jalandhar, Punjab","Check-in time: 12:00\nCheck-out time: 12:00",R.drawable.president));
        places.add(new Place("Ramada Encore","525, New Jawahar Nagar, Civil Line, Jalandhar, Punjab", "Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.ramada_2));
        places.add(new Place("Sarovar Portico","Near, BSF Chowk, Mohyal Nagar, Jalandhar, Punjab","Check-in time: 14:00\nCheck-out time: 11:00",R.drawable.sarovar));
        places.add(new Place("The Maya Hotel","Opposite District Session Court Near BMC / Namdhari Shaheed Singh Chowk, Grand Trunk Rd, Civil Lines, Jalandhar, Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.maya_hotel));
        places.add(new Place("Fortune Avenue","296, 297, Lajpat Nagar, Jalandhar, Punjab","Check-in time: 12:00\nCheck-out time: 12:00",R.drawable.fortune_avenue));



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
