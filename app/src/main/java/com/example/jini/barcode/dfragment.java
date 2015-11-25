package com.example.jini.barcode;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jini on 2015-11-17.
 */
public class dfragment extends DialogFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate){
        View rootView = inflater.inflate(R.layout.df,container,false);
        EditText edt = (EditText)rootView.findViewById(R.id.edt_test);
        Button btn = (Button)rootView.findViewById(R.id.btn_test);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Canvas canvas = new Canvas();
                mydraw draw = new mydraw(getActivity().getApplicationContext());
                getDialog().dismiss();
            }
        });
        return rootView;
    }
}
