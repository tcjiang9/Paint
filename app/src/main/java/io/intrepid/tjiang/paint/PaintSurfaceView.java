package io.intrepid.tjiang.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by tjiang on 6/11/15.
 */
public class PaintSurfaceView extends SurfaceView implements SurfaceHolder.Callback{
    SurfaceHolder surfaceHolder = getHolder();

    public PaintSurfaceView(Context context){
        super(context);
    }

    private class DrawThread extends Thread{

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas){

    }

    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
