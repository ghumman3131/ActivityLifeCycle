package example.lifecycle2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Second_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        System.out.println("SECOND LAYOUT ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("SECOND LAYOUT ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("SECOND LAYOUT ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("SECOND LAYOUT ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("SECOND LAYOUT ON STOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("SECOND LAYOUT ON RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("SECOND LAYOUT ON DESTROY");
    }
}
