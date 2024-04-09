package utsa.cs3443.yvz641_lab4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static String stars1 = "USS_Enterprise_NCC1701";


    private void luanchActivity(Starship Star){
    Intent i = new Intent(this,Starship.class);
    i.putExtra(stars1,Star.getRegistry());
    startActivity(i);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            Button ss1 = findViewById(R.id.button1);
            ss1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Starship starship1 = new Starship();
                starship1.setRegistry("USS_Enterprise_NCC1701");
                    luanchActivity(starship1);
                }

            });

            Button ss2 = findViewById(R.id.button2);



        }
    }
