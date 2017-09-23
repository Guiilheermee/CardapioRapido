package br.com.cardapiorapido.api;

import br.com.cardapiorapido.config.Constants;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Criado por Usuário em 9/14/2017.
 */

public class NetworkHelper {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
        logger.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logger)
                .addInterceptor(
                        chain -> {
                            Request request;
                            request = chain.request().newBuilder()
                                    .addHeader("Content-Type", "Application/JSON")
                                    .build();
                            return chain.proceed(request);
                        }).build();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(defaultHttpClient)
                    .build();
        }
        return retrofit;
    }

    public static MovidaAPI getApiMovida() {
        return getClient(Constants.BASE_API).create(MovidaAPI.class);
    }

}
