package advinha.studio.com.atruco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button pontoNois;
    private TextView placarNois;

   /* private Button pontoElas;
    private TextView placarElas;
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pontoNois = (Button) findViewById(R.id.pontoNoisId);
        placarNois = (TextView) findViewById(R.id.pontoNoisId);

        //pontoElas = (Button) findViewById(R.id.pontoElas);
        //placarElas = (TextView) findViewById(R.id.placarElas);

        pontoNois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                /*  FAZER AQUI  */
            }
        });
    }
}
