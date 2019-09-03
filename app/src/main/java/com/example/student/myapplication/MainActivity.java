package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView ketqua;
    EditText soa,sob,soc;
    Button btngiai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
        btngiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                String kq ="";
                a = Integer.parseInt(soa.getText().toString());
                b = Integer.parseInt(sob.getText().toString());
                c = Integer.parseInt(soc.getText().toString());
                if(a == 0){
                    Toast.makeText(MainActivity.this, "Phuong trinh bat 2 so a phai khac 0 !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double delta;
                    delta = b*b - 4*a*c;

                    if(delta<0){
                        kq = "Phuong trinh vo nghiem !";
                    }
                    else if(delta== 0){
                        kq = "Phuong trinh co nghiem kep : x1 = x2 = "+ -b/(2*a);
                    }
                    else if (delta >0){
                        kq = "Phuong trinh co hai nghiem phan biet x1 = "+ (-b+Math.sqrt(delta))/2*a + ", x2 = " + (-b-Math.sqrt(delta))/2*a;
                    }
                }
                ketqua.setText(kq);
            }
        });
    }

    private void connectView() {
        btngiai = (Button) findViewById(R.id.btngiai);
        ketqua = (TextView) findViewById(R.id.ketqua);
        soa = (EditText) findViewById(R.id.soa);
        sob = (EditText)findViewById(R.id.sob);
        soc = (EditText) findViewById(R.id.soc);
    }
}
