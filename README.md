## Java Arrays

## Introduction

```
public class Newsfeed {
  
  String[] trendingArticles;
  int[] views;
  double[] ratings;
  
  public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
    trendingArticles = initialArticles;
    views = initialViews;
    ratings = initialRatings;
  }
  
  public String getTopArticle(){
    return trendingArticles[0];
  }
  
  public void viewArticle(int articleNumber){
    views[articleNumber] = views[articleNumber] + 1;
    System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
  }
  
  public void changeRating(int articleNumber, double newRating){
    if (newRating > 5 || newRating < 0) {
      System.out.println("The rating must be between 0 and 5 stars!");
    } else {
      ratings[articleNumber] = newRating;
      System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
    }
  }
  
  public static void main(String[] args){
    String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?", "Organic Eye Implants", "Path Finding in an Unknown World"};
    int[] robotViewers = {87, 32, 13, 11, 7};
    double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};
    Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewers, robotRatings);
    
    robotTimes.viewArticle(2);
    robotTimes.viewArticle(2);
    System.out.println("The top article is " + robotTimes.getTopArticle());
    robotTimes.changeRating(3, 5);
  }
}
```

1. In **Newsfeed.java**, we have created a `Newsfeed` class to keep track of trending articles and their associated views and ratings. We did this using Java arrays, which you’ll learn about throughout the lesson!

    For now, run the code to see some of our method calls.

## Creating an Array Explicitly

```
public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
  
  // Create getTopics() below:
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    /*
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    */
  }
}
```

1. We have an empty Newsfeed class that does not store anything yet.

    First, make a method called getTopics(), which:

* is public
* returns a String array
* does not take any parameters
* For now, leave the method empty.

2. Inside the getTopics() method, create a String array called topics and set it equal to an array containing these elements, in order:

```
Opinion
Tech
Science
Health
```

* Then, return topics from the method!

3. Uncomment the lines in the main method to see how the `getTopics()` method works on a `Newsfeed` instance.

## Importing Arrays

```
// import the Arrays package here:

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
  }
}
```

1. In order to make our printout of the `topics` array more helpful, we are going to want to use the `toString()` method from the `Arrays` package.

    To use it, we first must import the `Arrays` package from `java.util`. Import the package at the top of the **Newsfeed.java** file.

2. Now that you have the Arrays package, use its `toString()` method to print out the topics array in the `main()` method.