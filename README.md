# AP CS A Project: The CSV Data Parser & Analyzer

## 1. Project Overview
In this project, you will bridge the gap between "plain text" and "structured data." You will write a Java program that reads a **Comma Separated Values (CSV)** file, transforms each row into a custom Object, and performs data analysis to find trends, leaders, or statistics.

---

## 2. Sample Dataset: `olympics_data.csv`
*Create a file named `olympics_data.csv` in your project's root folder and paste the following:*

```csv
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
```
---

## 3. The Weighted Score (In-Class Lab)
As a class, we will extend the `Athlete` class to include a **Weighted Medal Score**. This allows us to rank athletes based on the "quality" of medals rather than just the quantity.

**The Formula:**
* **Gold:** 3 points
* **Silver:** 2 points
* **Bronze:** 1 point

---

## 4. Your Mission: Choose Your Data
After completing the Olympics demo, you must find (or create) your own CSV dataset. It must contain at least **3 columns of numeric data**, **2 columns of text data**, and at least **20 rows**.

### "Level Up" Options (Choose One):
1. **The Filterer:** Allow the user to input a specific category (e.g., a Team Name or Genre) and display only those records, followed by a count of how many matches were found.
2. **The Statistician:** For a specific numeric column, calculate and display:
    * **Mean** (Average)
    * **Median** (Middle value—requires sorting the list!)
    * **Min & Max**
    * **Standard Deviation** (The spread of your data)
3. **The Comparative Analyzer:** Load two separate CSV files (e.g., `2023_data.csv` and `2024_data.csv`). Identify which items appear in *both* files and calculate the percentage change in their numeric values.

---

## 5. Troubleshooting Guide
* **ArrayIndexOutOfBoundsException:** You tried to access an index that doesn't exist. Check if your CSV has empty lines at the bottom or if a row is missing a comma.
* **NumberFormatException:** You tried to turn a word (like "Gold") into an `int`. **Fix:** Ensure you called `fileReader.nextLine()` once *before* your loop to skip the header row.
* **File Not Found:** Ensure your `.csv` file is in the **root folder** of your project (the main folder containing `src`), not tucked inside the `src` folder itself.

---

## 6. Using AI to Clean Your Dataset
If you find great data on the web but it’s messy, use an AI to format it for your Java program. Use this prompt:

> "I have raw data about [Your Topic]. I need a clean CSV file. 
> 1. Use the header: [List your columns here]
> 2. Ensure every row has exactly the same number of commas.
> 3. Remove any internal commas in names (e.g., change 'Smith, John' to 'John Smith').
> 4. If a value is missing, put a 0.
> 5. Output only the CSV text."

---

## 7. Advanced Pro-Tips
* **The Delimiter:** Not all "CSVs" use commas. If your data uses semicolons, change your code to `line.split(";")`.
* **Trimming:** Sometimes CSVs have extra spaces (e.g., `" USA"`). Use `data[1].trim()` to remove leading/trailing whitespace before comparing Strings.
* **Closing Resources:** Always call `fileReader.close()` after your `while` loop to prevent memory leaks.

---

## 8. Reflection Questions
*Answer these in a Google Doc attached to the Google Classroom assignment*
1. Why is `Integer.parseInt()` necessary when reading from a CSV file? Why can't we just assign the value directly?
2. What happens to your program if a row in the CSV is missing a piece of data? How could you make your code more "robust" to handle this?
3. Which "Level Up" did you choose, and what was the hardest logic error you faced?

---

## 9. Grading Rubric (100 pts)

| Criteria | Description | Points |
| :--- | :--- | :--- |
| **Object Encapsulation** | Class has private variables, constructor, and getters. | 20 |
| **File Handling** | Successfully uses File and Scanner with a try-catch. | 15 |
| **Parsing Logic** | Correct use of .split(",") and skips header row. | 20 |
| **Data Conversion** | Correct use of Integer.parseInt or Double.parseDouble. | 15 |
| **Collections** | Objects are stored and managed within an ArrayList. | 15 |
| **Analysis/Level Up** | Program performs a meaningful calculation, filter, or comparison. | 15 |
