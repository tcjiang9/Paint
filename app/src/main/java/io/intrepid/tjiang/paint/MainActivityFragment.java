package io.intrepid.tjiang.paint;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */

//define custom view that matches parent.
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        final PaintView paintView = (PaintView) rootView.findViewById(R.id.paint_screen_id);
        Button blueButton = (Button) rootView.findViewById(R.id.blue_button);
        blueButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                paintView.changeColour(Color.BLUE);
            }
        });

        Button blackButton = (Button) rootView.findViewById(R.id.black_button);
        blackButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                paintView.changeColour(Color.BLACK);
                Log.v("MainActivityFragment", "You clicked this button");
            }
        });
        return rootView;
    }
}
