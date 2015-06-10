package io.intrepid.tjiang.paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by tjiang on 6/9/15.
 */
public class PaintView extends View {

    Bitmap b = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
    Canvas c = new Canvas(b);

    public PaintView(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent event){
        int x = event.AXIS_X;
        int y = event.AXIS_Y;
        Log.v("TouchLoc", x + ", " + y);
        return true;
    }

   /* @Override
    protected void onDraw(Canvas canvas){

    }*/




}
