package br.com.cardapiorapido.api.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Usuário on 9/22/2017.
 */

public class DeviceRequest {
    @SerializedName(value = "DeviceIdTotem")
    private String deviceIdTotem;
    @SerializedName(value = "DeviceIdPos")
    private String deviceIdPos;

    public String getDeviceIdTotem() {
        return deviceIdTotem;
    }

    public void setDeviceIdTotem(String deviceIdTotem) {
        this.deviceIdTotem = deviceIdTotem;
    }

    public String getDeviceIdPos() {
        return deviceIdPos;
    }

    public void setDeviceIdPos(String deviceIdPos) {
        this.deviceIdPos = deviceIdPos;
    }
}
