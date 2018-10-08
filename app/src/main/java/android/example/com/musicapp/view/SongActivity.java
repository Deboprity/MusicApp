package android.example.com.musicapp.view;

import android.content.Intent;
import android.example.com.musicapp.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity{

    TextView songTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        Intent songIntent = getIntent();
        String songTitle = songIntent.getStringExtra(getString(R.string.song_title));

        songTitleTextView = findViewById(R.id.song_title);
        songTitleTextView.setText(songTitle);

    }

}
