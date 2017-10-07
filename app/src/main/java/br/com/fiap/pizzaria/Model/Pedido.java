package br.com.fiap.pizzaria.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by logonrm on 07/10/2017.
 */

public class Pedido implements Parcelable {

    private List<String> sabor;
    private String tamanho;
    private String tipoPagamento;

    public Pedido(){

    }

    protected Pedido(Parcel in) {
        sabor = in.createStringArrayList();
        tamanho = in.readString();
        tipoPagamento = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(sabor);
        dest.writeString(tamanho);
        dest.writeString(tipoPagamento);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Pedido> CREATOR = new Creator<Pedido>() {
        @Override
        public Pedido createFromParcel(Parcel in) {
            return new Pedido(in);
        }

        @Override
        public Pedido[] newArray(int size) {
            return new Pedido[size];
        }
    };

    public List<String> getSabor() {
        return sabor;
    }

    public void setSabor(List<String> sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
