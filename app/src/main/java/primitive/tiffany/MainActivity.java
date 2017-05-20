package primitive.tiffany;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button button;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) this.findViewById(R.id.txtname);
        tv.setSelected(true);  // Set focus to the textview

        tv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tv.setText("Happy Birthday, Tiffany Teteyan Orangi!");
        tv.setSelected(true);
        tv.setSingleLine(true);

        button=(Button)findViewById(R.id.btnSurprise);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SurpriseActivity.class);
                startActivity(intent);
//                playMusic();

            }
        });
    }
    private void playMusic() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.song);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }
}
