import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);

        System.out.println();
        System.out.println("Hello, my name is Xela. I thought of a number, can you guess it?");
        System.out.println(">>>>>>Level 1<<<<<<");
        int turnsCounter = 10;
        int levelCounter = 1;
        while (turnsCounter > 0) {
            System.out.println();
            System.out.printf("You have %d tries%n", turnsCounter);
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;

            boolean isValid = true;

            if (playerInput.equals("")) {
                playerInput = "-1";
            }

            for (int i = 0; i <= playerInput.length() - 1; i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber) {
                    System.out.println("You guessed it! Level up!");
                    levelCounter++;
                    break;
                }
                if (playerNumber >= 1 && playerNumber <= 100) {
                    if (playerNumber > computerNumber) {
                        System.out.println("Too High");
                    } else {
                        System.out.println("Too Low");
                    }
                } else {
                    System.out.println("Invalid number.");
                    continue;
                }

            } else {
                System.out.println("Invalid input.");
                continue;
            }
            if (turnsCounter == 1) {
                System.out.println("You lose! Try again.");
            }
            turnsCounter--;
            System.out.println();
        }

        if (levelCounter == 2) {
            turnsCounter = 7;
            System.out.println();
            System.out.println(">>>>>>Level 2<<<<<<");
            computerNumber = randomNumber.nextInt(200);
            while (turnsCounter > 0) {
                System.out.println();
                System.out.printf("You have %d tries%n", turnsCounter);
                System.out.print("Guess a number (1-200): ");
                String playerInput = scanner.nextLine();
                int playerNumber;

                boolean isValid = true;

                for (int i = 0; i <= playerInput.length() - 1; i++) {
                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("You guessed it! Level up!");
                        levelCounter++;
                        break;
                    }
                    if (playerNumber >= 1 && playerNumber <= 200) {
                        if (playerNumber > computerNumber) {
                            System.out.println("Too High");
                        } else {
                            System.out.println("Too Low");
                        }
                    } else {
                        System.out.println("Invalid number.");
                        continue;
                    }

                } else {
                    System.out.println("Invalid input.");
                    continue;
                }

                if (turnsCounter == 1) {
                    System.out.println("You lose! Try again.");
                }
                turnsCounter--;
            }
        }
        if (levelCounter == 3) {
            turnsCounter = 5;
            System.out.println();
            System.out.println(">>>>>>Level 3<<<<<<");
            computerNumber = randomNumber.nextInt(300);
            while (turnsCounter > 0) {
                System.out.println();
                System.out.printf("You have %d tries%n", turnsCounter);
                System.out.print("Guess a number (1-300): ");
                String playerInput = scanner.nextLine();
                int playerNumber;

                boolean isValid = true;

                for (int i = 0; i <= playerInput.length() - 1; i++) {
                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("You guessed it!");
                        System.out.println();
                        System.out.println("*** GODLIKE!!! Congratulations you win the game! ***");
                        break;
                    }
                    if (playerNumber >= 1 && playerNumber <= 300) {
                        if (playerNumber > computerNumber) {
                            System.out.println("Too High");
                        } else {
                            System.out.println("Too Low");
                        }
                    } else {
                        System.out.println("Invalid number.");
                        continue;
                    }

                } else {
                    System.out.println("Invalid input.");
                    continue;
                }

                if (turnsCounter == 1) {
                    System.out.println("You lose! Try again.");
                }
                turnsCounter--;
            }
        }
    }
}