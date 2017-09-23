package br.com.cardapiorapido.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.config.ApplicationState;
import br.com.cardapiorapido.service.DialogService;
import br.com.cardapiorapido.service.StateChanger;
import butterknife.ButterKnife;

/**
 * Created by Usuário on 9/18/2017.
 */

public class MainActivitySplash extends AppCompatActivity {


    @Inject
    StateChanger<ApplicationState> stateChanger;
    @Inject
    DialogService dialogService;

    private static Context context;
    private static MainActivitySplash instance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        instance = this;
        context = this;
        CardapioRapidoApplication.getApplicationComponent().inject(this);
        stateChanger.init(getSupportFragmentManager());
        ButterKnife.bind(this);
        openIntent();
    }

    public static Context getContext() {
        return context;
    }

    public static MainActivitySplash getInstance() {
        return instance;
    }

    public void openIntent() {
        stateChanger.changeStateArguments(ApplicationState.RestaurantFragment, true, null, "");
    }

    @Override
    public void onBackPressed() {
        stateChanger.back();
    }
}
