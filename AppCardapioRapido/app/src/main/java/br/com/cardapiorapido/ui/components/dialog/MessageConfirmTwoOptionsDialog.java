package br.com.cardapiorapido.ui.components.dialog;

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

/**
 * Created by Usuário on 9/21/2017.
 */

public class MessageConfirmTwoOptionsDialog extends AbstractDialogFragment {

    @Inject
    Dialog dialog;
    @Inject
    StateChanger<ApplicationState> stateChanger;

    public MessageConfirmTwoOptionsDialog() {
        CardapioRapidoApplication.getApplicationComponent().inject(this);
        dialog.setOnKeyListener(new Dialog.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface arg0, int keyCode,
                                 KeyEvent event) {
                // TODO Auto-generated method stub
                boolean retorno = false;
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    retorno = true;
                    stateChanger.closeDialog(ApplicationState.DialogConfirmTwoOptionsMessage);
                }
                return retorno;
            }
        });
    }

    public static MessageConfirmTwoOptionsDialog newInstance(DialogHelper dialogHelper) {
        //if (!dialog.isShowing()) {
        MessageConfirmTwoOptionsDialog f = new MessageConfirmTwoOptionsDialog();
        Bundle args = new Bundle();
        args.putSerializable("helper", dialogHelper);
        f.setArguments(args);

        return f;
//    }
        //      else return null;

    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        stateChanger.closeDialog(ApplicationState.DialogConfirmTwoOptionsMessage);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //  dialog = new Dialog(getActivity());
        if (!dialog.isShowing()) {
            if (!dialog.getWindow().isFloating())
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            DialogHelper dialogHelper = (DialogHelper) getArguments().getSerializable("helper");
            dialog.setContentView(R.layout.layout_alert_dialog_two_options);
            dialog.setCanceledOnTouchOutside(false);
            TextView titleAlert = (TextView) dialog.findViewById(R.id.title_alert);
            TextView messageAlert = (TextView) dialog.findViewById(R.id.msg_alert);

            titleAlert.setText(dialogHelper.getTitle());
            messageAlert.setText(dialogHelper.getMessage());

            Button btnYes = (Button) dialog.findViewById(R.id.btn_alert_yes);
            btnYes.setText(dialogHelper.getBtnYes());
            btnYes.setOnClickListener(dialogHelper.getActionYes());

            Button btnNo = (Button) dialog.findViewById(R.id.btn_alert_no);
            btnNo.setText(dialogHelper.getBtnNo());
            btnNo.setOnClickListener(dialogHelper.getActionNo());
            dialog.show();
            dialog.getWindow().setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        }
        return dialog;
    }
}
