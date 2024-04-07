package utsa.cs3443.yvz641_lab4;

import java.util.ArrayList;

public class Starship {
    private String name;
    private String registry;
    private String classOfShip;
    private ArrayList<CrewMember> crewMembers;

    public Starship(){
        this.name=name;
        this.registry= registry;
        this.classOfShip=classOfShip;
        this.crewMembers= new ArrayList<>();
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



    public void setCrewMembers(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }
    public int GetCrewSize(){
        return crewMembers.size();
    }

    Starship a = new Starship(){
        a.name = USS_Enterpise_NCC1701-A;

    }

    @Override
    public String toString(){
        StringBuilder n = new StringBuilder();
        n.append("Starship: ").append(name).append("\n");
        n.append("Registry: ").append(registry).append("\n");
        n.append("Class: ").append(classOfShip).append("\n");
        n.append("Crew Members:\n");
        for (CrewMember crewMember : crewMembers){
            n.append("- ").append(crewMember.toString()).append("\n");
        }
        return n.toString();
    }
}
