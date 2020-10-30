package com.e.farmsell;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
TextView register;
Button login;
RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        r1=findViewById(R.id.radio1) ;

        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Register.class);
                startActivity(i);

        login=findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    r1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            boolean checked1=r1.isChecked();
                            Intent i=new Intent(Login.this,Consumerlogin.class);
                            if(checked1)
                            {

                                startActivity(i);
                            }
                        }
                    });
                    r2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            boolean checked2=r2.isChecked() ;
                            Intent j=new Intent(Login.this,Farmerlogin.class) ;
                            if(checked2)
                            {

                                startActivity(j) ;
                            }
                        }
                    }) ;


                 }
             }) ;



            }
        });


    }

}
