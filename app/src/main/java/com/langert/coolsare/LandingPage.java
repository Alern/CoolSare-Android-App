package com.langert.coolsare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {
Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

 Button button8=(Button)findViewById(R.id.button8);
        button8.setOnClickListener(
         new Button.OnClickListener(){

             public void onClick(View v) {
                 //StartActivity(new Intent(LandingPage.this, Payment.class));
                 Intent openPayment = new Intent(context,Payment.class);
                  context.startActivity(openPayment);
             }
         }

        );

        Button button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent backHome=new Intent(context,MainActivity.class);
                        context.startActivity(backHome);
                    }
                }


        );
    }
}
