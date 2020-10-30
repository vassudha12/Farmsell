package com.e.farmsell;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
Button con,far;
CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        con=findViewById(R.id.signupbutton1) ;
        far=findViewById(R.id.signupbutton2);
         cb=findViewById(R.id.checkbox) ;

            far.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Register.this, Farmerlogin.class);
                    if(cb.isChecked()) {
                    startActivity(i);}
                    else
                    {
                        Toast.makeText(Register.this, "Please agree to the Terms&Condition", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            con.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(Register.this, Consumerlogin.class);
                    if(cb.isChecked()) {
                        startActivity(j);
                    }
                    else
                    {
                        Toast.makeText(Register.this, "Please agree to the Terms&Condition", Toast.LENGTH_SHORT).show();

                    }

                }
            });

    }


}

