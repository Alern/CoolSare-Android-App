package com.langert.coolsare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        Intent openPayment = new Intent(context,LandingPage.class);
                        context.startActivity(openPayment);
                    }
                }

        );



    }
}
