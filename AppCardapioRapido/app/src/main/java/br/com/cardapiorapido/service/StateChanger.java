package br.com.cardapiorapido.service;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;

import java.io.Serializable;
import java.util.HashMap;

import br.com.cardapiorapido.CardapioRapidoApplication;
import br.com.cardapiorapido.R;
import br.com.cardapiorapido.config.ApplicationState;

/**
 * Created by Usuário on 9/19/2017.
 */

public class StateChanger<T extends Enum> {

    private final HashMap<T, Class> fragmentMap;
    private FragmentManager mFragmentManager;
    private T estadoAtual;
    private boolean back, logout, enableBack;
    private int countLoad;

    public StateChanger(HashMap<T, Class> fragmentMap) {
        this.fragmentMap = fragmentMap;
    }

    public void closeDialog(ApplicationState state) {
        Fragment prev = this.getFragmentManager().findFragmentByTag(state.toString());
        if (prev != null) {
            this.getFragmentManager().beginTransaction().remove(prev).commitAllowingStateLoss();

        }
    }


    public void changeStateArguments(final T novoEstado, boolean shouldClearStack, Serializable arguments, String tagArgument) {
        try {
            setEnableBack(true);
            Class classeFragmento = this.fragmentMap.get(novoEstado);
            Answers.getInstance().logContentView(new ContentViewEvent()
                    .putContentName("Navegação de tela")
                    .putContentType(classeFragmento.toString()));
            Fragment fragmento = (Fragment) classeFragmento.newInstance();
            if (arguments != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(tagArgument, arguments);
                fragmento.setArguments(bundle);
            }
            if (mFragmentManager != null) {
                if (shouldClearStack) {
                    int backStackCount = mFragmentManager.getBackStackEntryCount();
                    backStackCount--;
                    for (int i = 0; i < backStackCount; i++) {
                        int backStackId = mFragmentManager.getBackStackEntryAt(i).getId();
                        mFragmentManager.popBackStack(backStackId, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    }
                }
                mFragmentManager.beginTransaction()
                        .replace(R.id.main_container, fragmento, fragmento.getClass().getSimpleName())
                        .addToBackStack(fragmento.toString())
                        .commit();
            }
            this.estadoAtual = novoEstado;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public T getCurrentState() {
        return this.estadoAtual;
    }

    public FragmentManager getFragmentManager() {
        return mFragmentManager;
    }

    private void closeApp() {
        //MainActivity.getInstance().finish();
        System.gc();
        System.exit(0);
    }

    public void back() {
        if (mFragmentManager.getBackStackEntryCount() == 1) {
            if (!back) {
                Toast.makeText(CardapioRapidoApplication.getApplicationComponent().getContext(), "Pressione o Botão Voltar novamente para fechar o Aplicativo.", Toast.LENGTH_SHORT).show();
                back = true;
            } else {
                closeApp();
            }
        } else {
            if (enableBack) {
                back = false;
                mFragmentManager.popBackStackImmediate();
            }
        }
    }

    public void init(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
    }

    public int getCountLoad() {
        return countLoad;
    }

    public void setCountLoad(int countLoad) {
        this.countLoad = countLoad;
    }

    public boolean isEnableBack() {
        return enableBack;
    }

    public void setEnableBack(boolean enableBack) {
        this.enableBack = enableBack;
    }
}
