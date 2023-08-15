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


public class TheaterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("PVR MBD","4th Floor, BMC Chownk Sehdev Market, MBD Neopolis mall, Jalandhar, Punjab","Monday-Sunday: 9AM to 2AM",R.drawable.pvr_mbd));
        places.add(new Place("Sarb Multiplex","Amritsar Bypass Road, Near Transport Nagar, Hari Singh Nagar, Industrial Area, Jalandhar, Punjab","Monday-Sunday: 9AM to 11:30PM",R.drawable.sarb_multiplex));
        places.add(new Place("INOX Multiplex","3rd Floor, Reliance Mall, Choti Baradari, Jalandhar, Punjab","Monday-Sunday: 9AA to 1AM",R.drawable.inox_theatre));
        places.add(new Place("PVR Friends","Old Post Office Road,Opposite Roxy Hotel,Fentonganj,Jalandhar,Punjab","Monday-Sunday: 9AM to 2AM",R.drawable.pvr_friends));
        places.add(new Place("PVR Curo","Curo High Street, 66 Feet Rd, Punjabi Bagh Extention, Jalandhar, Punjab","Monday-Sunday: 9AM to 2AM",R.drawable.pvr_curo));

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
