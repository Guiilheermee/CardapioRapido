package br.com.cardapiorapido.di;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Usuário on 9/19/2017.
 */


@Qualifier
@Retention(RUNTIME)
public @interface ApplicationContext {
}