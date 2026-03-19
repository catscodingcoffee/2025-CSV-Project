1. Project Overview
In this project, you will bridge the gap between "plain text" and "structured data." You will write a Java program that reads a Comma Separated Values (CSV) file, transforms each row into a custom Object, and performs data analysis to find trends, leaders, or statistics.

2. Sample Dataset: olympics_data.csv
Create a file named olympics_data.csv in your project's root folder and paste the following:

Code snippet
Athlete,Country,Gold,Silver,Bronze,Total
Léon Marchand,France,4,0,0,4
Torri Huske,USA,3,2,0,5
Mollie O'Callaghan,Australia,3,1,1,5
Simone Biles,USA,3,1,0,4
Summer McIntosh,Canada,3,1,0,4
Pan Zhanle,China,2,0,0,2
Sarah Sjostrom,Sweden,2,0,0,2
Rebeca Andrade,Brazil,1,2,1,4
Gabby Thomas,USA,3,0,0,3
Sifan Hassan,Netherlands,1,0,2,3
Carlos Yulo,Philippines,2,0,0,2
Katie Ledecky,USA,2,1,1,4
3. Starter Code: DataManager.java
Use this boilerplate to handle the File I/O setup and try-catch requirements.

Java
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
            }
            
            fileReader.close();
            System.out.println("Successfully loaded " + roster.size() + " records.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Failed to parse a numeric value in the CSV.");
        }

        // 5. TODO: Implement your Level Up analysis here!
    }
}
4. Level Up Options (Choose One)
The Filterer: Allow the user to input a specific category (e.g., a Country or Genre) and display only those records, followed by a count of how many matches were found.

The Statistician: For a specific numeric column, calculate and display:

Mean (Average)

Median (Middle value—requires sorting!)

Min & Max

Standard Deviation (The spread of your data)

The Comparative Analyzer: Load two separate CSV files (e.g., 2023_data.csv and 2024_data.csv). Identify which items appear in both files and calculate the percentage change in their values.

5. Troubleshooting & Pro-Tips
Trimming: Use .trim() on your Strings (e.g., data[1].trim()) to remove hidden spaces that break .equals() checks.

AI Cleaning: If your data is messy, ask an AI: "Turn this raw text into a clean CSV with 5 columns. Ensure no commas inside names and fill missing numbers with 0."

Standard Deviation Tip: Sum the squares of the differences from the mean, divide by (n-1), and take the square root.

6. Reflection Questions
Answer these in a comment block at the top of your DataManager class.

Why is Integer.parseInt() necessary when reading from a CSV file?

What happens to your program if a row in the CSV is missing a piece of data? How could you make your code more "robust"?

Which "Level Up" did you choose, and what was the hardest logic error you faced?
