package com.example.jini.barcode;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

/**
 * Created by jini on 2015-11-12.
 */
public class Waterdrinking extends Fragment {
    View rootView;
    ImageButton waterdrinking_barcode;
    ImageButton waterdrinking_customizing;
    String scanContent;
    String scanFormat;
    public Waterdrinking newInstance(){
        Waterdrinking fragment = new Waterdrinking();
        return fragment;
    }


    public Waterdrinking() {

// Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsatnceState){
        rootView =  inflater.inflate(R.layout.waterdrinking,container,false);
        waterdrinking_barcode = (ImageButton)rootView.findViewById(R.id.imb_waterdriking_barcode);
        ImageView imageview = (ImageView)rootView.findViewById(R.id.img_waterdrinking);
        imageview.setImageResource(R.drawable.water_cooler_fist);
        waterdrinking_barcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator scanIntegrator = new IntentIntegrator(getActivity());
                scanIntegrator.initiateScan();
                Toast.makeText(getActivity(), "toast", Toast.LENGTH_LONG).show();
            }
        });
        waterdrinking_customizing = (ImageButton)rootView.findViewById(R.id.imb_waterdriking_customizing);
        waterdrinking_customizing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new dfragment();
                FragmentManager fm = getFragmentManager();
                dialogFragment.show(fm,"");
            }
        });
        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        TextView tv = (TextView)rootView.findViewById(R.id.tv_waterdrinking_currentwater);
        tv.setText("123");
        if(scanningResult!=null){
            scanContent = scanningResult.getContents();
            scanFormat = scanningResult.getFormatName();
            Toast.makeText(getActivity(), scanContent + "\n" + scanFormat, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getActivity(), "No scan data received!", Toast.LENGTH_SHORT).show();
        }
    }
}
