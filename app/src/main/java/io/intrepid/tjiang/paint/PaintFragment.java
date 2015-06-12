package io.intrepid.tjiang.paint;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */

//define custom view that matches parent.
public class PaintFragment extends Fragment {

    public PaintFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.paint_fragment_main, container, false);
        return rootView;
    }

    public void changeColour(int colour){

    }
}
