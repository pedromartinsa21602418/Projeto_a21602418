package pt.ulp.ei.projeto_a21602418;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AtividadeCalculoIUC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_calculo_iuc);
    }

    public void calcularIUC(View view) {
        RadioGroup radioGroupCilindrada = findViewById(R.id.RadioGroupCilindrada);

        int cilindrada = radioGroupCilindrada.getCheckedRadioButtonId();

        RadioGroup radioGroupCO2 = findViewById(R.id.RadioGroupCO2);

        int co2 = radioGroupCO2.getCheckedRadioButtonId();

        if (cilindrada != -1 && co2 != -1) {

            Double precoCilindrada = 0.0;

            switch (cilindrada) {
                case R.id.radioButtonCilindrada1:
                    precoCilindrada = 33.10;
                    break;
                case R.id.radioButtonCilindrada2:
                    precoCilindrada = 66.50;
                    break;
                case R.id.radioButtonCilindrada3:
                    precoCilindrada = 133.01;
                    break;
                case R.id.radioButtonCilindrada4:
                    precoCilindrada = 455.30;
                    break;
                default:
                    break;
            }

            Double precoCO2 = 0.0;

            switch (co2) {
                case R.id.radioButtonCO21:
                    precoCO2 = 57.0;
                    break;
                case R.id.radioButtonCO22:
                    precoCO2 = 86.0;
                    break;
                case R.id.radioButtonCO23:
                    precoCO2 = 187.0;
                    break;
                case R.id.radioButtonCO24:
                    precoCO2 = 321.0;
                    break;
                default:
                    break;
            }

            Double resultado = precoCilindrada + precoCO2;


            TextView textViewResultado = findViewById(R.id.textViewResultadoIUC);
            textViewResultado.setText(resultado.toString());

        } else {

            //Mensagem de Alerta

            AlertDialog.Builder errorAlertDialog = new AlertDialog.Builder(this);

            errorAlertDialog.setTitle("Valores em falta!");

            errorAlertDialog.setMessage("Um ou mais dos valores não estão selecionados, tente " +
                    "novamente com outros valores");

            errorAlertDialog.show();
        }




    }
}
