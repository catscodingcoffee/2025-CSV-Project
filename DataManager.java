import java.util.*;
import java.io.*;

public class DataManager {
    public static void main(String[] args) {
        ArrayList<Athlete> roster = new ArrayList<>();
        String fileName = "olympics_data.csv";

        try {
            Scanner fileReader = new Scanner(new File(fileName));
            
            // 1. Skip the header row
            if (fileReader.hasNextLine()) {
                fileReader.nextLine();
            }

            // 2. Loop through the file
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                // 3. Split the line by comma
                String[] data = line.split(",");
                
                // 4. Parse data and create Athlete object
                // TODO: roster.add(new Athlete(...));
                String name = data[0];
                String country = data[1];
                int numGold = Integer.parseInt(data[2]);
                int numSilver = Integer.parseInt(data[3]);
                int numBronze = Integer.parseInt(data[4]);
                int numTotal = Integer.parseInt(data[5]);

                int weightedScore = 3*numGold+2*numSilver+numBronze;

                roster.add(new Athlete(name,country,numGold,numSilver,numBronze,numTotal,weightedScore));
            }
            
            fileReader.close();
            System.out.println("Successfully loaded " + roster.size() + " records.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Failed to parse a numeric value in the CSV.");
        }

        // 5. TODO: Implement your Level Up analysis here!
        for(Athlete a:roster){
            System.out.println(a.getName()+" weighted score: "+a.getWeightedScore());
        }
    }
}
