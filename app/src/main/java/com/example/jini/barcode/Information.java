package com.example.jini.barcode;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jini on 2015-11-10.
 */
public class Information extends Fragment {
    public Information newInstance(){
        Information fragment = new Information();
        return fragment;
    }


    public Information() {

// Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.information,container,false);

        return  rootView;
    }
}
