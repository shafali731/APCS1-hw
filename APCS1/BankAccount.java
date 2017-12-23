/*
Team Wells Codesgo (Rohan Ahammed, Shafali Gupta, Calvin Aw)
Shafali Gupta
APCS1 pd8
HW09 -- CMYM
2017-10-2
*/


public class BankAccount {
    public static void main (String [] args){
	// BankAccount shafaliAccount = new BankAccount("Shafali Gupta", "america", 1234, 999999999, 50.00);
	//System.out.println(shafaliAccount.setPin(2121));
	//BankAccount shafaliAccount = new BankAccount();
	//shafaliAccount.displayInfo();
    }
    //instance vars
    private String fullName;
    private String accPass;
    private int pin;
    private int accNum;
    private double  accBal;
    //All the instance variables are private because there is no real good reason for making them public. We do not want people accessing this information about a bank account!
    //constructor(s)
    public BankAccount(){
	fullName = "Enter Name";
	accPass = "teamcodesgo";
	pin = 1234;
	accNum = 123456789;
	accBal = 0.00;
    }
    //This is the default constructor. If someone wants to create an instance, these will be the default values.
    public BankAccount(String defFullName, String defAccPass, int defPin, int defAccNum, double  defAccBal){
	fullName = defFullName;
	accPass = defAccPass;
	pin = defPin;
	accNum = defAccNum;
	accBal = defAccBal;   
    }
    //This overloaded constructor gives the option for people accessing this class to set all of its attributes when creating the class. Methods allow you to change any of these values.
    //methods
    public String setFullName(String name){
	fullName = name;
	return fullName;
    }
    public String setAccPass(String password){
	accPass = password;
	return accPass;
    }
    public int setPin(int userPin){
	pin = userPin;
	return pin;
    }
    public int setAccNum(int userAccNum){
	accNum = userAccNum;
	return accNum;
    }
    public double setAccBal(int balance){
	accBal = balance;
	return accBal;
    }
    public void displayInfo(){
	System.out.println(fullName);
	System.out.println(accPass);
	System.out.println(pin);
	System.out.println(accNum);
	System.out.println(accBal);
     }
    //This method's sole purpose is to print out all of this information. This method is to be accessed by other classes. We were confused about this method because we weren't able to test it fully like our other methods.
    public double depositMoney(double depositAmt){
	accBal = accBal + depositAmt;
	return accBal;
    }
    public double  withdrawMoney(double withdrawAmt){
	accBal = accBal - withdrawAmt;
	return accBal;
    }
    //Almost all of our methods followed the same format, we decided to use the primitives int and string because they are what makes the most sense to use. We could have used double when dealing with the balance of an account, because most bank accounts and money in the real world deal with floating point numbers and Java was giving us an error when we tried to assign a float "0.00", but it worked with the primitive double. We have return statements, because we want to make sure the person who uses the method knows what they entered and what their updated information is. It also helps us test these methods without creating other class files.  
}
