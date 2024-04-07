package utsa.cs3443.yvz641_lab4;

public class CrewMember {
    private String name;
    private String position;

    private String rank;
    private String species;

    private String assignment;

    private int image;

    public String getName() {
        return name;
    }
    public String getRank() {
        return rank;
    }

    public String getPosition() {
        return position;
    }

    public String getSpecies() {
        return species;
    }

    public String getAssignment() {
        return assignment;
    }

    public int getImage() {
        return image;
    }

    public CrewMember(String name, String position, String rank, String species, String assignment, int image){
this.name= name;
this.position= position;
this.rank= rank;
this.species=species;
this.assignment=assignment;
this.image=image;
    }

    public CrewMember(String name, String position, String rank, String species,int image){
        this.name= name;
        this.position= position;
        this.rank= rank;
        this.species=species;
        this.image=image;
    }
public String toString(String name, String position, String rank, String species, String assignment) {
return "CrewMember:"+name+ ", Position: " + position + ", Rank: " + rank +
        ", Species: " + species + ", Assignment: " + assignment;
}



}
