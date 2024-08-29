package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    private final Paint mPaint;
    private float mWidth;
    private float mHeight;

    /**
     * 这样写 用this调用 会逐层调用 最后一定会调用到初始化paint的地方
     * @param context
     */
    public Practice4DrawPointView(Context context) {
        this(context, null);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // 获取当前View的长和宽
        mWidth = (float) getMeasuredWidth();
        mHeight = (float) getMeasuredHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        float circlePointX = (mWidth / 2) - 100f;
        float rectPointX = (mWidth / 2) + 100f;
        float pointY = mHeight / 2;
        // 设置paint stroke width
        mPaint.setStrokeWidth(120);
        // 圆点
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(circlePointX, pointY, mPaint);
        // 方点  BUTT SQUARE好像没什么区别
//        mPaint.setStrokeCap(Paint.Cap.BUTT);
        mPaint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(rectPointX, pointY, mPaint);
    }
}
