package br.com.cardapiorapido.ui.components;

/**
 * Created by Usuário on 9/18/2017.
 */

import android.content.Context;
import android.util.AttributeSet;

public class TextViewMyriadSemiBold extends android.support.v7.widget.AppCompatTextView {

    public TextViewMyriadSemiBold(Context context) {
        super(context);
        setTypeface(context);
    }

    public TextViewMyriadSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public TextViewMyriadSemiBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        setTypeface(FontCache.get("fonts/MyriadPro-Semibold.otf", context));
    }
}