package com.example.android.tallerclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private EditText cantidad;
    private TextView valorUnitario, valorTotal;
    private Spinner comboGenero, comboZapato, comboMarca;
    private String[] strGenero, strZapato, strMarca;
    private ArrayAdapter adapter_genero, adapter_zapato, adapter_marca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cantidad = (EditText)findViewById(R.id.txtCantidad);
        valorTotal = (TextView)findViewById(R.id.txtTotal);
        valorUnitario = (TextView)findViewById(R.id.txtUnitario);
        comboGenero = (Spinner)findViewById(R.id.cmbGenero);
        comboZapato=(Spinner)findViewById(R.id.cmbZapato);
        comboMarca=(Spinner)findViewById(R.id.cmbMarca);

        strGenero=this.getResources().getStringArray(R.array.strGenero);
        strZapato = this.getResources().getStringArray(R.array.strZapato);
        strMarca=this.getResources().getStringArray(R.array.strMarca);

        adapter_genero=new ArrayAdapter(this, android.R.layout.simple_list_item_1,strGenero);
        adapter_zapato=new ArrayAdapter(this, android.R.layout.simple_list_item_1,strZapato);
        adapter_marca=new ArrayAdapter(this, android.R.layout.simple_list_item_1, strMarca);

        comboGenero.setAdapter(adapter_genero);
        comboZapato.setAdapter(adapter_zapato);
        comboMarca.setAdapter(adapter_marca);
    }

    public void calcular(View v){
        int op_genero, op_zapato, op_marca;
        double cant, resultado=0;

        if (validar()){
            cant = Double.parseDouble(cantidad.getText().toString());
            op_genero=comboGenero.getSelectedItemPosition();
            op_zapato=comboZapato.getSelectedItemPosition();
            op_marca=comboMarca.getSelectedItemPosition();
            switch (op_genero){
                case 0:
                    switch (op_zapato){
                        case 0:
                            switch (op_marca){
                                case 0:
                                    resultado=120000*cant;
                                    break;
                                case 1:
                                    resultado=140000*cant;
                                    break;
                                case 2:
                                    resultado=130000*cant;
                                    break;
                            }
                            break;
                        case 1:
                            switch (op_marca){
                                case 0:
                                    resultado=50000*cant;
                                    break;
                                case 1:
                                    resultado=80000*cant;
                                    break;
                                case 2:
                                    resultado=100000*cant;
                                    break;
                            }
                            break;
                    }
                    break;
                case 1:
                    switch (op_zapato){
                        case 0:
                            switch (op_marca){
                                case 0:
                                    resultado=100000*cant;
                                    break;
                                case 1:
                                    resultado=130000*cant;
                                    break;
                                case 2:
                                    resultado=110000*cant;
                                    break;
                            }
                            break;
                        case 1:
                            switch (op_marca){
                                case 0:
                                    resultado=60000*cant;
                                    break;
                                case 1:
                                    resultado=70000*cant;
                                    break;
                                case 2:
                                    resultado=120000*cant;
                                    break;
                            }
                            break;
                    }
                    break;
            }
            valorTotal.setText(""+resultado);
            valorUnitario.setText(""+resultado/cant);
        }
    }

    public boolean validar(){
        if (cantidad.getText().toString().isEmpty()){
            cantidad.requestFocus();
            cantidad.setError("Digite una catidad");
            return false;
        }
        if (Double.parseDouble(cantidad.getText().toString())==0){
            cantidad.requestFocus();
            cantidad.setError("Digite un valor diferente de 0");
            return false;
        }
        return true;
    }

    public void borrar(View v){
        cantidad.setText("");
        valorUnitario.setText("");
        valorTotal.setText("");
        cantidad.requestFocus();
        comboGenero.setSelection(0);
        comboZapato.setSelection(0);
        comboMarca.setSelection(0);


    }
}
