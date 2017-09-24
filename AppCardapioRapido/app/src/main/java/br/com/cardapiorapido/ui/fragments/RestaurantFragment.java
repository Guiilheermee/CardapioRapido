package br.com.cardapiorapido.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.domain.Restaurante;
import br.com.cardapiorapido.ui.ItemView.RestauranteItemView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class RestaurantFragment extends AbstractFragment {
    private View mRootView;

    @BindView(R.id.list_banners)
    ListView listBanners;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CardapioRapidoApplication.getApplicationComponent().inject(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment_restaurant, container, false);
            ButterKnife.bind(this, mRootView);
            init();
        }
        return mRootView;
    }

    public void init() {
        openCall();
    }

    public void openCall() {
        List<Restaurante>lista=new ArrayList<>();
        Restaurante restaurante1=new Restaurante();
        restaurante1.setNome_empresa("La Ville");
        lista.add(restaurante1);

        Restaurante restaurante2=new Restaurante();
        restaurante2.setNome_empresa("RU - UFGD");
        lista.add(restaurante2);
        RestauranteItemView adapter = new RestauranteItemView(getContext(), lista);

        listBanners.setAdapter(adapter);
    /*    NetworkHelper.getApiMovida().getBanners().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(bannerResponse -> {
                            if (bannerResponse.isSuccess()) {
                                bannerResponse.getRestaurantes().add(bannerResponse.getRestaurantes().get(0));
                                bannerResponse.getRestaurantes().add(bannerResponse.getRestaurantes().get(0));
                                bannerResponse.getRestaurantes().add(bannerResponse.getRestaurantes().get(1));
                                bannerResponse.getRestaurantes().add(bannerResponse.getRestaurantes().get(1));
                                RestauranteItemView adapter = new RestauranteItemView(getContext(), bannerResponse.getRestaurantes());
                                listBanners.setNumColumns(bannerResponse.getRestaurantes().size());
                                listBanners.setAdapter(adapter);
                            } else
                                UiHelper.showDialog(getContext(), "", bannerResponse.getMsg(), "", null);
                        },
                        throwable ->
                                showError(throwable));*/
    }

    private void showError(Throwable error) {
        Toast.makeText(getActivity(), "ERRO" + error.getMessage(), Toast.LENGTH_LONG).show();
    }
}