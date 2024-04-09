package utsa.cs3443.yvz641_lab4;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class fleetdisplayactivity extends AppCompatActivity {
    //potentially make 3 and use cases to dictate which one gets sent with intent on main activity
    ArrayList<CrewMember> CrewMembers;

    public fleetdisplayactivity() {
        CrewMembers = new ArrayList<CrewMember>();
    }
    // int[] personelimages1 = {R.drawable.kirk,R.drawable.spock,R.drawable.mccoy,R.drawable.scott,R.drawable.chapel,R.drawable.uhura,R.drawable.chekov};


    private void setupStarship(Starship crewMembers) {
        String[] CrewMembers = getResources().getStringArray(R.array.Starship1_crew);
        //String[] stats = new String[]{(i).getCrewMember().toString();


        for (int i = 0; i < CrewMembers.length; i++) {
            CrewMembers.add(new CrewMember(CrewMembers[i]));

        }
        }


        protected void onCreate( Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            RecyclerView recyclerView = findViewById(R.id.RecycleView1);

            Starship starship = new Starship(String)
            setupStarship(Starship);
            recyclerViewAdapter adapter = new recyclerViewAdapter(this, CrewMembers);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
}
