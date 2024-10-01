//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Gabriel Ciobanu
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    System.out.println("Given two numbers 8 and 5, the largest is " + lab.max(8, 5));
    System.out.println("Given two numbers 8 and 5, the smallest is " + lab.min(8, 5));

    int[] numberSquence = {5, 9, 3, 12, 7, 3, 11, 5};

    System.out.print("The number sequence is: ");

    int counter = 0;
    while (counter < numberSquence.length)
    {
      System.out.print(numberSquence[counter] + " ");
      counter++;
    }

    System.out.print("\nThe number sequence in reverse order is: ");

    for (int i = numberSquence.length - 1; i >= 0; i--)
    {
      System.out.print(numberSquence[i] + " ");
    }

    System.out.print("\nThe first and last numbers of the sequence are: ");
    System.out.println(numberSquence[0] + " and " + numberSquence[numberSquence.length - 1]);
    System.out.println("The sum of all the values in the sequence is: " + lab.sum(numberSquence));
    System.out.println("The average of the sequence is: " + lab.average(numberSquence));
    System.out.println("The largest value of the sequence is: " + lab.max(numberSquence));
    System.out.println("The smallest value of the sequence is: " + lab.min(numberSquence));

  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b)
  {
    if (a > b)
      return a;
    
    return b;
  }

  public int min(int a, int b)
  {
    if (a > b)
      return b;
    
    return a;
  }

  public int sum(int[] numbers)
  {
    int total = 0;
    for (int i = 0; i < numbers.length; i++)
    {
      total+=numbers[i];
    }
    return total;
  }

  public double average(int[] numbers)
  {
    int added = 0;
    for (int i: numbers)
    {
      added+=i;
    }
    return ((added + 0.0)/numbers.length);
  }

  public int max(int[] numbers)
  {
    int maximum = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    {
      if(numbers[i] > maximum)
        maximum = numbers[i];
    }
    return maximum;
  }

  public int min(int[] numbers)
  {
    int minimum = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    {
      if(numbers[i] < minimum)
        minimum = numbers[i];
    }
    return minimum;
  }
}
