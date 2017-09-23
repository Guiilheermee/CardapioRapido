package br.com.cardapiorapido.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.service.DialogService;
import br.com.cardapiorapido.service.StateChanger;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CardapioFragment extends AbstractFragment {
    private View mRootView;

    @BindView(R.id.txt_group)
    TextView txtGroup;
    @BindView(R.id.txt_dailies)
    TextView txtDailies;
    @BindView(R.id.txt_protections_include)
    TextView txtProtectionsInclude;
    @BindView(R.id.txt_protections_itens)
    TextView txtProtectionsItens;
    @BindView(R.id.txt_protections)
    TextView txtProtections;
    @BindView(R.id.txt_products_add)
    TextView txtProductsAdd;
    @BindView(R.id.txt_products)
    TextView txtProducts;
    @BindView(R.id.txt_tax)
    TextView txtTax;
    @BindView(R.id.txt_value_reserve)
    TextView txtValueReserve;
    @BindView(R.id.txt_value_reserve_antecip)
    TextView txtValueReserveAntecip;
    @BindView(R.id.txt_pre_auth)
    TextView txtPreAuth;
    @BindView(R.id.txt_cpf)
    TextView txtCpfSponsor;
    @BindView(R.id.iv_status_cpf)
    ImageView ivStatusCpf;


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
        txtGroup.setText(String.format("%sAX", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.group)));
        txtDailies.setText(String.format("%s (2x R$10,00)", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.dailies)));
        txtProtectionsInclude.setText(String.format("%s: R$0,00", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.protections_includes)));
        txtProtectionsItens.setText(String.format("%s R$30,00", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.protections_and_itens)));
        txtProducts.setText("Completa (LDW) R$20,00 \nVidros Básica (WBW) R$10,00");
        txtProductsAdd.setText(String.format("%s R$10,00", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.products_add)));
        txtProducts.setText("Condutor Adicional R$7,00\nMovida Wi-Fi R$20,00\nMovida Connect R$9,90");
        txtTax.setText(String.format("%s (10#): R$12,32", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.tax_adm)));

        txtValueReserve.setText("Total R$207,20");
        txtValueReserveAntecip.setText("Total R$195,20");
        txtPreAuth.setText("R$700,00");
        txtCpfSponsor.setText("123.123.123-00");
    }

    @OnClick(R.id.btn_ok)
    public void clickOk(){
        dialogService.showMessageConfirmation("Aguarde atendimento", "Dentro de instantes um atendente ira atende-lo. Obrigado", view -> {
            stateChanger.closeDialog(ApplicationState.DialogConfirmation);
            stateChanger.changeStateArguments(ApplicationState.RestaurantFragment,true,null,"");
        });
    }
}