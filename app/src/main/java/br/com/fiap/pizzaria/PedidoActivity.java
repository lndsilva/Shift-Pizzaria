package br.com.fiap.pizzaria;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pizzaria.Model.Pedido;
import butterknife.BindView;
import butterknife.BindViews;
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
    RadioGroup rgTamanhoPizza;

    @BindView(R.id.spTipoPagamento)
    Spinner spTipoPagamento;

    @BindViews({R.id.cbAtum, R.id.cbBacon, R.id.cbCalabresa, R.id.cbMussarela})
    List<CheckBox> saboresPizza;

    @BindView(R.id.loading)
    View loading;

    @BindView(R.id.iv_loading)
    ImageView iv_Loading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btFecharPedido)
    public void fecharPedido() {

        loading.setVisibility(View.VISIBLE);

        carregar();

        Pedido meuPedido = new Pedido();

        meuPedido.setTipoPagamento(spTipoPagamento.getSelectedItem().toString());

        List<String> sabores = new ArrayList<>();

        for (CheckBox sabor : saboresPizza) {
            if (sabor.isChecked()) {
                sabores.add(sabor.getText().toString());
            }
        }

        meuPedido.setSabor(sabores);

        switch (rgTamanhoPizza.getCheckedRadioButtonId()) {
            case R.id.rbTamanhoPequena:
                meuPedido.setTamanho(getString(R.string.label_pequena));
                break;
            case R.id.rbTamanhoMedia:
                meuPedido.setTamanho(getString(R.string.label_media));
                break;
            case R.id.rbTamanhoGrande:
                meuPedido.setTamanho(getString(R.string.label_grande));
                break;

        }
        /*
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
        }*/


    }

    private void carregar() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.loading);

        ImageView ivLoading = (ImageView) findViewById(R.id.iv_loading);
        ivLoading.clearAnimation();
        ivLoading.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abrirLogin = new Intent(PedidoActivity.this, PedidoFinalizadoActivity.class);
                startActivity(abrirLogin);
                finish();

            }
        }, 2000);
    }
}