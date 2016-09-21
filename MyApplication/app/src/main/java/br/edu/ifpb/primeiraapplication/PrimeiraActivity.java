package br.edu.ifpb.primeiraapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PrimeiraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyApplication","No onStart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyApplication","No onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyApplication","No onStop");
    }
}
