package br.com.cardapiorapido.api;

import br.com.cardapiorapido.api.Response.RestaurantesResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Criado por Usuário em 9/15/2017.
 */

public interface MovidaAPI {
        @GET("/controller/lista_restaurantes.php")
    Observable<RestaurantesResponse> getBanners();
}
