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

public class GurudwaraFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Gurudwara Nauvi Patshahi Dukh Nivaran Sahib","","20/10, Guru Teg Bahadur Nagar, GTB Nagar, Jalandhar, Punjab","Monday-Sunday: 4AM to 8:30PM",R.drawable.gurudwara_nauvi_patshahi));
        places.add(new Place("Gurudwara Shri Singh Sabha","","Model Town, Jalandhar, Punjab","Monday-Sunday: 3:30AM to 10PM",R.drawable.gurudwara_model_town));
        places.add(new Place("Gurudwara Gangsar Sahib","This holy place has been built in rememberence of the 5th Guru - SHRI GURU ARJUN DEV JI & the 6th Guru- SHRI GURU HARGOBIND SAHIB JI.","Kahlwan Rd, Mohalla Bolliwalla, Kartarpur Rural,Jalandhar, Punjab","Monday-Sunday: 12:30AM to 9PM",R.drawable.gurudwara_gangsar_sahib));
        places.add(new Place("Gurdwara Chevi Patshahi","This place marks the visit of SHRI GURU HARGOBIND SAHIB JI."," Lamba Pind Bypass Road, Lamba Pind, Jalandhar, Punjab","Monday-Sunday:3AM to 11PM",R.drawable.gurudwara_chevi_patshahi));
        places.add(new Place("Gurudwara Shri Vivah Asthan Guru Teg Bahadur Sahib Ji","MATA GUJRI JI was born to Bhai Lal Chand ji and Bishan devi ji at Village Lakhnaur in Ambala Distt. Mata Ji's father shifted to Kartarpur Sahib and this place was Mata Ji's House. Later MATA GUJRI was married to SHRI GURU TEG BAHADUR JI at this place.","Kartarpur Sahib, Jalandhar, Punjab","Monday-Sunday: 3:30AM to 10PM",R.drawable.gurudwara_shri_vivah_asthan));
        places.add(new Place("Gurudwara Thamji Sahib","This Holy place is in rememberence of Shri Guru Arjan Dev Ji. This place was presented to the 5th Guru Sahib by King Akbar in the year 1650.","Kartarpur, Jalandhar, Punjab","Monday-Sunday: 3:30AM to 10PM",R.drawable.gurudwara_thamji_sahib));
        places.add(new Place("Gurdwara Shaheed Baba Nihal Singh Ji","The Gurdwara Sahib itself is about 150 years old. Most of the people who were coming there, (singles, couples, families), had a toy aeroplane in their hands for offering at the Gurdwara Sahib, which has made it popularly known as the Hawaijahaz (Aeroplane) Gurdwara.","Jalandhar Ludhiana Road Near, Jalandhar Cantt, Talhan, Punjab","Monday-Sunday: 4:00AM to 10PM",R.drawable.talhan_sahib_gurudwara));



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
