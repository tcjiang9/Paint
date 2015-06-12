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
    PaintView paintView;

    public PaintFragment() {
    }

    //previously I inflated all the buttons here and set their onclick listeners
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.paint_fragment_main, container, false);
        paintView = (PaintView) rootView.findViewById((R.id.paint_screen_id));
        return rootView;
    }

    public void changePaintViewColour(int colour){
        paintView.changeColour(colour);
    }
}
