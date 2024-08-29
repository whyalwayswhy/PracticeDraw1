package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private final Paint paint = new Paint();
    private float mWidth;

    private float mHeight;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = getMeasuredWidth();
        mHeight = getMeasuredHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        // 先画Fill的扇形
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(mWidth / 2 - 300, mHeight / 2 - 200, mHeight / 2+ 300, mHeight / 2 + 200, -110, 100, true, paint);
            canvas.drawArc(mWidth / 2 - 300, mHeight / 2 - 200, mHeight / 2+ 300, mHeight / 2 + 200, 20, 140, false, paint);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(mWidth / 2 - 300, mHeight / 2 - 200, mHeight / 2+ 300, mHeight / 2 + 200, 180, 60, false, paint);
        }
    }
}
