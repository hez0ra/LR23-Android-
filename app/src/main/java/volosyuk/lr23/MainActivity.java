package volosyuk.lr23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button toFirst, toSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toFirst = findViewById(R.id.first);
        toSecond = findViewById(R.id.second);

        toFirst.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstTask.class);
            startActivity(intent);
        });

        toSecond.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondTask.class);
            startActivity(intent);
        });

    }
}