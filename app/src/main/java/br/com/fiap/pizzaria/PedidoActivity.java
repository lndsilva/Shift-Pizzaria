package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pizzaria.Model.Pedido;
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
    Spinner spTipoPagamento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btFecharPedido)
    public void fecharPedido() {

        Pedido meuPedido = new Pedido();

        meuPedido.setTipoPagamento(spTipoPagamento.getSelectedItem().toString());

        List<String> sabores = new ArrayList<>();

        if (cbAtum.isChecked()) {
            sabores.add(cbAtum.getText().toString());
        }
        if (cbBacon.isChecked()) {
            sabores.add(cbBacon.getText().toString());
        }
        if (cbCalabresa.isChecked()) {
            sabores.add(cbCalabresa.getText().toString());
        }
        if (cbMussarela.isChecked()) {
            sabores.add(cbMussarela.getText().toString());
        }


    }
}
