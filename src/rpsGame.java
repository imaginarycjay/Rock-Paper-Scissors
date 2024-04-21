import javax.swing.*;
import java.util.Random;

class rpsGame {
   public static void main(String[] args) {
      Random rdm = new Random();

      String[] options = {"Rock", "Paper", "Scissors"};
      int userScoreCounter = 0;
      int computerScoreCounter = 0;
      boolean loop = true;

      while (loop) {

         int userInput = JOptionPane.showOptionDialog(null, "Pick your choice", "ROCK PAPER SCISSORS GAME", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]); //get user input

         if (userInput != JOptionPane.CLOSED_OPTION) {                             //if the user didn't close, the rest of the program will run
            String computerInput = options[rdm.nextInt(options.length)];         //computer input (which is random)
            JOptionPane.showMessageDialog(null, "You chose: " + options[userInput] + "\nComputer chose: " + computerInput, "ROCK PAPER SCISSORS GAME", JOptionPane.INFORMATION_MESSAGE); //this will display both the user input and the computer's input

            if (options[userInput].equals(computerInput)) {                    //decision kung sino ba manalo
               JOptionPane.showMessageDialog(null, "It's a tie!" + "\nYour score: " + userScoreCounter + "\nComputer score: " + computerScoreCounter, "ROCK PAPER SCISSORS GAME", JOptionPane.INFORMATION_MESSAGE);
            } else if ((options[userInput].equals("Rock") && computerInput.equals("Scissors")) || (options[userInput].equals("Paper") && computerInput.equals("Rock")) || (options[userInput].equals("Scissors") && computerInput.equals("Paper"))) {
               userScoreCounter++;
               JOptionPane.showMessageDialog(null, "You win!" + "\nYour score: " + userScoreCounter + "\nComputer score: " + computerScoreCounter, "ROCK PAPER SCISSORS GAME", JOptionPane.INFORMATION_MESSAGE);
            } else {
               computerScoreCounter++;
               JOptionPane.showMessageDialog(null, "You win!" + "\nYour score: " + userScoreCounter + "\nComputer score: " + computerScoreCounter , "ROCK PAPER SCISSORS GAME", JOptionPane.INFORMATION_MESSAGE);
            }

         }

         int retry;
         retry = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "ROCK PAPER SCISSORS GAME", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if ((retry == JOptionPane.CLOSED_OPTION) || (retry == JOptionPane.NO_OPTION)) {
            loop = false;
         }

      }

   }
}
//copyright imaginarycjay
