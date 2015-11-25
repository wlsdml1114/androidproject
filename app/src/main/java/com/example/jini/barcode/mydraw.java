package com.example.jini.barcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jini on 2015-11-17.
 */
public class mydraw extends View {
    Paint paint;
    public mydraw(Context context) {
        super(context);
        init();
    }

    public mydraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public mydraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private  void init(){
        paint = new Paint();
        paint.setColor(Color.parseColor("#888888"));
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        final RectF rectF = new RectF();
        rectF.set(200,200,200,200);
        canvas.drawRoundRect(rectF,10,10,paint);
    }
}
