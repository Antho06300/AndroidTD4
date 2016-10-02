package com.example.anthony.td4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Anthony on 01/10/2016.
 */

public class AFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle saveInstanceState){

        View v = inflater.inflate(R.layout.layout_a, container);
        return v;

    }



}