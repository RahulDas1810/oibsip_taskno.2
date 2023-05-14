import java.util.*;
public class Guessing_game {
	public static void main(String[] args){
        
        int round=0;
		Scanner in=new Scanner(System.in);

		System.out.println("\n******************Welcome to Guessing game******************\n");
		System.out.println("Press 1 to play \tPress 2 to exit");
		int opt=in.nextInt();
		while(opt!=2){
			System.out.println("\n#Round: "+(++round)+"\n..........");
			
			int num=0,attempts=0,score=0;

			System.out.println("\nGuess the number within 10 attempts");
			num=(int)(Math.random()*(99)+1);
			while(attempts<10) {
				System.out.print("\nAttempt no."+(attempts+1)+"\n-----------\nEnter the number of your choice ranging from 1 to 100: ");
				int ch=in.nextInt();
				
				if(ch==num) {
					System.out.println("\n****Congratulations****\t Correct guess.\n");
					break;
				}
				else if(ch<num) {
					System.out.println("\n!!Nice try!!\tBut the number is greater than "+ch+".\n");
				}
				else{
					System.out.println("\n!!Nice try!!\tBut the number is lesser than "+ch+".\n");
				}
				attempts++;
			}
			score=((10-attempts)*100)/10; 
			System.out.println("-------------------------------------------------\nActual number was "+num+"\n");
			System.out.println("-------------------------------------------------\nTotal score is "+score+"\n");
			System.out.println("-------------------------------------------------\nDo you want to play again?\n");
			System.out.println("Press 1 to play \t Press 2 to exit");
			opt=in.nextInt();
		}
		System.out.println("\n-----Thank you-----\n--Have a good day--\n");
	}
} 