package android.example.com.musicapp.view;

import android.example.com.musicapp.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SongActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        Toast.makeText(this, "In Song Activity", Toast.LENGTH_SHORT).show();
    }

}
