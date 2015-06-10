package io.intrepid.tjiang.paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by tjiang on 6/9/15.
 */
public class PaintView extends View {

    Bitmap b = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
    Canvas c = new Canvas(b);
    //init paint to blue
    Paint testPaint = initPaint();

    public PaintView(Context context) {
        super(context);
    }

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        float x = event.getX();
        float y = event.getY();



        return true;
    }

    /*@Override
    protected void onDraw(Canvas canvas) {

    }*/

    private Paint initPaint() {
        Paint testPaint = new Paint();
        testPaint.setColor(Color.BLUE);
        return testPaint;
    }




}
