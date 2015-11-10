package com.example.jini.barcode;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jini on 2015-11-10.
 */
public class Statistic extends Fragment {
    public Statistic newInstance(){
        Statistic fragment = new Statistic();
        return fragment;
    }


    public Statistic() {

// Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.statistic,container,false);

        return rootView;
    }
}
