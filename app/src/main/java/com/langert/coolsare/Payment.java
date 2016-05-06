package com.langert.coolsare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Payment extends AppCompatActivity {
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button button12 = ( Button)findViewById(R.id.button12);
         button12.setOnClickListener(
                 new Button.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Toast.makeText(Payment.this, "Thank you for shopping with us. " +
                                 "We will be happy to have you again..", Toast.LENGTH_SHORT).show();
                     }
                 }

         );
       Button button14=(Button)findViewById(R.id.button14);
        button14.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent backLand=new Intent(context, LandingPage.class);
                        context.startActivity(backLand);
                    }
                }


        );
    }
}
