package primitive.tiffany;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SurpriseActivity extends AppCompatActivity {
    private Button play;
    MediaPlayer mediaPlayer;
    private TextView saying;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surprise);

        saying = (TextView) this.findViewById(R.id.lines);
        saying.setSelected(true);  // Set focus to the textview

        saying.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        //saying.setText("Happy Birthday, Tiffany Teteyan Orangi!");
        saying.setSelected(true);
        saying.setSingleLine(true);

        play=(Button)findViewById(R.id.play);
        mediaPlayer = MediaPlayer.create(this,R.raw.song);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic();
            }
        });

    }

    private void playMusic() {
        //mediaPlayer.start(); // no need to call prepare(); create() does that for you
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        mediaPlayer.stop();
    }
}

//    final Button bPlay = (Button) findViewById(R.id.bPlay);
//    MediaPlayer song1 = MediaPlayer.create(tutorialFour.this, R.raw.fluet);
//    Button bStop = (Button) findViewById(R.id.bStop);
//bPlay.setWidth(10);
//
//        song1.setOnCompletionListener(new OnCompletionListener() {
//
//public void onCompletion(MediaPlayer mp) {
//
//        bPlay.setText("Play");
//
//
//        }
//        });
//
//        bPlay.setOnClickListener(new View.OnClickListener() {
//
//public void onClick(View v) {
//        // TODO Auto-generated method stub
//        b = true;
//
//        if (bPlay.getText().equals("Play") && b == true) {
//
//        song1.start();
//
//        bPlay.setText("Pause");
//        b = false;
//        } else if (bPlay.getText().equals("Pause")) {
//        x = song1.getCurrentPosition();
//        song1.pause();
//        bPlay.setText("Resume");
//        Log.v("log", "" + x);
//        b = false;
//        } else if (bPlay.getText().equals("Resume") && b == true) {
//        song1.seekTo(x);
//        song1.start();
//        bPlay.setText("Pause");
//        b = false;
//        }
//
//
//        }
//
//        });