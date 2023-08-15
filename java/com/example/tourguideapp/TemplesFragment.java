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

public class TemplesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Devi Talab Mandir","The temple is devoted to Goddess Durga and is visited by thousands of pilgrims every year. It is regarded as one of the 51 Shakti Pithas in India","Tanda Rd, Shiv Nagar, Industrial Area, Jalandhar, Punjab","Monday-Sunday: 5AM to 10PM", R.drawable.devi_talab_mandir));
        places.add(new Place("Shri Siddh Baba Sodal Mandir","The temple’s deity is Baba Sodal and is worshipped by over millions of Pilgrims. Every year on Anant Chodas, also known as Anant Chaturdashi a fair is held at Sodal Temple ","Shiv Nagar, Industrial Area, Jalandhar, Punjab","Monday-Sunday: 7AM to 8PM", R.drawable.sodal_madir));
        places.add(new Place("Geeta Mandir","Geeta Mandir is dedicated to Lord Krishna ant the temple contains a Gorgeous statue of Radha Krishna . The temple is Crowded during Janmastami festival.","476 R, Model Town, Jalandhar, Punjab","Monday-Sunday: 5AM to 9:30PM", R.drawable.geeta_mandir));
        places.add(new Place("Shri Mahalakshmi Mandir","NIL","Jail Rd, Adarsh Nagar, Jalandhar, Punjab","Monday-Sunday: 5AM to 10PM", R.drawable.mahalakshmi_temple));
        places.add(new Place("Mata Chintapurni Temple","The temple houses the Chintpurni shakti peeth (Chhinnamastika shakti peeth). The legend behind the Shakti Peetha is part of the Shaktism tradition which tells the story of the self-immolation of the goddess Sati.","Neela Mahal, Jalandhar, Punjab","Monday-Sunday: 5AM to 10PM", R.drawable.chintapurni_mandir));
        places.add(new Place("Sheetla Mata Mandir","NIL","Circular Road, Charanjit Pura Mohalla, Jatpura, Jalandhar, Punjab, ","Summer: Monday-Sunday: 5AM to 11PM \n Winter: Monday-Sunday: 6AM to 10PM", R.drawable.sheetla_mata_mandir));
        places.add(new Place("Brij Dham","A divine haven adorned with intricate carvings, housing Lord Krishna's idol. A tranquil abode for prayers, festivals, and spiritual reflection, uniting devotees in love and devotion.","Behind CRPF Camp, Kartarpur, Jalandar, Lidhran, Punjab","Monday-Sunday: 8AM to 12PM\nMonday-Sunday: 4PM to 8PM", R.drawable.brij_dham));
        places.add(new Place("Ayappa Temple","The temple is devoted to Lord Ayyappa who, according to lore, is the son of Lord Shiva and Mohini, the feminine incarnation of Lord Vishnu","Jalandhar Bypass Road, Guru Gobind Singh Avenue, Jalandhar, Punjab","Monday-Sunday: 5PM to 9PM", R.drawable.ayappa_temple));
        places.add(new Place("Akshardham Temple","The exquisite temple is dedicated to Swaminarayan, an Indian yogi and spiritual soul who existed during the 18th century.Akshardham is known for its aesthetic beauty, unique exhibitions, sprawling campus, and tranquillity","Grand Trunk Rd, Surya Enclave, Jalandhar, Punjab ","Monday-Sunday: 7:30AM to 12PM\nMonday-Sunday: 4PM to 8PM", R.drawable.akshardham_mandir));

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
