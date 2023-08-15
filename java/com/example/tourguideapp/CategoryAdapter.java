package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context,@NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new RestaurentsFragment();
        } else if(position == 1){
            return new CafesFragment();
        } else if(position == 2){
            return new MallsFragment();
        }else if(position == 3){
            return new TheaterFragment();
        }else if(position == 4){
            return new MarketsFragment();
        }else if(position == 5){
            return new HotelsFragment();
        }else if(position == 6){
            return new GurudwaraFragment();
        }else if(position == 7){
            return new TemplesFragment();
        }else{
            return new EventsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 9;
    }


    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "Restaurents";
        }else if(position == 1){
            return "Cafes";
        }else if(position == 2){
            return "Malls";
        }else if(position == 3){
            return "Theatre";
        }else if(position == 4){
            return "Markets";
        }else if(position == 5){
            return "Hotels";
        }else if (position == 6){
            return "Gurudwaras";
        } else if (position == 7) {
            return "Temples";
        } else{
            return "Events";
        }
    }

}
