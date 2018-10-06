package com.example.abriluno.laboratory4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "ariyen", "oncreate has executed...."  );

        Button Button = (Button) findViewById(R.id.button);
        Button Button2 = (Button) findViewById(R.id.button2);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "BACK!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "You clicked next!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });


    }
    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "ariyen", "onstart has executed"  );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "ariyen ", "onresume has executed"  );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "ariyen", "onpause has executed"  );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "ariyen", "onpause has executed"  );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "ariyen", "onRestart has executed"  );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "ariyen", "object is deallocated"  );
    }

}
