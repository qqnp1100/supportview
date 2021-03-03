package com.example.supportview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * @author xiezhiying
 * @Data 2021-03-03
 * @description
 */
public class SupportView extends FrameLayout {

    public SupportView(@NonNull Context context) {
        super(context);
        initView();
    }

    public SupportView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public SupportView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.support_view_test, this);
    }
}
