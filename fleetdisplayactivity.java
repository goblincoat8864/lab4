package utsa.cs3443.yvz641_lab4;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class fleetdisplayactivity extends AppCompatActivity {
    //potentially make 3 and use cases to dictate which one gets sent with intent on main activity
    //ArrayList<> ss1Personels =new ArrayList<ss1_personel>();
   // int[] personelimages1 = {R.drawable.kirk,R.drawable.spock,R.drawable.mccoy,R.drawable.scott,R.drawable.chapel,R.drawable.uhura,R.drawable.chekov};


    private void setupSS1() {
        String[] personnelNames = getResources().getStringArray(R.array.Starship1_crew.txt);
        String[] stats = new String[]{.get(i).getCrewMember().toString();


        for (int i = 0; i < personnelNames.length; i++) {
            ss1Personels.add(new ss1_personel(personnelNames[i], stats[i],/*personelimages1[i]*/));

        }
        //}

        @Override
        protected void onCreate (@Nullable Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            RecyclerView recyclerView = findViewById(R.id.RecycleView1);

            setupSS1();
            recyclerViewAdapter adapter = new recyclerViewAdapter(this, ss1Personels);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
}
