package com.example.lenovo.circleanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by lenovo on 3/14/2015.
 */
public class AnimateCircle extends Animation {
    int startSize;
    int targetSize;
    View view;

    public AnimateCircle(View view, int targetSize) {
        this.view = view;
        this.targetSize = targetSize;
        startSize = view.getWidth();
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int newSize = (int) (startSize + (targetSize - startSize) * interpolatedTime);
        view.getLayoutParams().width = newSize;
        view.requestLayout();
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    public boolean willChangeBounds() {
        return  true;
    }

}
