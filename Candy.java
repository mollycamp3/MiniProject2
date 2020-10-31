/**
@author Molly Campbell, Dom, Dalessandro, Andrew Kaiser, Tom Sanker
@version 10-31-2020
*/
public class Candy {
  //@Param candyName
  private String candyName;
  private int candyQuantity;

// Sets candyName equal to blank 
  public Candy() {
    candyName ="";
    candyQuantity = 0;
  }

// Writing constructor for Candy class
  public Candy(String name, int num) {
      this.candyName = name;
      this.candyQuantity = num;
  }

// Writing constructor for Candy class
  public Candy(String aCandyName) {
    candyName = aCandyName;
  }

//Controlling access to our class
  public String getName() {
    return candyName;
  }

//Controlling access to our class 
  public void setCandyName(String theCandyName){
    candyName = theCandyName;
  }
//Method to @return the quantity of each candy
  public int getQuantity() {
    return candyQuantity;
  }

//Method that sets number of candy
  public void setCandyQuantity(int num){
    this.candyQuantity = num;
  }

//Returning the object from the method which is the name of the candy @return candyName 
  public void print(){
    System.out.println(candyName);
  }
}