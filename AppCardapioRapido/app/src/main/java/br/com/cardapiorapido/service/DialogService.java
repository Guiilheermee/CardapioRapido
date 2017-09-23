package br.com.cardapiorapido.service;

import android.view.View;

import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.helper.DialogHelper;
import br.com.cardapiorapido.ui.components.dialog.AbstractDialogFragment;
import br.com.cardapiorapido.ui.components.dialog.MessageConfirmTwoOptionsDialog;
import br.com.cardapiorapido.ui.components.dialog.MessageConfirmationDialog;

/**
 * Created by Usuário on 9/21/2017.
 */

public class DialogService {

    private final StateChanger<ApplicationState> stateChanger;

    public DialogService(StateChanger<ApplicationState> stateChanger) {
        this.stateChanger = stateChanger;
    }

    public void showMessageConfirmation(final String title, String message, View.OnClickListener listener) {
        AbstractDialogFragment classe = (AbstractDialogFragment) stateChanger.getFragmentManager().findFragmentByTag(ApplicationState.DialogConfirmation.toString());
        if (classe == null) {
            DialogHelper dialogHelper = new DialogHelper();
            dialogHelper.setMessage(message);
            dialogHelper.setTitle(title);
            dialogHelper.setActionYes(listener);
            MessageConfirmationDialog.newInstance(dialogHelper).show(stateChanger.getFragmentManager(), ApplicationState.DialogConfirmation.toString());
        }
    }

    public void showMessageTwoOptions(String title, String message, String titleYes, String titleNo, View.OnClickListener yesClickListener, View.OnClickListener noClickListener) {
        AbstractDialogFragment classe = (AbstractDialogFragment) stateChanger.getFragmentManager().findFragmentByTag(ApplicationState.DialogConfirmTwoOptionsMessage.toString());
        if (classe == null) {
            DialogHelper dialogHelper = new DialogHelper();
            dialogHelper.setMessage(message);
            dialogHelper.setTitle(title);
            dialogHelper.setBtnYes(titleYes);
            dialogHelper.setBtnNo(titleNo);
            dialogHelper.setActionYes(yesClickListener);
            dialogHelper.setActionNo(noClickListener);
            MessageConfirmTwoOptionsDialog.newInstance(dialogHelper).show(stateChanger.getFragmentManager(), ApplicationState.DialogConfirmTwoOptionsMessage.toString());
        }
    }
}
