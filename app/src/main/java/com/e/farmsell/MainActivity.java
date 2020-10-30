package com.e.farmsell;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView rc;
CardView cv;
int minteger;
Button plus,minus;
TextView txt;
Integer pictures[]={R.drawable.cabbage ,R.drawable.tomatoes,R.drawable.turnip,R.drawable.brocclie,R.drawable.radish};
String data[]={" ","Tomatoes","Turnip","Broccoli","Radish"};
Integer pictures2[]={R.drawable.sale ,R.drawable.tomatoes,R.drawable.turnip,R.drawable.brocclie,R.drawable.radish};
String data2[]={"Cabbage","Tomatoes","Turnip","Broccoli","Radish"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus=findViewById(R.id.plus) ;
        minus=findViewById(R.id.minus) ;
        txt=findViewById(R.id.integer_number) ;


        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar) ;

        rc=findViewById(R.id.recyclerView);



        CustomAdapter adapter =new CustomAdapter(this,pictures,data);


        LinearLayoutManager layoutManager =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL ,false );
        rc.setLayoutManager(layoutManager );
        rc.setAdapter(adapter);

        /*customAdapter2 adapter2 = new customAdapter2(this,pictures2,data2);

        LinearLayoutManager layoutManager2 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL ,false );
        rc.setLayoutManager(layoutManager2 );
        rc.setAdapter(adapter2);*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.Login :
                Intent i=new Intent(this,Login.class);
                this.startActivity(i) ;
                return true;

            case R.id.profile :
                Intent j=new Intent(this,Profile.class);
                this.startActivity(j);
                return true;

            case R.id.search :
                PackageManager pm=getPackageManager();
                Intent k=pm.getLaunchIntentForPackage("com.android.chrome");
                if(k==null)
                {
                    Toast.makeText(MainActivity.this, "External App unavailable!", Toast.LENGTH_LONG).show();

                }
                else
                    startActivity(k);

            default:
                return super.onOptionsItemSelected(item);
        }
    }




}
