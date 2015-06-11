package io.intrepid.tjiang.paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by tjiang on 6/9/15.
 */
public class PaintView extends View {
    //init paint to blue
    private int currentColour = Color.BLUE;
    private Paint testPaint = initPaint(currentColour);
    private float x;
    private float y;
    private float prevX = 0;
    private float prevY = 0;
    private Bitmap storageBitMap = Bitmap.createBitmap(
            1000,
            1000,
            Bitmap.Config.ARGB_8888);
    private Canvas storageCanvas = new Canvas(storageBitMap);
    private Matrix identityMatrix = new Matrix();

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
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        if (event.getAction() == event.ACTION_DOWN) {
            prevX = event.getX();
            prevY = event.getY();
        }
        storageCanvas.drawLine(prevX, prevY, x, y, testPaint);
        prevX = x;
        prevY = y;
        invalidate(); //causes onDraw() to be called again
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(storageBitMap, identityMatrix, testPaint);
    }

    public int getCurrentColour() {
        return currentColour;
    }

    public void changeColour(int newColour) {
        testPaint = initPaint(newColour);
    }

    private Paint initPaint(int color) {
        Paint testPaint = new Paint();
        testPaint.setColor(color);
        testPaint.setStrokeWidth(10.0f);
        testPaint.setStyle(Paint.Style.FILL);
        return testPaint;
    }
}
