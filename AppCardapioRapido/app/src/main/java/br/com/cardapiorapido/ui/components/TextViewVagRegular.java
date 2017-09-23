package br.com.cardapiorapido.ui.components;

/**
 * Created by Usuário on 9/18/2017.
 */

import android.content.Context;
import android.util.AttributeSet;

public class TextViewVagRegular extends android.support.v7.widget.AppCompatTextView {

    public TextViewVagRegular(Context context) {
        super(context);
        setTypeface(context);
    }

    public TextViewVagRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public TextViewVagRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        setTypeface(FontCache.get("fonts/VAG-Rounded-Light.ttf", context));
    }
}