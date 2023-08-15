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

public class MarketsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Modal Tow Market","219-l, Model Town Main Rd, Model Town, Jalandhar, Punjab","Monday-Sunday: 10AM to 9PM",R.drawable.model_town_market));
        places.add(new Place("Sanjay Gandhi Market","23, Jalandhar Cantt - Jandiala Rd, BMC Chowk, Sehdev Market, Jalandhar, Punjab","Monday-Sunday: 10AM to 9PM",R.drawable.no_image_sanjay_markte));
        places.add(new Place("Rainak Bazar","Ali Mohalla, Jalandhar, Punjab","Monday-Sunday: 10AM to 9PM",R.drawable.rainak_bazar));
        places.add(new Place("Jyoti Nagar Market","105/106, Cool Road, Jyoti Nagar, Jalandhar, Punjab","Monday-Sunday: 10AM to 11:30PM",R.drawable.jyoti_market));
        places.add(new Place("Attari Bazar Market"," Bajwa Colony, Jalandhar, Punjab","Monday-Sunday: 9AM to 8PM",R.drawable.attari_bazar));
        places.add(new Place("Shastri Market","Kamal Palace, Road, Near, Sehdev Market, Jalandhar, Punjab","Monday-Sunday: 10Am to 9PM",R.drawable.no_image_sanjay_markte));

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
