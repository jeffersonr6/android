package jr.app.peschampsleague;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCarregamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carregamento);

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarActivity();
            }
        }, 2500);
    }

    private void mostrarActivity() {
        Intent i = new Intent(TelaCarregamento.this, MainActivity.class);
        startActivity(i);
        finish();
    }

}