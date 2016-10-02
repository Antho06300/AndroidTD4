package com.example.anthony.td4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Anthony on 01/10/2016.
 */
public class TextFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    public void changerNombre( int n ) {
        ((TextView)getView().findViewById(R.id.textView2)).setText(""+n);
    }

}
