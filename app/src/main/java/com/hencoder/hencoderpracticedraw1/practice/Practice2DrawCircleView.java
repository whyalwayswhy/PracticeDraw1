package com.hencoder.hencoderpracticedraw1.practice;

import static android.graphics.Paint.Style.STROKE;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private final Paint paint = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        float radius = 200F;
        // 实心圆 单位为像素
        canvas.drawCircle(300.0F, 300.0F, radius, paint);

        // 蓝色实心圆
        paint.setColor(Color.BLUE);
        canvas.drawCircle(300.0F, 800.0F, radius, paint);

        // 空心圆
        paint.setStyle(STROKE);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(800.0F, 300.0F, radius, paint);

        // 线宽为20的空心圆
        paint.setStyle(STROKE);
        paint.setStrokeWidth(20F);
        canvas.drawCircle(800.0F, 800.0F, radius, paint);
    }
}
