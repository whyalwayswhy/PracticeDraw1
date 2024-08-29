package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private final Paint paint = new Paint();
    private final Path mPath = new Path();
    private final RectF mRect = new RectF();
    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        mRect.left = 200;
        mRect.top = 200;
        mRect.right = 400;
        mRect.bottom = 400;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mPath.addArc(200, 200, 400, 400, -225, 255);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        }
        mPath.lineTo(400, 542);
        mPath.close();
//        mPath.addCircle(300, 300, 200, Path.Direction.CW);
        canvas.drawPath(mPath, paint);

//        练习内容：使用 canvas.drawPath() 方法画心形
    }
}
