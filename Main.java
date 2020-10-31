/**
@author Molly Campbell, Dom, Dalessandro, Andrew Kaiser, Tom Sanker
@version 10-31-2020
*/

//Brings in scanner class so we can use in program
import java.util.Scanner;

//This program is a simple model for trick or treating. You put how many houses you want to go to and it prints out trick or treat for those houses and the type of candy you get
//Creates Main class & Initializes our variables
class Main {
  public static void main(String[] args) {
    pillowCase p = new pillowCase();
    Scanner s = new Scanner(System.in);
    
    //Prints out line and asks the user how many houses they want to hit
    System.out.println("Happy Halloween! How many houses should we hit?");
    int h = s.nextInt();
    
    //Sets for loop for amount of candies you get based on the houses
    for(int i = 0; i<h;i++)
    {
      p.getCandy();
    }
    p.printNumCandies();
    
  }
}