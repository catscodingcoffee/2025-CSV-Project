# Student Code Review Checklist
*Run through this list before you commit your final code!*

## 1. Encapsulation & Objects
* [ ] **Private variables:** Are your `Athlete` instance variables marked `private`?
* [ ] **Constructor:** Does your constructor initialize every field correctly from the CSV data?
* [ ] **Getters:** Did you provide `public` getter methods for the `DataManager` to access data?
* [ ] **toString():** Did you override the `toString()` method so you can easily print and debug your objects?

## 2. File I/O & Parsing
* [ ] **The Header Skip:** Does your code call `fileReader.nextLine()` once *before* the loop to skip the "Athlete,Country,Gold..." row?
* [ ] **The Split:** Did you use `line.split(",")` to break the String into an array?
* [ ] **Trimming:** Did you use `.trim()` (e.g., `data[1].trim()`) to remove hidden spaces that might break your `.equals()` checks?
* [ ] **Resource Management:** Did you call `fileReader.close()` after your `while` loop is finished?

## 3. The "What If?" Test (Robustness)
* [ ] **File Missing:** If you rename your CSV file, does your `try-catch` block catch the error and print a helpful message, or does the program just crash?
* [ ] **Bad Data:** If a row is missing a number, does your code handle the `NumberFormatException` gracefully?
* [ ] **Empty Lines:** Does your `while` loop check `hasNextLine()` to avoid crashing on a blank line at the end of the file?

## 4. Analysis Logic (Level Up)
* [ ] **The Filterer:** Did you use `.equalsIgnoreCase()` so that searches for "usa" and "USA" both work?
* [ ] **The Statistician:** If your list is empty, did you add an `if (list.size() > 0)` check to prevent dividing by zero?
* [ ] **The Comparator:** If comparing two files, are you correctly matching names between the two different `ArrayList` objects?

## 5. Code Style
* [ ] **Variable Names:** Are your variables descriptive (e.g., `goldMedals` vs just `g`)?
* [ ] **Comments:** Did you include the **Reflection Questions** in a comment block at the top of your `DataManager` class?
