package numguessinggame;
import java.util.Scanner;
import java.util.Random;
public class NumGuessingGame 
{
    int num,turns=5,guess;
    public void Process()
    {
        Scanner kb=new Scanner(System.in);int temp;//to display turns
        num=1+(int)(10*Math.random());
        System.out.println("Youe have to guess a number b/w 0-10 in 5 turns .");
        for(turns=5;turns>0;turns--)
        {
            temp=turns-1;
            System.out.print("Please Enter a number: ");
            guess=kb.nextInt();
            if(guess==num)
            {
                System.out.println("Congrats! You won.");
                System.exit(0);
            }
            else if(guess>num)
            {
                System.out.println("Your number is greater than actual number.");
                System.out.println("Remaining turns: "+temp);
            }
            else
            {
                System.out.println("Your number is smaller than actual number.");
                System.out.println("Remaining turns: "+temp);
            }
        }
        System.out.println("The actual number is "+num);
       
    }
    public static void main(String[] args) 
    {
        NumGuessingGame obj=new NumGuessingGame();
        obj.Process();
        
    }
    
}
