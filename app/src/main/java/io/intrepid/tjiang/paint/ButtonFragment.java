package io.intrepid.tjiang.paint;

import android.app.Activity;
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
public class ButtonFragment extends Fragment {
    OnButtonClickedListener mCallback;

    public interface OnButtonClickedListener {
        public void onButtonSelected(int Colour);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnButtonClickedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
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
                mCallback.onButtonSelected(Color.BLUE);
            }
        });

        Button blackButton = (Button) rootView.findViewById(R.id.black_button);
        blackButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mCallback.onButtonSelected(Color.BLACK);
            }
        });

        final Button eraseButton = (Button) rootView.findViewById(R.id.erase_button);
        eraseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mCallback.onButtonSelected(Color.WHITE);
            }
        });
        return rootView;
    }
}
