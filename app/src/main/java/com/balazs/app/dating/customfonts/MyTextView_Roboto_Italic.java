package com.balazs.app.dating.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * DatingApp
 * https://github.com/quintuslabs/DatingApp
 * Created on 25-sept-2018.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public class MyTextView_Roboto_Italic extends TextView {

    public MyTextView_Roboto_Italic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_Roboto_Italic(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_Roboto_Italic(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Italic.ttf");
            setTypeface(tf);
        }
    }

}