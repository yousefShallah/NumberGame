import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

// yousef mohammed shallah
// 120171271

public class NumbersGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random choseRandome = new Random();

        int chooseLevel;
        do {
            //array to show the menu
            String[] chooses = {"1.Easy Level", "2.Hard Level", "3.Exit"};

            //scanner the array...
            System.out.println(chooses[0] + "\n" + chooses[1] + "\n" + chooses[2]);

            //read number from user from array menu,
            // and chooses for condition and working the conditions!!!
            chooseLevel = input.nextInt();

            //condition exit the game !!
            if (chooseLevel == 3) {
                break;
            }
            //read name from user !!
            System.out.println("Enter your name:");
            String nameUser;
            nameUser = input.next();

            //here is easy level...
            // here is starting game!
            if (chooseLevel == 1) {
                int randomE;
                //choose the random number
                randomE = choseRandome.nextInt(100);
                //here is the random number the right!
                System.out.println(randomE);

                int i;
                for (i = 1; i <= 5; i++) {
                    int numberE;
                    System.out.println("Enter The Number:");
                    numberE = input.nextInt();
                    if (numberE == randomE) {
                        System.out.println("Congratulation " + nameUser + "!");
                        System.out.println("The End Game!");
                        break;
                    } else if (numberE < randomE) {
                        System.out.println("The Number Much less !");

//                    JOptionPane.showMessageDialog(null,
//                            "The Number Much less !");

                    } else if (numberE > randomE) {
                        System.out.println("The Number Much more !");

//                    JOptionPane.showMessageDialog(null,
//                            "The Number Much more !");
                    }
                }
                //condition end th game ...
                // if the user don't find the random number after end for loop !!!!!
                if (i > 5) {
                    System.out.println("Game Over " + nameUser + "\n"
                            + "Sorry The End Game!");
                }
                //trying
                System.out.println("Number of Trying: " + (i-1) + "\n");
                //if want the teacher show the random number tne end ??!!!
                //System.out.println(randomE);
            }

            //.............................................................................

            // here is hard level
            else if (chooseLevel == 2) {
                int randomH;
                //here is choose the number random
                randomH = choseRandome.nextInt(1000);
                //here is the random number !
                System.out.println(randomH);

                int x;
                for (x = 1; x <= 10; x++) {
                    int numberH;
                    System.out.println("Enter the number:");
                    numberH = input.nextInt();

                    if (numberH == randomH) {
                        System.out.println("Congratulation " + nameUser + "!");
                        System.out.println("The End Game!");
                        break;
                    } else if (numberH < randomH) {
                        System.out.println("The Number Much Less !");

//                    JOptionPane.showMessageDialog(null,
//                            "The Number Much Less !");
                    } else if (numberH > randomH) {
                        System.out.println("The Number Much More !");

//                    JOptionPane.showMessageDialog(null,
//                            "The N  umber Much More !");
                    }
                }
                //condition end th game ...
                // if the user don't find the random number after end for loop !!!!!
                if (x > 10) {
                    System.out.println("Game Over " + nameUser + "\n"
                            + "Sorry The End Game!\n");
                }
                //number of trying !!
                System.out.println("Number of Trying: " + (x-1) + "\n");

                //if want the teacher show the random number tne end ??!!!
                //System.out.println(randomH);
            }
        }while (chooseLevel != 3);
    }
}

