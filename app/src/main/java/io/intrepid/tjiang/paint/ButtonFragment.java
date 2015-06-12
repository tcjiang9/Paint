package io.intrepid.tjiang.paint;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by tjiang on 6/12/15.
 */
public class ButtonFragment extends Fragment{

    public interface onButtonClickedListener(){
        public void onButtonSelected(View v);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.button_fragment_main, container, false);

        /*TODO: Need to make the two fragments communicate because PaintView is in the other fragment
        in the current implementation it is null.*/
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
            }
        });

        final Button eraseButton = (Button) rootView.findViewById(R.id.erase_button);
        eraseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                paintView.changeColour(Color.WHITE);
            }
        });
        return rootView;
    }
}
