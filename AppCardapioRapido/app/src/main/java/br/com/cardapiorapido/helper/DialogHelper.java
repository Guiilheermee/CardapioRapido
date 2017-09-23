package br.com.cardapiorapido.helper;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import java.io.Serializable;

/**
 * Created by Usuário on 9/21/2017.
 */

public class DialogHelper implements Serializable, Parcelable {
    public static final Creator<DialogHelper> CREATOR = new Creator<DialogHelper>() {
        @Override
        public DialogHelper createFromParcel(Parcel in) {
            return new DialogHelper(in);
        }

        @Override
        public DialogHelper[] newArray(int size) {
            return new DialogHelper[size];
        }
    };
    private String title, message, btnYes, btnNo;
    private View.OnClickListener actionYes, actionNo;
    private int imgId;

    public DialogHelper() {
    }

    protected DialogHelper(Parcel in) {
        title = in.readString();
        message = in.readString();
        btnYes = in.readString();
        btnNo = in.readString();
        imgId = in.readInt();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBtnYes() {
        return btnYes;
    }

    public void setBtnYes(String btnYes) {
        this.btnYes = btnYes;
    }

    public String getBtnNo() {
        return btnNo;
    }

    public void setBtnNo(String btnNo) {
        this.btnNo = btnNo;
    }

    public View.OnClickListener getActionYes() {
        return actionYes;
    }

    public void setActionYes(View.OnClickListener actionYes) {
        this.actionYes = actionYes;
    }

    public View.OnClickListener getActionNo() {
        return actionNo;
    }

    public void setActionNo(View.OnClickListener actionNo) {
        this.actionNo = actionNo;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(title);
        dest.writeString(message);
        dest.writeString(btnYes);
        dest.writeString(btnNo);
        dest.writeInt(imgId);
    }
}
