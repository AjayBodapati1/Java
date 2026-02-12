import java.util.*;

public class SlotMachine {

    public static void main(String[] args){
        int balance = 100;
        int bet;
        String[] row;
        int payout;
        String playAgain = "Y";

        Scanner sc = new Scanner(System.in);
        System.out.println("************************");
        System.out.println("Welcome to Slot Machine");
        System.out.println("Symbols: 😃,🍎,⚾,❤️,💎");

        while(balance > 0){
            System.out.println("******************************");
            System.out.println("Your current balance: " + balance);
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            sc.nextLine();

            if(bet > balance){
                System.out.println("Insufficient funds..");
                continue;
            } else if(bet <= 0) {
                System.out.println("Bet should be greater than 0");
                continue;
            } else{
                balance -= bet;
                System.out.println("Spinning...");
                row = spinRow();
                printRow(row);
                payout = calculatePayout(row, bet);
                if(payout > 0){
                    System.out.println("You won: " + payout);
                    balance += payout;
                }
                else {
                    System.out.println("You lost this round.");
                }
            }

            System.out.print("Do you want to play again (Y/N): ");
            playAgain = sc.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                break;
            }
        }

        if(balance <= 0){
            System.out.println("\nInsufficient balance(=0)");
            System.out.println("Thank you for playing!");
        }
        else{
            System.out.println("\nThank you for playing!");
        }
        sc.close();
    }

    static String[] spinRow(){
        String[] symbols = {"💎","😃","🍎","⚾","❤️"};
        Random random = new Random();
        String[] row = new String[3];
        for( int i = 0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row){
        System.out.println("************");
        System.out.println(String.join(" | ", row));
        System.out.println("************");
    }

    static int calculatePayout(String[] row, int bet){
        if((row[0].equals(row[1])) && (row[1].equals(row[2])) ){
            return switch(row[0]){
                case "😃" -> bet * 3;
                case "🍎" -> bet * 4;
                case "⚾" -> bet * 5;
                case "❤️" -> bet * 10;
                case "💎" -> bet * 20;
                default -> 0;
            };
        }
        if(row[0].equals(row[1])){
            return switch(row[0]){
                case "😃" -> bet;
                case "🍎", "⚾", "❤️" -> bet * 3;
                case "💎" -> bet * 5;
                default -> 0;
            };
        }
        if(row[1].equals(row[2])){
            return switch(row[1]){
                case "😃" -> bet;
                case "🍎", "⚾", "❤️" -> bet * 3;
                case "💎" -> bet * 5;
                default -> 0;
            };
        }
        if(row[0].equals(row[2])){
            return switch(row[2]){
                case "😃" -> bet;
                case "🍎", "⚾", "❤️" -> bet * 3;
                case "💎" -> bet * 5;
                default -> 0;
            };
        }
        return 0;
    }
}
