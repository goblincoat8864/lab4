package utsa.cs3443.yvz641_lab4;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Fleet {
    private final String name;
    private ArrayList<Starship> starships;

    public Fleet(String name) {
        this.name = name;
        this.starships = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

  //  public void setName(String name) {
       // this.name = name;
   // }

    //public int getSizeOfFleet() {
      //  return starships.size();
   // }

   // public void addStarship(Starship starship) {
      //  starships.add(starship);
   // }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fleet Name: ").append(name).append("\n");
        sb.append("Starships in Fleet:\n");
        for (Starship starship : starships) {
            sb.append(starship.toString()).append("\n");
        }
        return sb.toString();
    }
    //Starship starship = new Starship(String name, String registry, String classOfShip );
    public void loadStarships(String registry, Context context) throws Exception {
       //load starships the same as crew memebr
        AssetManager manager = context.getAssets();

        Scanner scan = null;
        String filename="fleet.csv";
        try {
            InputStream file= manager.open(filename);
            scan=new Scanner(file);
            String line ="";
            String[]tokens;
            boolean bool;
            while(scan.hasNextLine()){
                line= scan.nextLine();
                tokens = line.split(",");

                    starships.add(new Starship(tokens[0], tokens[1], tokens[2], tokens[3]));

                scan.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        throw new Exception("Method not implemented");
    }
}

