package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PedidoActivity extends AppCompatActivity {

    @BindView(R.id.cbAtum)
    CheckBox cbAtum;
    @BindView(R.id.cbBacon)
    CheckBox cbBacon;
    @BindView(R.id.cbCalabresa)
    CheckBox cbCalabresa;
    @BindView(R.id.cbMussarela)
    CheckBox cbMussarela;

    @BindView(R.id.rgTamanhoPizza)
    CheckBox rgTamanhoPizza;
    @BindView(R.id.spTipoPagamento)
    CheckBox spTipoPagamento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btFecharPedido)
    public void fecharPedido() {

    }
}
