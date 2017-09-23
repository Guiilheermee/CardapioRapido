package br.com.cardapiorapido;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.crashlytics.android.Crashlytics;

import br.com.cardapiorapido.di.component.ApplicationComponent;
import br.com.cardapiorapido.di.component.DaggerApplicationComponent;
import br.com.cardapiorapido.di.module.ApplicationModule;
import io.fabric.sdk.android.Fabric;

/**
 * Criado por Usuário em 9/15/2017.
 */

public class CardapioRapidoApplication extends MultiDexApplication {
    private static ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initLibs();
    }

    private void initLibs() {
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
        Fabric.with(this, new Crashlytics());
    }

    public static CardapioRapidoApplication get(Context context) {
        return (CardapioRapidoApplication) context.getApplicationContext();
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
