package id.ac.poliban.mi.rafii.e020317041_rafii;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);

        EditText etYourNim = findViewById(R.id.etNim);
        EditText etYourNama = findViewById(R.id.etNama);
        EditText etYourAlamat = findViewById(R.id.etAlamat);
        EditText etYourTelp = findViewById(R.id.etTelp);
        Button btSend = findViewById(R.id.btSend);

        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            String data = etYourNim.getText().toString();
            intent.putExtra("mhsactivity", data);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            String data = etYourNama.getText().toString();
            intent.putExtra("mhsactivity", data);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            String data = etYourAlamat.getText().toString();
            intent.putExtra("mhsactivity", data);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            String data = etYourTelp.getText().toString();
            intent.putExtra("mhsactivity", data);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}
