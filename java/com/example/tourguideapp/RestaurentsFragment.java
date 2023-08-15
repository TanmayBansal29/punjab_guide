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

public class RestaurentsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Barbeque Nation","387-L, Rainbow Rd, Prakash Nagar, Model Town, Jalandhar, Punjab","Monday-Sunday: 12:00PM to 4PM\nMonday-Sunday: 6:30PM to 11PM",R.drawable.barbeque_nation));
        places.add(new Place("Shaolin","GT Rd, Near Vimpi's, B.M.C Chowk, Civil Line, Jalandhar, Punjab","Monday-Sunday: 11AM to 11PM",R.drawable.shaolin));
        places.add(new Place("The Great Kabab Factory","Sehdev Market, Jalandhar, Punjab","Monday-Sunday: 10AM to 11PM",R.drawable.kaba_factory));
        places.add(new Place("Olive grill bar &restaurant","13A Model Town Market, 1st Floor, Above Parkash Bakery, Model Town, Jalandhar, Punjab","Monday-Sunday: 10AM to 11PM",R.drawable.olive_grill));
        places.add(new Place("Tawa parat","11L Adjoining Kahlon Hospital, near Johal Market, Jalandhar, Punjab","Monday-Sunday: 11:30AM to 11PM",R.drawable.tawa_parat));
        places.add(new Place("The Garden Restaurant (TGR)","Urban Estate Phase 2 Rd, Opposite PUDA Market, Jyoti Nagar, Jalandhar, Punjab","Monday-Sunday: 11AM to 11:30PM",R.drawable.tgr));
        places.add(new Place("Food Bazar","At Madan Flour Mills Compound, Ladowali Rd, Fentonganj, Jalandhar, Punjab","Monday-Sunday: 8AM to 11PM",R.drawable.food_bazar));
        places.add(new Place("Love Italy - Lounge & Restaurant","The Regent Park Hotel, Gujral Nagar, Jalandhar, Punjab","Monday-Sunday: 11AM to 11:30PM",R.drawable.love_ital));
        places.add(new Place("Pirates of Grill","460, Guru Nanak Chowk, Shastri Nagar, Lajpat Nagar, Jalandhar, Punjab","Monday-Sunday: 11:30AM to 4PM\nMonday-Sunday: 6:30PM to 11PM",R.drawable.pirates_og_grill));
        places.add(new Place("Tripti Foods - Ambala Wale","274-R, Rainbow Rd, adj. Sanjay Karate, Model Town, Jalandhar, Punjab","Monday-Sunday: 11AM to 11PM",R.drawable.tripti_foods));

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
