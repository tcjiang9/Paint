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
import android.widget.ImageView;

/**
 * Created by tjiang on 6/9/15.
 */
public class PaintView extends ImageView {

    //init paint to blue
    Paint testPaint = initPaint();
    float x = 0.0f;
    float y = 0.0f;

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
        x = event.getX();
        y = event.getY();
        Log.v("TouchLoc", x + " ," + y);
        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(x, y, 500.0f, testPaint);
    }

    private Paint initPaint() {
        Paint testPaint = new Paint();
        testPaint.setColor(Color.BLUE);
        testPaint.setStrokeWidth(10.0f);
        testPaint.setStyle(Paint.Style.FILL);
        return testPaint;
    }
}
