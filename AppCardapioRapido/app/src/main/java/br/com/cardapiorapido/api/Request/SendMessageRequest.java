package br.com.cardapiorapido.api.Request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Usuário on 9/22/2017.
 */

public class SendMessageRequest implements Serializable {
    @SerializedName(value = "MessageType")
    private String messageType;
    @SerializedName(value = "SenderDeviceId")
    private String senderDeviceId;
    @SerializedName(value = "ClientId")
    private String clientId;
    @SerializedName(value = "Data")
    private String data;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getSenderDeviceId() {
        return senderDeviceId;
    }

    public void setSenderDeviceId(String senderDeviceId) {
        this.senderDeviceId = senderDeviceId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
