package id.ac.poliban.mi.rafii.e020317041_rafii;

import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowInput(View view) {
        Intent intent = new Intent(MainActivity.this, MhsActivity.class);
        startActivity(intent);
    }
}
