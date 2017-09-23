package br.com.cardapiorapido.di.component;

import android.content.Context;

import javax.inject.Singleton;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.di.ApplicationContext;
import br.com.cardapiorapido.di.module.ApplicationModule;
import br.com.cardapiorapido.service.DialogService;
import br.com.cardapiorapido.service.StateChanger;
import br.com.cardapiorapido.ui.ItemView.RestauranteItemView;
import br.com.cardapiorapido.ui.MainActivitySplash;
import br.com.cardapiorapido.ui.components.dialog.MessageConfirmTwoOptionsDialog;
import br.com.cardapiorapido.ui.components.dialog.MessageConfirmationDialog;
import br.com.cardapiorapido.ui.fragments.RestaurantFragment;
import br.com.cardapiorapido.ui.fragments.CardapioFragment;
import dagger.Component;

/**
 * Created by Usuário on 9/19/2017.
 */
@Component(modules = {ApplicationModule.class})
@Singleton
public interface ApplicationComponent {
    StateChanger<ApplicationState> stateChanger();

    @ApplicationContext
    Context getContext();

    void inject(CardapioRapidoApplication cardapioRapidoApplication);

    void inject(DialogService dialogService);


    void inject(MainActivitySplash mainActivitySplash);

    void inject(RestauranteItemView restauranteItemView);

    void inject(RestaurantFragment restaurantFragment);
    void inject(CardapioFragment cardapioFragment);


    void inject(MessageConfirmationDialog messageConfirmationDialog);

    void inject(MessageConfirmTwoOptionsDialog messageConfirmTwoOptionsDialog);
}