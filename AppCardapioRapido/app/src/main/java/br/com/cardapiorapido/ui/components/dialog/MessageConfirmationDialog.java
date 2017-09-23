package br.com.cardapiorapido.ui.components.dialog;

/**
 * Created by Usuário on 9/21/2017.
 */

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.helper.DialogHelper;
import br.com.cardapiorapido.service.StateChanger;

public class MessageConfirmationDialog extends AbstractDialogFragment {
    @Inject
    Dialog dialog;
    @Inject
    StateChanger<ApplicationState> stateChanger;

    public MessageConfirmationDialog() {
        CardapioRapidoApplication.getApplicationComponent().inject(this);
        dialog.setOnKeyListener((arg0, keyCode, event) -> {
            // TODO Auto-generated method stub
            boolean retorno = false;
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                retorno = true;
                stateChanger.closeDialog(ApplicationState.DialogConfirmation);
            }
            return retorno;
        });
    }

    public static MessageConfirmationDialog newInstance(DialogHelper dialogHelper) {
        MessageConfirmationDialog f = new MessageConfirmationDialog();
        Bundle args = new Bundle();
        args.putSerializable("helper", dialogHelper);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        stateChanger.closeDialog(ApplicationState.DialogConfirmation);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (!dialog.isShowing()) {
            if (!dialog.getWindow().isFloating())
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            DialogHelper dialogHelper = (DialogHelper) getArguments().getSerializable("helper");
            dialog.setContentView(R.layout.layout_alert_dialog);
            dialog.setCanceledOnTouchOutside(false);
            TextView titleAlert = (TextView) dialog.findViewById(R.id.title_alert);
            TextView messageAlert = (TextView) dialog.findViewById(R.id.msg_alert);
            titleAlert.setText(dialogHelper.getTitle());
            messageAlert.setText(dialogHelper.getMessage());
            Button btnOk = (Button) dialog.findViewById(R.id.btn_alert_ok);
            btnOk.setOnClickListener(dialogHelper.getActionYes());
            dialog.show();
            dialog.getWindow().setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        }
        return dialog;
    }
}
