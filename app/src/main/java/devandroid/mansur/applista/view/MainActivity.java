package devandroid.mansur.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.mansur.applista.R;
import devandroid.mansur.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

    }

}