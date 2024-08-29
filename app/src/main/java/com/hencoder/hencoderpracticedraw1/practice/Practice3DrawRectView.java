package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    Paint paint = new Paint();

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形
        // 画一个Fill的矩形 左 上 右 下
        /**
         * (top, left)                  (top, right)
         *    +-----------------------------+
         *    |                             |
         *    |                             |
         *    |                             |
         *    |                             |
         *    +-----------------------------+
         * (bottom, left)              (bottom, right)
         */
        canvas.drawRect(350F,300F, 750F, 700F, paint);
    }
}
