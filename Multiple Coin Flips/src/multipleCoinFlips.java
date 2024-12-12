import java.util.Scanner;

public class multipleCoinFlips
	{
		public static void main(String[] args)
			{
				Scanner userIntInput = new Scanner(System.in);
				Scanner userStringInput = new Scanner(System.in);
					{
						int heads = 0;
						int tails = 0;
						System.out.println("Hello! How many coins would you like to flip?");
						int coins = userIntInput.nextInt();
						for (int i = coins; i > 0; i--)
							{
								int randomNumber = (int) (Math.random() * 2);
								if (randomNumber == 0)
									{
										heads = heads + 1;
									} 
								else
									{
										tails = tails + 1;
									}
							}
						System.out.println("You flipped " + heads + " heads and " + tails + " tails!");
					}
			}
	}