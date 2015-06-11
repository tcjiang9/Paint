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
    private Paint testPaint = initPaint();
    private float x;
    private float y;
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
    public boolean onTouchEvent(MotionEvent event){
        x = event.getX();
        y = event.getY();
        storageCanvas.drawCircle(x, y, 10.0f, testPaint);
        invalidate(); //causes onDraw() to be called again
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(storageBitMap, identityMatrix, testPaint);
    }

    private Paint initPaint() {
        Paint testPaint = new Paint();
        testPaint.setColor(Color.BLUE);
        testPaint.setStrokeWidth(10.0f);
        testPaint.setStyle(Paint.Style.FILL);
        return testPaint;
    }
}
