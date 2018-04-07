//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
for(int i=0;i<10;i++)	{	
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		// 320121214
	
		System.out.println(randomMaker);
if (randomNumber == 1 ) {JOptionPane.showMessageDialog(null,"Nice Hair"); } 
else if(randomNumber == 2) {JOptionPane.showMessageDialog(null,"You Are So Hip");}
else if(randomNumber == 3) {JOptionPane.showMessageDialog(null,"You Are Cool");}
else if(randomNumber ==4) {JOptionPane.showMessageDialog(null,"You Have Sexy Legs"); }
else if(randomNumber == 5) {JOptionPane.showMessageDialog(null,"You Smell Like Tree Fidy");}
else {JOptionPane.showMessageDialog(null,"MLG MTW DEW 360 NO-SCOPE");}	
		// 3. Use each value of randomNumber to give the user a random compliment.

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
}
