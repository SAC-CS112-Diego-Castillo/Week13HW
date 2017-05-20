

	public class TrippleDice extends Dice
	{

		private int randomNum;

		   

		   @Override

		   public int Throw()

		   {

		      randomNum=(super.Throw()+super.Throw()+super.Throw())/3;

		      return randomNum;

		   }

		   

		   public String toString()

		   {

		   // This means everytime you use toString, you get a new number...do you want that?

		   

		      return "We rolled 3 dice and the average is: " + Throw();

		   }

	}