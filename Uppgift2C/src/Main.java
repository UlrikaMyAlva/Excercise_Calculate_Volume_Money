import java.util.Scanner;

public class Main {

    /*
    AUTHOR
    Ulrika Eriksson, 2022-05-13

    INTRODUCTION
    A program that takes the size of a pile of cash and calculates its volume.

    IMPLEMENTATION
    The size of the bunt of cash is stored in the class trough getters and setters. The user enters the values
    that will calculate the size of the bunt. The size is after that calculated through the method buntSize, that
    is also stored in the class and called upon in the Main. The method returns the volume. Then the user is asked
    to input the amount of bunts. This value, as well as the volume of one cash bunt, is sent to the second method and
    the total volume is returned to be printed in main.

    DISCUSSION
    This one I also had to redo when my computer crashed. When I did this the first time, I had a hard time to understand
    if I should use void methods, or if I should use methods that returned value. It was hard for me to understand where
    I would put variables to "send" to the method and then how they were returned. So this one got a lot better because
    I decided to send to variables to the method totalSize. It gets a little "spaghetti" with the values sent back and forth
    and I would like to learn how to make the class "complete", where it takes the value and returns the result without
    it going back and forth.

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cashbunt information = new Cashbunt();


        System.out.println("Welcome to Cash Size Calculator.");
        System.out.println("Please enter the width: ");
        information.setWidth(scan.nextDouble());
        System.out.println("Please enter the height: ");
        information.setHeight(scan.nextDouble());
        System.out.println("Please enter the length: ");
        information.setLength(scan.nextDouble());

        //The size of the cash bunt is calculated here and stored in the variable bunt.
        double bunt = information.buntSize();


        System.out.println("Please enter the amount of cash bunts: ");
        double amount = scan.nextDouble();

        //The size is here multiplied by the amount of bunts.
        double finishedSize = information.totalSize(bunt, amount);

        System.out.println("The total size is: " + finishedSize + " CM^3");
    }
}