package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0 ";
  //Constructor
  public AddingMachine () {
	  total = 0;  // not needed - included for clarity
  }
  //returns the total
  public int getTotal () {
	  return total;
  }
  //adds the number passed to the total
  public void add (int value) {
	  total += value;
	  history += "+ " + value + " ";
  }
  //subtracts the number passed from the total
  public void subtract (int value) {
	  total = total - value;
	  history += "- " + value + " ";
  }
  //returns a toString of the "history" of the use of the programs methods
  public String toString () {
	  return history;
  }
  //clears the "history" basically refreshing the class
  public void clear() {
	  history = "0";
	  total = 0;
  }
}