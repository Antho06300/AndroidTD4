package com.example.anthony.td4;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

/**
 * Created by Anthony on 01/10/2016.
 */
public class NumberPickerFragment extends Fragment {

    public NumberPickerFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_number_picker, container, false);

        NumberPicker n = ((NumberPicker)v.findViewById(R.id.numberPicker));

        n.setMinValue(0);
        n.setMaxValue(100);

        n.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                mListener.onAction(newVal);
            }
        });

        return v;
    }

    // Container Activity must implement this kind of interface
    public interface OnActionListener {
       void onAction(int d);
    }

    OnActionListener mListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnActionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnActionListener");
        }

    }

}


