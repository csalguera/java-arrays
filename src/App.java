import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    /*
     * ------------
     * Introduction
     * ------------
     * 
     * If we were to store 5 lottery ticket numbers, we could create a variable for each value:
     */

    // int firstNumber = 4;
    // int secondNumber = 8;
    // int thirdNumber = 15;
    // int fourthNumber = 16;
    // int fifthNumber = 23;

    /*
     * it is more clean and convenient to use a Java array to store the data as a list
     * 
     * An array holds a fixed number of values of one type
     * 
     * Arrays hold double, int, boolean, and other primitives
     * 
     * Arrays can also contain String data types as well as object references
     */

    /*
     * ----------------------------
     * Creating an Array Explicitly
     * ----------------------------
     * 
     * If we were to make a program to track the prices of different clothing items we want to buy, we would want a list of the prices and a list of the items they correspond to
     * 
     * To create an array, we provide a name and declare the type of data it holds:
     */

    // double[] prices;

    /*
     * Just like with variables, we can declare and initialize in the same line
     * 
     * This allows us to explicitly initialize the array to contain the data we want to store:
     */

    // double[] prices = {13, 15, 15.87, 14.22, 16.66};

    /*
     * We can use arrays to hold String values and other objects as well as primitives:
     */

    String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};

    /*
     * ----------------
     * Importing Arrays
     * ----------------
     * 
     * When printing out an array, we see a memory address
     * it does not help determine what is contained within the array
     * 
     * To have a more descriptive printout of the array itself, we need a toString() method that is provided by the Arrays package in Java:
     */

    // import java.util.Arrays;

    /*
     * This package is imported prior to defining the class
     * 
     * When importing a package, all of the methods within the package become available in our code
     * 
     * The Arrays package contains methods such as Arrays.toString()
     * 
     * When an array is passed into the Arrays.toString() method, we can see the contents of the array printed out:
     */

    // Array with int data types
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    // Array.toString() method from Arrays package called with previous array passed in as argument
    String betterPrintout = Arrays.toString(lotteryNumbers);
    // println() statement with previous String variable as argument
    System.out.println(betterPrintout);
    // Prints:
    // [4, 8, 15, 16, 23, 42]

    /*
     * --------------------
     * Get Element By Index
     * --------------------
     * 
     * Now that we have declared an array, we want to be able to get values out of it
     * 
     * We use square brackets to access data at a certain index:
     */

    double[] prices = {13.1, 15.87, 14.22, 16.66};

    System.out.println(prices[1]);
    // Prints index 1 of prices array
    // Note: the index starts at index 0
    // Index 0 = 13.1, Index 1 = 15.87, Index 2 = 14.22, Index 3 = 16.66
    // 15.87 is the value printed out

    /*
     * If we try to access an element outside of its appropriate index range, we will receive an ArrayIndexOutOfBoundsException error:
     */

    // System.out.println(prices[5]);

    // Prints:
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4 at App.main(App.java:108)

    // Note: 108, the number after the colon is referring to the line within the code where the error occurs
    // In this case it is line 108 where we try to print out an index that is not within the given index range of the prices array

    /*
     * -----------------------
     * Creating an Empty Array
     * -----------------------
     * 
     * We can also create empty arrays
     * Empty arrays must be initialized with a fixed size:
     */

    String[] menuItems = new String[5];

    /*
     * Once the length of the array has been declared, it cannot be manipulated
     * 
     * Each index of the array can be set equal to a value:
     */

    menuItems[0] = "Veggie hot dog";
    menuItems[1] = "Potato salad";
    menuItems[2] = "Cornbread";
    menuItems[3] = "Roasted broccoli";
    menuItems[4] = "Coffee ice cream";

    System.out.println(Arrays.toString(menuItems));
    // Prints:
    // [Veggie hot dog, Potato salad, Cornbread, Roasted broccoli, Coffee ice cream]

    /*
     * This has the same effect as initializing the array with the values
     * 
     * We can change the value at an index:
     */

    menuItems[3] = "Baked cauliflower";

    System.out.println(Arrays.toString(menuItems));
    // Now prints "Baked cauliflower" instead of "Roasted broccoli":
    // [Veggie hot dog, Potato salad, Cornbread, Baked cauliflower, Coffee ice cream]

    /*
     * When we use the new keyword to create an empty array, each element is initialized with a default value based on the data type the array is initialized with
     * 
     * Data Type    Initialized Value
     * int          0
     * double       0.0
     * boolean      false
     * Reference    null
     * 
     * Note: These are all falsy values
     * 
     * String is a reference to an object so a String[] array will be initialized with null values
     */

    /*
     * ------
     * Length
     * ------
     * 
     * If we have an array storing all the usernames for our program and we want to quickly see how many users we have, we can access the length field of the array object:
     */

    System.out.println(menuItems.length);
    // Prints the length of the array:
    // 5

    /*
     * -------------
     * String[] args
     * -------------
     * 
     * When we write main() methods for our programs, we use the parameter String[] args
     * 
     * A String[] is an array made up of Strings
     * 
     * The args parameter is another example of a String array
     * 
     * In this case, the array args contains the arguments that we pass in from the terminal when we run the class file
     * 
     * Let's say we have this local class HelloYou:
     */
  }
  static class HelloYou {
    public static void main(String[] args) {
      System.out.println("Hello " + args[0]);
    }

    /*
     * When we run the program HelloYou in the terminal with an argument  of "Laura":
     * java App\$HelloYou Laura
     * We get the output:
     * Hello Laura
     * 
     * The String[] args would be interpreted as an array with one element, "Laura"
     * 
     * When we use args[0] in the main method, we can access that element like we did in HelloYou
     */
  }
}