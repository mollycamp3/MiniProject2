/**
@author Molly Campbell, Dom, Dalessandro, Andrew Kaiser, Tom Sanker
@version 10-31-2020
*/

//Importing array lists and random classes
import java.util.ArrayList; 
import java.util.Random;

//Initializing ArrayList pillowCase
//Creating and initializing int num variable 
public class pillowCase {
  ArrayList<Candy> candy;
  int num;

//Creating constructor for pillowCase
  public pillowCase(){
    candy = new ArrayList<Candy>();
    num = 0;
  }

//Creating getNum method
  public int getNum()
  {
    return this.num;
  }

//Creating getCandy method
  public void getCandy()
  {
    // Checking what candy you get based on percentages given in assignment
    System.out.println("Trick or Treat:)");
    Random random = new Random();
    int rand = random.nextInt(101);
    if(rand<=10) candy.add(new Candy("M&Ms"));
    else if(rand>10&&rand<=30)candy.add(new Candy("Pink Starbursts"));
    else if(rand>30&&rand<=47)candy.add(new Candy("Hersheys"));
    else if(rand>=48&&rand<=55)candy.add(new Candy("Milky Way"));
    else if(rand>=56&&rand<=68)candy.add(new Candy("Twix"));
    else if(rand>=69&&rand<=93)candy.add(new Candy("Reese's"));
    else if(rand>=94&&rand<=100)candy.add(new Candy("Kit Kat"));
    
    num++;
  }

// Creating printNumCandies method
  public void printNumCandies()
  {
    //new array for candies 
    Candy[] candies= new Candy[7];
    Candy mm = new Candy("M&MS", 0);
    Candy pinkStarbursts = new Candy("Pink Starbursts", 0);
    Candy hersheys = new Candy("Hersheys", 0);
    Candy milkyWay = new Candy("Milky Way", 0);
    Candy twix = new Candy("Twix", 0);
    Candy reeses = new Candy("Reese's", 0);
    Candy kitKat= new Candy("Kit Kat", 0);

    candies[0] = mm;
    candies[1] = pinkStarbursts;
    candies[2] = hersheys;
    candies[3] = milkyWay;
    candies[4] = twix;
    candies[5] = reeses;
    candies[6] = kitKat;

    // String[] names = {"M&MS","Pink Starbursts","Hersheys","Milky Way", "Twix", "Reese's", "Kit Kat"};
    
    //Getting the number of candies that you receive based on what type of candy it is
    for(int i = 0; i < getNum();i++)
    {
        if(candy.get(i).getName().equals("M&Ms"))
        mm.setCandyQuantity(mm.getQuantity() + 1);
        if(candy.get(i).getName().equals("Pink Starbursts"))
        pinkStarbursts.setCandyQuantity(pinkStarbursts.getQuantity() + 1);
        if(candy.get(i).getName().equals("Hersheys"))
        hersheys.setCandyQuantity(hersheys.getQuantity() + 1);
        if(candy.get(i).getName().equals("Milky Way"))
        milkyWay.setCandyQuantity(milkyWay.getQuantity() + 1);
        if(candy.get(i).getName().equals("Twix"))
         twix.setCandyQuantity(twix.getQuantity() + 1);
        if(candy.get(i).getName().equals("Reese's"))
         reeses.setCandyQuantity(reeses.getQuantity() + 1);
        if(candy.get(i).getName().equals("Kit Kat"))
         kitKat.setCandyQuantity(kitKat.getQuantity() + 1);
    }
  
  //Printing out what kind of candy you have and what you got
    System.out.println("We have " + num + " Candies \nWe got...");
    int f =0;
    while(f < candies.length){
      if(candies[f].getQuantity()>0){
      System.out.println(candies[f].getQuantity() +" "+ candies[f].getName());
      
      }
      f++;
    }
    
  }
}