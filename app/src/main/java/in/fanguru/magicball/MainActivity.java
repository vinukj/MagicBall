package in.fanguru.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnaskme = (Button) findViewById(R.id.askme);
        final ImageView eightballimage = (ImageView) findViewById(R.id.image8ball);
        final int[] magicball = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        btnaskme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magicball","button press");
                Random randomNumber = new Random();
                int get8ball = randomNumber.nextInt(5);
                eightballimage.setImageResource(magicball[get8ball]);
            }
        });
    }
}
