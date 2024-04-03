package utsa.cs3443.yvz641_lab4;

import java.util.ArrayList;

public class Fleet {
    private String name;
    private ArrayList<Starship> starships;

    public Fleet(String name) {
        this.name = name;
        this.starships = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeOfFleet() {
        return starships.size();
    }

    public void addStarship(Starship starship) {
        starships.add(starship);
    }

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

    public void loadStarships(String directory) throws Exception {
        // Implementation to load starships from files in the given directory

        // This method should read files, create Starship objects, and add them to the fleet

        // For simplicity, let's assume the file contains the necessary information for a Starship

        // This method needs to handle IOException

        // Here's a basic example (implementation may vary based on file format):

        // File reading logic can be similar to this:

        // File folder = new File(directory);

        // File[] files = folder.listFiles();

        // for (File file : files) {
        //     // Read file and create Starship object
        //     // Add Starship object to the fleet using addStarship method
        // }

        throw new Exception("Method not implemented");
    }
}

