import java.util.Random;
import java.util.Scanner;
class mp1 {
    static void clearConsole(){
        System.out.print("\033[H\033[2J");
    }
    static int randomInt(){
        Random random = new Random();
        int out = 1 + random.nextInt(100);
        return out;
    }



    //Is not used ↓
    static boolean guessIsRight(int input, int randomInt){
         if(input == randomInt){
            return true;
         }else{
            return false;
         }
    }
    //Is not used ↑

    public static void main(String[] args) {
        clearConsole();
        boolean correctGuess;
        Integer input = null;
        int randomInt;
        int tries;
        Scanner scan = new Scanner(System.in);
        while(true){
            correctGuess = false;
            tries = 0;
            System.out.println("A random rumber between 1 and 100 has been chosen.");
            System.out.println("Guess the number");
            randomInt = randomInt();                  
            while(correctGuess == false){
                try {
                    input = Integer.parseInt(scan.nextLine());
                }catch(Exception ex){
                    System.out.println("Numbers are the only accepted input");
                }
                if(input != null){
                    if(input == randomInt){
                        correctGuess = true;
                        clearConsole();
                        System.out.println("The number was " + randomInt);
                        if(tries == 0){
                            System.out.println("Well done, you managed to guess the number on your first try. Complete and utter witchcraft");
                        }else{
                            System.out.println("You managed to guess the number in " + tries + " tries.");
                        }
                    }else if (input < randomInt){
                        System.out.println("Go higher.");
                    }else if (input > randomInt){
                        System.out.println("Go lower.");
                    }
                }
                tries = tries + 1;
            }
        }
    }
}