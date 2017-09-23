package br.com.cardapiorapido.ui.components;

/**
 * Created by Usuário on 9/18/2017.
 */

import android.content.Context;
import android.util.AttributeSet;

public class TextViewMyriadBold extends android.support.v7.widget.AppCompatTextView {

    public TextViewMyriadBold(Context context) {
        super(context);
        setTypeface(context);
    }

    public TextViewMyriadBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public TextViewMyriadBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        setTypeface(FontCache.get("fonts/MyriadPro-Bold.otf", context));
    }
}