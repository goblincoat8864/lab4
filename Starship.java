package utsa.cs3443.yvz641_lab4;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Starship {
    private String name;
    private String registry;
    private String classOfShip;
    private ArrayList<CrewMember> crewMembers;




    public void LoadCrewMembers(String Registry, Context context )throws FileNotFoundException {

        AssetManager manager = context.getAssets();

        Scanner scan = null;
        String filename="personnel.csv";
        try {
            InputStream file= manager.open(filename);
            scan=new Scanner(file);
            String line ="";
            String[]tokens;
            boolean bool;
            while(scan.hasNextLine()){
                line= scan.nextLine();
                tokens = line.split(",");
                if (tokens[3]==this.registry) {
                    crewMembers.add(new CrewMember(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
                }
                scan.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getClassOfShip() {
        return classOfShip;
    }

    public void setClassOfShip(String classOfShip) {
        this.classOfShip = classOfShip;
    }

public Starship(String name, String registry, String classOfShip, String crewMembers){
    this.name=name;
    this.registry= registry;
    this.classOfShip=classOfShip;
    this.crewMembers= new ArrayList<>();

}

   // public void setCrewMembers(CrewMember crewMember) {
    //    crewMembers.add(crewMember);
   // }
    ///public int GetCrewSize(){
//return crewMembers.size();
    }

//L

    //@Override
   // public String toString(){
    //    StringBuilder n = new StringBuilder();
    //    n.append("Starship: ").append(name).append("\n");
    //    n.append("Registry: ").append(registry).append("\n");
   //     n.append("Class: ").append(classOfShip).append("\n");
   //     n.append("Crew Members:\n");
   //     for (CrewMember crewMember : crewMembers){
    //        n.append("- ").append(crewMember.toString()).append("\n");
    //    }
    //    return n.toString();
  //  }
//}
