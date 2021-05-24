import java.util.*;
public class SandL 
{

	static int snake_ladder(int plr_pos )
	{
			switch (plr_pos) 
			{
			  case 3:
			    System.out.println("U got a ladder to 22 ");
			    return plr_pos+19;
			  case 5:
			    System.out.println("U got a ladder to 8 ");
			    return plr_pos + 3;
			  case 11:
				System.out.println("U got a ladder to 26 ");
			    return plr_pos + 15;
			  case 20:
				System.out.println("U got a ladder to 29 ");
				return plr_pos + 9;
			  case 17:
				System.out.println("U got a Snake to 4 ");
				return plr_pos - 13;
			  case 19:
				System.out.println("U got a Snake to 7 ");
				return plr_pos - 12;
			  case 21:
				System.out.println("U got a Snake to 9 ");
				return plr_pos - 12;
			  case 27:
				System.out.println("U got a Snake to 1 ");
				return plr_pos - 26;
			  default:
				return plr_pos;
			}
	    
	}
	

	public static void main (String[] args) 
	{
		int[] arr = new int[30];
		for(int q=0;q<30;q++)
		{
			arr[q]=q+1;
			System.out.print(arr[q]+" ");
		}
		System.out.println();
		Scanner myPlayer = new Scanner(System.in);
		System.out.println("Player 1 enter name:");
		String player1 = myPlayer.nextLine();  
		System.out.println("Player 2 enter name:");
		String player2 = myPlayer.nextLine();
//		TimeUnit.SECONDS.sleep(1);

	    System.out.println("Player 1 is: " + player1+"\nPlayer 2 is: " + player2);
	    System.out.println(player1+ " and " + player2+ " Get rady ");
	    int plr1_pos=1;
	    int plr2_pos=1;
	    System.out.println(player1+ " at position: " + plr1_pos + " and " + player2+ " at position: "+plr2_pos);
	    
	    while((plr1_pos!=30)&&(plr2_pos!=30))
	    {
	    	Scanner sc = new Scanner(System.in);
		    System.out.println(player1+" play dice: ");
		    int dice1 = sc.nextInt();
		    plr1_pos+= dice1; 
		    plr1_pos = snake_ladder (plr1_pos);
		    System.out.println(player2+" play dice: ");		    
		    int dice2 = sc.nextInt();
		    plr2_pos+= dice2;
		    plr2_pos = snake_ladder (plr2_pos);
		    System.out.println("NOW " + player1+ " at position: " + plr1_pos + " and " + player2+ " at position: "+plr2_pos);
	    }
	    if(plr1_pos == 30)
	    	System.out.println(player1+" Winns!!!!");
	    else
	    	System.out.println(player2+" Winns!!!!");
		 
	}
}