package br.com.cardapiorapido.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.service.DialogService;
import br.com.cardapiorapido.service.StateChanger;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CardapioFragment extends AbstractFragment {
    private View mRootView;



    @Inject
    StateChanger<ApplicationState> stateChanger;

    @Inject
    DialogService dialogService;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CardapioRapidoApplication.getApplicationComponent().inject(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment_cardapio, container, false);
            ButterKnife.bind(this, mRootView);
            init();
        }
        setRetainInstance(true);
        return mRootView;
    }

    public void init() {

    }

    @OnClick(R.id.btn_ok)
    public void clickOk(){
        dialogService.showMessageConfirmation("Aguarde atendimento", "Dentro de instantes um atendente ira atende-lo. Obrigado", view -> {
            stateChanger.closeDialog(ApplicationState.DialogConfirmation);
            stateChanger.changeStateArguments(ApplicationState.RestaurantFragment,true,null,"");
        });
    }
}