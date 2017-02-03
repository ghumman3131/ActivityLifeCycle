package example.lifecycle2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button move_next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("i am in onCREATE");

         move_next_btn = (Button) findViewById(R.id.move_next_button);

        View.OnClickListener click_btn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Second_layout.class);

                startActivity(i);



            }
        };

        move_next_btn.setOnClickListener(click_btn);
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("i am in onSTART");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        RelativeLayout layout_box = (RelativeLayout) findViewById(R.id.activity_main);

        layout_box.setBackgroundColor(Color.argb(100,0,0,255));

        System.out.println("i am in onRESTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("i am in onRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();


        System.out.println("i am in onPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("i am in onSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("i am in onDESTROY");
    }
}
