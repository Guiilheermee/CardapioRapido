package br.com.cardapiorapido.ui.ItemView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.domain.Restaurante;
import br.com.cardapiorapido.helper.UiHelper;
import br.com.cardapiorapido.service.DialogService;
import br.com.cardapiorapido.service.StateChanger;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Criado por Usuário em 9/18/2017.
 */


public class RestauranteItemView extends BaseAdapter {


    @BindView(R.id.txt_restaurant)
    TextView txtRestaurant;

    private Context mContext;

    private List<Restaurante> restaurante;

    @Inject
    DialogService dialogService;
    @Inject
    StateChanger<ApplicationState> stateChanger;

    public RestauranteItemView(Context mContext, List<Restaurante> restaurante) {
        this.mContext = mContext;
        this.restaurante = restaurante;
        CardapioRapidoApplication.getApplicationComponent().inject(this);
    }

    @Override
    public int getCount() {
        return restaurante.size();
    }

    @Override
    public Object getItem(int position) {
        return restaurante.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int i, View inflater, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = LayoutInflater.from(mContext).inflate(R.layout.item_view_restaurant, viewGroup, false);
            ButterKnife.bind(this, inflater);
            Restaurante restaurante2 = restaurante.get(i);
            //UiHelper.showPicassoImage(restaurante2.getImagem(), ivBanner, mContext);
            txtRestaurant.setOnClickListener(view -> dialogService.showMessageTwoOptions(CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.attention), restaurante2.getNome_empresa() + "\n", CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.yes),
                    CardapioRapidoApplication.getApplicationComponent().getContext().getResources().getString(R.string.no), view1 -> {
                        stateChanger.closeDialog(ApplicationState.DialogConfirmTwoOptionsMessage);
                        stateChanger.changeStateArguments(ApplicationState.CardapioFragment,false,null,"");
                    }, view12 -> {
                        stateChanger.closeDialog(ApplicationState.DialogConfirmTwoOptionsMessage);
                    }));
        }
        return inflater;
    }

}
