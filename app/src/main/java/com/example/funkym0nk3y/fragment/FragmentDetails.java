package com.example.funkym0nk3y.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by FunkyM0nk3y on 9/8/15.
 */
public class FragmentDetails extends Fragment {
    TextView textUno, textDos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        textUno = (TextView) view.findViewById(R.id.textView);
        textDos = (TextView) view.findViewById(R.id.textView2);
        String fecha = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());

        textUno.setText("Load Fragment.");
        textDos.setText(fecha);

        return view;
    }
}
