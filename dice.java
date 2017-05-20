
public class Dice 


{

   private int randomNum;

   

   public int Throw()

   {

      randomNum = ((int)(Math.random()*6)+1);

      return randomNum;

   }

   public int Throw(int dices)

   {

      randomNum = dices * ((int)(Math.random()*6)+1);

      return randomNum;

   }

   public int Throw(int dices, int bounces)

   {

      randomNum = dices *((int)(Math.random()*6)+1)+bounces;

      return randomNum;

   }

}