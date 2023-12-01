import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static final int MAX_LEVEL = 3;
    private static final int[] MAX_TURNS = {10, 7, 5};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();

        while (true) {
            System.out.println("\nHello, my name is Xela. I thought of a number, can you guess it?\n");

            for (int currentLevel = 1; currentLevel <= MAX_LEVEL; currentLevel++) {
                boolean levelUp = playLevel(scanner, randomNumber, currentLevel * 100, MAX_TURNS[currentLevel - 1]);

                if (!levelUp || currentLevel == MAX_LEVEL) {
                    if (levelUp) {
                        System.out.println("You guessed it!");
                        System.out.println("\n*** GODLIKE!!! Congratulations you win the game! ***\n");
                    }
                    System.out.println("\nIf you want to play again, press [Enter]");
                    String userInput = scanner.nextLine();

                    if (userInput.isEmpty()) {
                        System.out.println("\n<<<<<<<<< NEW GAME >>>>>>>>>\n");
                        break;
                    } else {
                        System.out.println("Thank you for playing!");
                        return;
                    }
                }
            }
        }
    }

    private static boolean playLevel(Scanner scanner, Random randomNumber, int maxNumber, int maxTurns) {
        int computerNumber = randomNumber.nextInt(maxNumber);

        System.out.printf(">>>>>> Level %d <<<<<<\n\n", maxNumber / 100);

        for (int turns = maxTurns; turns > 0; turns--) {
            System.out.printf("You have %d tries%n", turns);
            int playerNumber = getPlayerInput(scanner, maxNumber);

            if (playerNumber == computerNumber) {
                if (maxNumber / 100 < MAX_LEVEL) {
                    System.out.println("You guessed it! Level up!\n");
                }
                return true;
            }

            if (playerNumber > computerNumber) {
                System.out.println("Too High\n");
            } else {
                System.out.println("Too Low\n");
            }

            if (turns == 1) {
                System.out.println("You lose! Try again.");
                return false;
            }
        }

        return false;
    }

    private static int getPlayerInput(Scanner scanner, int maxNumber) {
        int playerNumber;

        while (true) {
            System.out.printf("Guess a number (1-%d): ", maxNumber);
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                playerNumber = -1;
            } else {
                try {
                    playerNumber = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    playerNumber = -1;
                }
            }

            if (playerNumber >= 1 && playerNumber <= maxNumber) {
                return playerNumber;
            } else {
                System.out.println("Invalid input. Please enter a valid number.\n");
            }
        }
    }
}
