# java-fundamentals

## Table of Contents

1. ### Basics  
    [basics of java](./basics/Main.java)  
    __pluralize(word,n)__: function pluralize that will take in a word and number and add "s" to the word if the num is 0 or greater than 1.    
    __flipHeads(n)__: function that takes in a number and will flip coints heads multiple number of times until n number of heads will fall in a row. Function uses a random number generator as import.  
    __clock()__: function to generate time every second until ^C is pressed, using imports import java.time.LocalDateTime and java.time.format.DateTimeFormatter;

2. ### BasicLibrary  
    [arrays, loops, ternary, testing](./basiclibrary/src/main/java/basiclibrary/ArrayListsImports.java)  
__roll(n)__: function that takes in an integer n and returns array of n integers with random integers between 1-6.   
_Testing_ done to match the return array to have same length as the n, and that the numbers in the array are less than 6.  
__containsDuplicates(arr)__: function that takes in an array of integers and checks each number with the others to determine if there are duplicates, and returns a boolean.   
_Testing_ completed to review both present and absent duplicates, and empty array.  
__avgOfArray(array of integers)__: function that takes in an array of integers and returns the average as an integer.  
_Testing_ done with a simple integer returned.  Could not test using float or double.  
__findLowestAvgArray(array of array of integers)__: function that accepts an array of arrays of integers and finds the lowest average from the matrix, and returns the array with the lowest average.  
_Testing_ completed for matrix of different sized arrays. It also skips over empty arrays.  
  
3.HashMaps    
a. [WeatherData](./basiclibrary/src/main/java/basiclibrary/WeatherData.java)   
__findMinMax__ : function that takes in a matrix of integers containing weather information and returns a string with high/low values and any missing temperatures between the low and high values as a multiline string.  
b. [TallyElection](./basiclibrary/src/main/java/basiclibrary/TallyElection.java)   
__tally__:function that takes in List of Strings representing votes and returns one string to show what got the most votes  

4. [File I/O Linter check](./linter/src/main/java/linter/App.java)  
__main__:method that reads a JavaScript file with a given Path using [Scanner](https://docs.oracle.com/javase/tutorial/essential/io/scanning.html), and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

3. ### Inheritance  
    [Restaurant and Review Classes](./inheritance/src/main/java/inheritance/Restaurant.java)  

    __Restaurant(name, stars, price)__: Restaurant class takes three arguments.   
    __Review(body,author,stars)__: Review class takes three arguments.  
    __.toString()__: returns the string of Object for both classes  
    __Restaurant.addReview()__: adds a review to the Restaurant  
    __Restaurant.updateStars()__: updates the stars of the restaurant taking the average of the restaurant reviews  
    __Review.showEachRestaurantReview()__: lists the contents of the hashmap with name of each restaurant and the reviews.  
    __Restaurant.showReviews()__: lists all the reviews for the Restaurant class



## References
1.  [Random number generator](https://www.codejava.net/coding/how-to-generate-random-numbers-in-java)  
2. [Local Date Time](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)  

3. [Positive and Negative infinity](https://stackoverflow.com/questions/12952024/how-to-implement-infinity-in-java)  

4. [Scanner](https://docs.oracle.com/javase/tutorial/essential/io/scanning.html)  

