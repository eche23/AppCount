package eche2312.gmail.com.appcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button boton1;
    private int numero;

    public class MyButtonLitener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            numero++;
            display.setText(numero+"");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button) findViewById(R.id.boton1);
        display = (TextView) findViewById(R.id.display);
        numero=0;
        boton1.setOnClickListener(new MyButtonLitener());
    }


}
