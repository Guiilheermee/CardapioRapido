package br.com.cardapiorapido.ui.components;

/**
 * Created by Usuário on 9/18/2017.
 */


import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Created by Gustavo on 08/03/2017.
 */

public class ButtonMyriadSemiBold extends android.support.v7.widget.AppCompatButton {

    public ButtonMyriadSemiBold(Context context) {
        super(context);
        setTypeface(context);
        final AppCompatButton btn = this;
        this.setOnClickListener(v -> {
            long mLastClickTime = 0;
            if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                return;
            }
        });
    }

    public ButtonMyriadSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public ButtonMyriadSemiBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        setTypeface(FontCache.get("fonts/MyriadPro-Semibold.otf", context));
    }
}