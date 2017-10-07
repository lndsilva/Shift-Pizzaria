package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.fiap.pizzaria.Model.Pedido;

public class PedidoFinalizadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_finalizado);

        if (getIntent() != null) {
            Pedido meuPedido = getIntent().getParcelableExtra(Constants.KEY_MEU_PEDIDO);
            Log.i("TIPOPAGAMENTO", meuPedido.getTipoPagamento());

        }
    }
}
