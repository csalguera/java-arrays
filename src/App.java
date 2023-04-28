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

    double[] prices = {13, 15, 15.87, 14.22, 16.66};

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
  }
}