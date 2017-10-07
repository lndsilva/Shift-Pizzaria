package br.com.fiap.pizzaria.Model;

import java.util.List;

/**
 * Created by logonrm on 07/10/2017.
 */

public class Pedido {

    private List<String> sabor;
    private String tamanho;
    private String tipoPagamento;

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
