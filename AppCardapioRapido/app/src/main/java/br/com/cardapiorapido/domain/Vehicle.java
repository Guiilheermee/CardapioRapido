package br.com.cardapiorapido.domain;

import java.io.Serializable;

/**
 * Created by Usuário on 9/21/2017.
 */

public class Vehicle implements Serializable{

    private String group,url,descriptionGroup,valueTotal,descriptionVehicle;

    public Vehicle(String group, String url, String descriptionGroup, String valueTotal,String descriptionVehicle) {
        this.group = group;
        this.descriptionVehicle=descriptionVehicle;
        this.url = url;
        this.descriptionGroup = descriptionGroup;
        this.valueTotal = valueTotal;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescriptionGroup() {
        return descriptionGroup;
    }

    public void setDescriptionGroup(String descriptionGroup) {
        this.descriptionGroup = descriptionGroup;
    }

    public String getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(String valueTotal) {
        this.valueTotal = valueTotal;
    }

    public String getDescriptionVehicle() {
        return descriptionVehicle;
    }

    public void setDescriptionVehicle(String descriptionVehicle) {
        this.descriptionVehicle = descriptionVehicle;
    }
}
