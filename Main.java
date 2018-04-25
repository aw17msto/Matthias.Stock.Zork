package Matthias.Stock;

import java.util.Scanner;
class Zork {
    public static void main(String[] args) {
        int doorStart = (int) (Math.random() * 24);
        int gruStart = (int) (Math.random() * 24);
        int playerStart = (int) (Math.random() * 24);
        Room[] rooms = new Room[24];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i, false, false);
        }
        rooms[doorStart].setDoor(true);
        rooms[gruStart].setGru(true);

        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to help me get out of this maze? Please answer with 'Yes'.");
        System.out.println( "Otherwise you can go ahead and fuck yourself you selfish bastard!");
        String answer = in.nextLine();

        if (answer.equals("Yes")) {
            System.out.println("Thank you! I shall forever be in your debt.");
            System.out.println("Let me explain the situation: You are stuck in one of the 24 rooms.");
            System.out.println("There is a monster chasing you named Gru!");
            System.out.println("You must find the exit before Gru gets you!");
            System.out.println("You have three options; 'Left', 'Right' and 'Switch'");
            System.out.println("Good luck! - Xemnas");
            System.out.println();
            answer = in.nextLine();

            while (rooms[playerStart].getRoomNumber() != doorStart && rooms[playerStart].getRoomNumber() != gruStart) {

                if (answer.equals("Left")) {
                    System.out.println();
                    System.out.println("You are in the room " + rooms[playerStart].getLeft() + ".");
                    System.out.println("Which direction do you want to go to?");
                    System.out.println("You have three options; 'Left', 'Right', or 'Switch'");
                    System.out.println("Choose wisely.");
                    System.out.println();
                    answer = in.nextLine();

                }
                if (answer.equals("Right")) {
                    System.out.println();
                    System.out.println("You are in room " + rooms[playerStart].getRight() + ".");
                    System.out.println("Which direction do you want to go to?");
                    System.out.println("You have three options; Left, Right, or Switch");
                    System.out.println();
                    answer = in.nextLine();
                }
                if (answer.equals("Switch")) {
                    System.out.println();
                    System.out.println("You are in room " + rooms[playerStart].getSwitch() + ".");
                    System.out.println("Which direction do you want to go to?");
                    System.out.println("You have three options; 'Left', 'Right', or 'Switch'");
                    System.out.println("Switch rooms!");
                    System.out.println();
                    answer = in.nextLine();
                }
            }
            if (rooms[playerStart].getRoomNumber() == doorStart){
                System.out.println( "Congratulations! You have successfully escaped and saved the world. Item obtained: Infinite Happiness ");
            }
            if (rooms[playerStart].getRoomNumber() == gruStart){
                System.out.println(" Gru has found and eaten you! GAME OVER!");
            }
        }

        in.close();
    }
}
