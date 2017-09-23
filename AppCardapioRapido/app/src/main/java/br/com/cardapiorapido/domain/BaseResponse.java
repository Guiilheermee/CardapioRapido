package br.com.cardapiorapido.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Criado por Usuário em 9/15/2017.
 */

public class BaseResponse<T> implements Serializable{

    private String msg;
    private boolean success;
    private T data;

    private List<Restaurante> restaurantes;

    public boolean getSuccess() {
        return success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
