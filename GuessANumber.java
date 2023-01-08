import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);

        System.out.println("Level 1");
        int turnsCounter = 1;
        int levelCounter = 1;
        while (turnsCounter <= 10) {
            System.out.print("Guess a number (1-100): ");
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
                if (playerNumber >= 1 && playerNumber <= 100) {
                    if (playerNumber > computerNumber) {
                        System.out.println("Too High");
                    } else {
                        System.out.println("Too Low");
                    }
                } else {
                    System.out.println("Invalid number.");
                }

            } else {
                System.out.println("Invalid input.");
            }
            turnsCounter++;
            if (turnsCounter > 10) {
                System.out.println("You lose! Try again.");
            }
        }

        if (levelCounter == 2) {
            turnsCounter = 1;
            System.out.println();
            System.out.println("Level 2");
            computerNumber = randomNumber.nextInt(200);
            while (turnsCounter <= 7) {
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
                    }

                } else {
                    System.out.println("Invalid input.");
                }
                turnsCounter++;
                if (turnsCounter > 7) {
                    System.out.println("You lose! Try again.");
                }
            }
        }
        if (levelCounter == 3) {
            turnsCounter = 1;
            System.out.println();
            System.out.println("Level 3");
            computerNumber = randomNumber.nextInt(300);
            while (turnsCounter <= 5) {
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
                        System.out.println("***Congratulations you win the game!***");
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
                    }

                } else {
                    System.out.println("Invalid input.");
                }
                turnsCounter++;
                if (turnsCounter > 5) {
                    System.out.println("You lose! Try again.");
                }
            }
        }
    }
}