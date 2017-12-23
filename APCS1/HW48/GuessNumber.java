//Shafali Gupta
//APCS1 pd08
//HW48 -- Keep Guessing
//2017 - 12 -07

/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b )
    {
	/* YOUR IMPLEMENTATION HERE */
	_lo = a;
	_guessCtr = 1;
	_hi=b;
	_target= (int) (Math.random() * (_hi - _lo) + _lo);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:
      post:
      ==================================================*/
    public void playRec()
    {
	/* YOUR IMPLEMENTATION HERE */
	int inp = Keyboard.readInt();

	if(inp == _target){
	    System.out.println("Guess a number from " + _lo + "-" + _hi +  ": " + "\033[1m" +inp + " \033[0m"); //bolds the input
	    System.out.println(" Correct! It took " + _guessCtr + " guesses.");
	    return;
	}

	else{
	    	System.out.println("Guess a number from " + _lo + "-" + _hi +  ": " + "\033[1m" +inp + " \033[0m");

	    if (inp> _target){
		System.out.println( "Too high, try again...");
		_guessCtr +=1;
		playRec();
	    }
	    else if (inp< _target) {
		System.out.println("Too low, try again...");
		_guessCtr += 1;
		playRec();
	    }
	    inp = Keyboard.readInt();
	}
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:
      post:
      ==================================================*/
    public void playIter()
    {
	/* YOUR IMPLEMENTATION HERE */
	//	System.out.println("Guess a number from " + _lo + "-" + _hi);
	int inp = Keyboard.readInt();

	while(inp != _target){
	    System.out.println("Guess a number from " + _lo + "-" + _hi +  ": " + "\033[1m" +inp + " \033[0m");
	    if (inp> _target){
		System.out.println( "Too high, try again...");

	    }
	    else if(inp< _target) {
		System.out.println("Too low, try again...");
	    }
	    inp = Keyboard.readInt();
	    _guessCtr +=1;
	}
	 System.out.println("Guess a number from " + _lo + "-" + _hi +  ": " + "\033[1m" +inp + " \033[0m");
	System.out.println(" Correct! It took " + _guessCtr + " guesses.");
	return;

    }


    //wrapper for playRec/playIter to simplify calling
    public void play()
    {
	//use one or the other below:
		System.out.println("Guess a number from " + _lo + "-" + _hi);
		//playRec();
		playIter();
	return;
    }



    //main method to run it all
    public static void main( String[] args )
    {
	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
