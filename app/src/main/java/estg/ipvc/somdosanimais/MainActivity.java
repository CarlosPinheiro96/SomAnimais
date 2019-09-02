package estg.ipvc.somdosanimais;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private  MediaPlayer mediaplayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView) findViewById(R.id.dog);
        gato = (ImageView) findViewById(R.id.cat);
        leao = (ImageView) findViewById(R.id.lion);
        macaco = (ImageView) findViewById(R.id.monkey);
        ovelha = (ImageView) findViewById(R.id.sheep);
        vaca = (ImageView) findViewById(R.id.cow);


        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

@Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.dog :
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarsom();
                break;
            case R.id.cat :
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarsom();
                break;

            case R.id.lion :
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarsom();
                break;

            case R.id.monkey :
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarsom();
                break;

            case R.id.sheep :
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarsom();
                break;

            case R.id.cow :
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarsom();
                break;
        }

}

public void tocarsom(){

        if(mediaplayer != null){
            mediaplayer.start();
        }

}


    @Override
    protected void onDestroy() {

        if (mediaplayer != null){
            mediaplayer.release();
            mediaplayer = null;
        }
        super.onDestroy();
    }
}
