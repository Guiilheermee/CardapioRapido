package br.com.cardapiorapido.di.module;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;

import java.util.HashMap;

import javax.inject.Singleton;

import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.di.ApplicationContext;
import br.com.cardapiorapido.service.DialogService;
import br.com.cardapiorapido.service.StateChanger;
import br.com.cardapiorapido.ui.MainActivitySplash;
import br.com.cardapiorapido.ui.fragments.RestaurantFragment;
import br.com.cardapiorapido.ui.fragments.CardapioFragment;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Usuário on 9/19/2017.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Application provideApplication() {
        return mApplication;
    }


    @Provides
    @Singleton
    StateChanger<ApplicationState> provideStateChanger() {
        HashMap<ApplicationState, Class> states = new HashMap<>();
        states.put(ApplicationState.CardapioFragment, CardapioFragment.class);
        states.put(ApplicationState.RestaurantFragment, RestaurantFragment.class);
        return new StateChanger<>(states);
    }

    @Provides
    @Singleton
    DialogService provideDialogService(StateChanger<ApplicationState> stateChanger) {
        return new DialogService(stateChanger);
    }

    @Provides
    @Singleton
    Dialog provideDialog(){
        return new Dialog(MainActivitySplash.getContext());
    }
}