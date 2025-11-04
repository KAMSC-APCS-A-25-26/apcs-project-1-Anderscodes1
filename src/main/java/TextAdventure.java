// Anders Gustafson, November 4th, 2025, AP CS-A,  this game takes you through the story of Episode 3: Revenge of the Sith.
// Follow instructions given and input letters/words when told to.

import java.util.Scanner;
import java.util.Random;


public class TextAdventure {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;
        while(running)
        {
            // Intro
            System.out.println("A long time ago in a galaxy far, \nfar away....\n\n\n");
            Thread.sleep(2000);
            System.out.println("                                                                                                    \n" +
                    "                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@             \n" +
                    "                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@           \n" +
                    "               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@           \n" +
                    "               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@    @@@@@@@@     @@@@@@@@          \n" +
                    "                @@@@@@@@@@@      @@@@@@@@       @@@@@@@   @@@@@@@    @@@@@@@@@@@@@@@@@@@@           \n" +
                    "                 @@@@@@@@@@@     @@@@@@@@       @@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@            \n" +
                    "    @@@@@@@@@@@@@@@@@@@@@@@@@    @@@@@@@@      @@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@@@    \n" +
                    "   @@@@@@@@@@@@@@@@@@@@@@@@@@    @@@@@@@@      @@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@   \n" +
                    "   @@@@@@@@@@@@@@@@@@@@@@@@@     @@@@@@@@     @@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@ @@@@@@@@@@@@@@@@@@@   \n" +
                    "   @@@@@@@@@@@@@@@@@@@@@@@@      @@@@@@@@     @@@@@@@@      @@@@@@@@ @@@@@@@@   @@@@@@@@@@@@@@@@@   \n" +
                    "    @@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@      @@@@@@@@@@@@@    \n" +
                    "    @@@@@@@@   @@@@@@@@   @@@@@@@  @@@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@   \n" +
                    "    @@@@@@@@@ @@@@@@@@@@ @@@@@@@@  @@@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@   \n" +
                    "     @@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@   \n" +
                    "     @@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@ @@@@@@@@    @@@@@@@@@    @@@@@@@@   @@@@@@@@@@@@@@@@@@    \n" +
                    "      @@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@   @@@@@@@    @@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@           \n" +
                    "       @@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@      @@@@@@@@@@@          \n" +
                    "       @@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \n" +
                    "        @@@@@@@@@@ @@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \n" +
                    "        @@@@@@@@@@ @@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@          \n" +
                    "         @@@@@@@@   @@@@@@@@  @@@@@@@@       @@@@@@@@ @@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@   ");
            Thread.sleep(2000);
            System.out.println("\n\n                     _____ ____ ___ ____   ___  ____  _____   ___ ___ ___ \n" +
                    "                    | ____|  _ \\_ _/ ___| / _ \\|  _ \\| ____| |_ _|_ _|_ _|\n                    " +
                    "|  _| | |_) | |\\___ \\| | | | | | |  _|    | | | | | | \n                    " +
                    "| |___|  __/| | ___) | |_| | |_| | |___   | | | | | | \n                    " +
                    "|_____|_|  |___|____/ \\___/|____/|_____| |___|___|___|");
            System.out.println("                  ____  _______     _______ _   _  ____ _____    ___  _____     \n" +
                    "                 |  _ \\| ____\\ \\   / / ____| \\ | |/ ___| ____|  / _ \\|  ___|    \n" +
                    "                 | |_) |  _|  \\ \\ / /|  _| |  \\| | |  _|  _|   | | | | |_       \n" +
                    "                 |  _ <| |___  \\ V / | |___| |\\  | |_| | |___  | |_| |  _|      \n" +
                    "                 |_|_\\_\\_____|__\\_/  |_____|_| \\_|\\____|_____|  \\___/|_|        \n" +
                    "                        |_   _| | | | ____| / ___|_ _|_   _| | | |                     \n" +
                    "                          | | | |_| |  _|   \\___ \\| |  | | | |_| |                     \n" +
                    "                          | | |  _  | |___   ___) | |  | | |  _  |                     \n" +
                    "                          |_| |_| |_|_____| |____/___| |_| |_| |_|                     \n\n");
            Thread.sleep(2000);
            System.out.println("War! The Republic is crumbling\nunder attacks by the ruthless");
            System.out.println("Sith Lord, Count Dooku.\nThere are heroes on both sides.\nEvil is everywhere.\n");
            Thread.sleep(4000);

            System.out.println("In a stunning move, the\nfiendish droid leader, General");
            System.out.println("Grievous, has swept into the\nRepublic capital and kidnapped");
            System.out.println("Chancellor Palpatine, leader of the\nGalatic Senate.\n");
            Thread.sleep(4000);


            System.out.println("As the Separatist Droid Army\nattempts to flee the besieged");
            System.out.println("capital with their valuable\nhostage, two Jedi Knights lead a");
            System.out.println("desperate mission to rescue the\ncaptive Chancellor....");
            Thread.sleep(4000);




            // Difficulty selection
            int diff = 0;
            boolean diffselect = false;
            while(diffselect==false) {
                System.out.print("\n\nWhat difficulty would you like to play (Easy, Medium, Hard): ");
                String strdiff = sc.nextLine();
                if (strdiff.equalsIgnoreCase("easy")) {
                    diff = 1;
                    diffselect = true;
                } else if (strdiff.equalsIgnoreCase("medium")) {
                    diff = 2;
                    diffselect = true;
                } else if (strdiff.equalsIgnoreCase("hard")) {
                    diff = 3;
                    diffselect = true;
                } else {
                    System.out.println("ERROR: Try Again");
                }
            }
            Thread.sleep(1000);




            // Character selection
            int storyselection = 0;
            boolean characterselect = false;
            while (characterselect==false) {
                System.out.print("\n\nWould you like to play as Anakin Skywalker or Obi-Wan Kenobi? ");
                String character = sc.nextLine();
                if (character.contains("Obi") || character.contains("Kenobi")) {
                    storyselection = 1;
                    characterselect = true;
                } else if (character.contains("Anakin") || character.contains("Skywalker")) {
                    storyselection = 2;
                    characterselect = true;
                }
                else {
                    System.out.println("ERROR: Try Again");
                }
            }
            Thread.sleep(1000);




            // Obi Wan story
            if (storyselection==1)
            {
                // Scene 1: Flying over Coruscant in the battle
                System.out.println("\n\nAnd the story begins...");
                Thread.sleep(2000);
                System.out.println("\nAnakin: \"Master, General Grievous's ship is directly ahead. The one crawling with vulture droids\"");
                Thread.sleep(1000);
                System.out.println("You: \"I see it. Oh, this is going to be easy.\"");
                Thread.sleep(1000);
                System.out.println("Anakin: \"This is where the fun begins.\"");
                Thread.sleep(1000);
                System.out.println("Anakin: \"Missiles. Pull up!\"");
                System.out.print("Press A to avoid the missiles: ");
                String saveS1 = sc.nextLine();
                if (saveS1.equalsIgnoreCase("a"))
                {
                    System.out.println("Success! You survived the missiles!");
                    Thread.sleep(1000);
                    System.out.println("\nAnakin: \"Stay on my wing. The General's Command Ship is dead ahead. Easy, pull up, head for the hangar.\"");
                    Thread.sleep(1000);
                    System.out.println("You: \"Have you noticed the shields are still up?\"");
                    Thread.sleep(1000);
                    System.out.println("Anakin shoots the shield generators\nYou and Anakin fly inside the Invisble Hand...");
                    Thread.sleep(3000);
                }
                else {
                    System.out.println("Did not pull up in time, you died.");
                }




                // Scene 2: Inside the Invisible Hand and fight with Dooku
                boolean wall = false;
                boolean cddead = false;
                if (saveS1.equalsIgnoreCase("a")) {
                    System.out.println("\n\nYou: \"The Chancellor's signal is coming from right there. The observation platform at the top of that spire\"");
                    Thread.sleep(1000);
                    System.out.println("Anakin: \"I sense Count Dooku...\"");
                    Thread.sleep(1000);
                    System.out.println("You: \"I sense a trap.\"");
                    Thread.sleep(1000);
                    System.out.println("Anakin: \"Next move?\"");
                    Thread.sleep(1000);
                    System.out.println("You: \"Spring the trap.\"\n");
                    Thread.sleep(2000);
                    System.out.println("You and Anakin go to rescue the Chancellor.");
                    Thread.sleep(1000);
                    System.out.println("Count Dooku appears in the doorway behind you...\n");
                    Thread.sleep(2000);


                    // Fight
                    System.out.println("       Battle: Obi-Wan & Anakin vs. Count Dooku");
                    Thread.sleep(500);
                    System.out.println("Controls:\nA = Attack\nB = Block");
                    Thread.sleep(500);
                    System.out.println("\nYour health: 50\nCount Dooku's health: 50\n");


                    int health = 50;
                    int CDhealth = 50;
                    int randAttack = 0;
                    int randBlock = 0;
                    String input = "";


                    // If difficulty "Easy" was chosen
                    if (diff == 1)
                    {
                        Thread.sleep(500);
                        System.out.print("Anakin attacks Count Dooku. Enter input: ");
                        Thread.sleep(500);
                        while (wall == false && cddead == false)
                        {
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("a")) {
                                randAttack = rand.nextInt(5);
                                if (randAttack <= 2) {
                                    CDhealth -= 10;
                                    if (CDhealth == 0) {
                                        System.out.println("Count Dooku Defeated!");
                                        cddead = true;
                                    }
                                    else {
                                        System.out.print("Successful Attack! Count Dooku health: " + CDhealth + ". Enter input: ");
                                        Thread.sleep(1000);
                                    }
                                }
                                else if (randAttack == 3) {
                                    System.out.print("Attack Blocked! Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else {
                                    System.out.println("\nAttack Blocked! Thrown against wall!\nHealth = 1");
                                    Thread.sleep(1000);
                                    System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                    wall = true;
                                }
                            }
                            else if (input.equalsIgnoreCase("b")) {
                                randBlock = rand.nextInt(5);
                                if (randBlock <= 2) {
                                    System.out.print("Successful Block! Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else if (randBlock == 3) {
                                    health -= 5;
                                    if (health == 0) {
                                        System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                        wall = true;
                                    }
                                    System.out.print("Block Failed! Your health: " + health + ". Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else {
                                    System.out.println("\nBlock Failed! Thrown against wall!\nHealth = 1");
                                    Thread.sleep(1000);
                                    System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                    wall = true;
                                }
                            }
                            else {
                                System.out.print("Invalid input. Enter input: ");
                                Thread.sleep(1000);
                            }
                        }
                    }


                    // If difficulty "Medium" was chosen
                    else if (diff == 2)
                    {
                        Thread.sleep(500);
                        System.out.print("Anakin attacks Count Dooku. Enter input: ");
                        Thread.sleep(1000);
                        while (wall == false && cddead == false)
                        {
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("a")) {
                                randAttack = rand.nextInt(4);
                                if (randAttack <= 1) {
                                    CDhealth -= 5;
                                    if (CDhealth == 0) {
                                        System.out.println("Count Dooku Defeated!");
                                        cddead = true;
                                    }
                                    else {
                                        System.out.print("Successful Attack! Count Dooku health: " + CDhealth + ". Enter input: ");
                                        Thread.sleep(1000);
                                    }
                                }
                                else if (randAttack == 2) {
                                    System.out.print("Attack Blocked! Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else {
                                    System.out.println("\nAttack Blocked! Thrown against wall!\nHealth = 1");
                                    Thread.sleep(1000);
                                    System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                    wall = true;
                                }
                            }
                            else if (input.equalsIgnoreCase("b")) {
                                randBlock = rand.nextInt(4);
                                if (randBlock <= 1) {
                                    System.out.print("Successful Block! Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else if (randBlock == 2) {
                                    health -= 5;
                                    if (health == 0) {
                                        System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                        wall = true;
                                    }
                                    System.out.print("Block Failed! Your health: " + health + ". Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else {
                                    System.out.println("\nBlock Failed! Thrown against wall!\nHealth = 1");
                                    Thread.sleep(1000);
                                    System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                    wall = true;
                                }
                            }
                            else {
                                System.out.print("Invalid input. Enter input: ");
                                Thread.sleep(1000);
                            }
                        }
                    }


                    // If difficulty "Hard" was chosen
                    else
                    {
                        Thread.sleep(500);
                        System.out.print("Anakin attacks Count Dooku. Enter input: ");
                        Thread.sleep(1000);
                        while (wall == false && cddead == false)
                        {
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("a")) {
                                randAttack = rand.nextInt(3);
                                if (randAttack == 0) {
                                    CDhealth -= 5;
                                    if (CDhealth == 0) {
                                        System.out.println("Count Dooku Defeated!");
                                        cddead = true;
                                    }
                                    else {
                                        System.out.print("Successful Attack! Count Dooku health: " + CDhealth + ". Enter input: ");
                                        Thread.sleep(1000);
                                    }
                                }
                                else if (randAttack == 1) {
                                    System.out.print("Attack Blocked! Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else {
                                    System.out.println("\nAttack Blocked! Thrown against wall!\nHealth = 1");
                                    Thread.sleep(1000);
                                    System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                    wall = true;
                                }
                            }
                            else if (input.equalsIgnoreCase("b")) {
                                randBlock = rand.nextInt(3);
                                if (randBlock == 0) {
                                    System.out.print("Successful Block! Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else if (randBlock == 1) {
                                    health -= 10;
                                    if (health == 0) {
                                        System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                        wall = true;
                                    }
                                    System.out.print("Block Failed! Your health: " + health + ". Enter input: ");
                                    Thread.sleep(1000);
                                }
                                else {
                                    System.out.println("\nBlock Failed! Thrown against wall!\nHealth = 1");
                                    Thread.sleep(1000);
                                    System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                    wall = true;
                                }
                            }
                            else {
                                System.out.print("Invalid input. Enter input: ");
                                Thread.sleep(1000);
                            }
                        }
                    }

                    if (cddead==true) {
                        Thread.sleep(2000);
                        System.out.println("\nChancellor: \"Wow, that was impressive. Thank you two very much\"");
                        Thread.sleep(1000);
                        System.out.println("Anakin: \"Of course, it's not a bother.\"");
                    }
                    else {
                        Thread.sleep(2000);
                        System.out.println("\nChancellor: \"Congratulations Anakin, you killed Count Dooku!\"");
                        Thread.sleep(1000);
                        System.out.println("You: \"What? You did?\"");
                        Thread.sleep(1000);
                        System.out.println("Anakin: \"Yes, while you were unconscious on the floor.\"");
                        Thread.sleep(1000);
                        System.out.println("You: \"Wow, that's very impressive. Good job Anakin, I am proud of you.\"");
                        Thread.sleep(1000);
                        System.out.println("Anakin: \"Thank you, Master\"");
                        Thread.sleep(3000);
                    }
                }




                // Scene 3: Fight with Grievous and Magnaguards, landing Invisible Hand
                if (cddead == true || wall == true)
                {
                    System.out.println("\n\nYou, Anakin, and the Chancellor are running through the Invisble Hand.");
                    Thread.sleep(1000);
                    System.out.println("A Ray Shield is deployed upon you, trapping you...");
                    Thread.sleep(2000);

                    System.out.println("\nYou enter the bridge of the Invisble Hand and meet General Grievous.");
                    Thread.sleep(1000);
                    System.out.println("General Grievous: \"Oh yes. General Kenobi, the Negotiator. We've been waiting for you. That wasn't much of a rescue.\"");
                    Thread.sleep(1000);
                    System.out.println("You: \"That depends upon your point of view. Hah!\"");
                    Thread.sleep(1000);
                    System.out.println("General Grievous: \"And Anakin Skywalker ... I was expecting someone with your reputation to be a little older.\"");
                    Thread.sleep(1000);
                    System.out.println("Anakin: \"General Grievous... You're shorter than I expected\"");
                    Thread.sleep(1000);
                    System.out.println("General Grievous: \"Ahhhh, Jedi scum...\"");
                    Thread.sleep(1000);

                    System.out.println("\nR2-D2 creates a distraction by extending all of his arms, shooting out electrical pulses, and bouncing around");
                    Thread.sleep(1000);
                    System.out.print("Press F to use the force to get your lightsaber: ");
                    String lightS3 = sc.nextLine();
                    boolean cut = false;
                    if (lightS3.equalsIgnoreCase("f")) {
                        Thread.sleep(1000);
                        System.out.print("\nPress C to cut your electrobonds: ");
                        String cutS3 = sc.nextLine();
                        if (cutS3.equalsIgnoreCase("c")) {
                            cut = true;
                        }
                        else {
                            Thread.sleep(1000);
                            System.out.println("Grievous disarms you and executes you on the spot.");
                        }
                    }
                    else {
                        Thread.sleep(1000);
                        System.out.println("General Grievous puts you in a jail cell and when the ship breaks apart, you die.");
                    }

                    // Fight with magnaguards and Grievous
                    if (cut == true)
                    {
                        Thread.sleep(2000);
                        System.out.println("\n\n       Battle: Obi-Wan & Anakin vs. General Grievous & Magnaguards");
                        Thread.sleep(500);
                        System.out.println("Controls:\nA = Attack\nB = Block");
                        Thread.sleep(500);
                        System.out.println("\nYour health: 50\nMagnaguard's health: 50");

                        int health = 50;
                        int MGhealth = 50;
                        int randAttack = 0;
                        int randBlock = 0;
                        boolean MGdead = false;
                        boolean dead = false;
                        String input = "";

                        Thread.sleep(1000);
                        System.out.println("Anakin: \"You take the magnaguards, I'll take Grievous.\"");
                        Thread.sleep(1000);
                        System.out.print("Enter input: ");

                        if (diff == 1) {
                            while (MGdead==false && dead == false) {
                                input = sc.nextLine();
                                if (input.equalsIgnoreCase("a")) {
                                    randAttack = rand.nextInt(5);
                                    if (randAttack <= 2 ) {
                                        MGhealth -= 10;
                                        if (MGhealth == 0) {
                                            Thread.sleep(1000);
                                            System.out.println("Magnaguards Defeated!");
                                            MGdead = true;
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Attack! Magnaguards health: " + MGhealth + ". Enter input: ");
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Failed Attack! Enter input: ");
                                    }
                                }
                                else if (input.equalsIgnoreCase("b")) {
                                    randBlock = rand.nextInt(5);
                                    if (randBlock <= 2) {
                                        Thread.sleep(1000);
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 5;
                                        if (health == 0) {
                                            Thread.sleep(1000);
                                            System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                            dead = true;
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Block! Health = " + health + ". Enter input: ");
                                        }
                                    }
                                }
                                else {
                                    Thread.sleep(1000);
                                    System.out.print("Invalid input. Enter input: ");
                                }
                            }
                        }

                        else if (diff == 2) {
                            while (MGdead==false && dead==false) {
                                input = sc.nextLine();
                                if (input.equalsIgnoreCase("a")) {
                                    randAttack = rand.nextInt(5);
                                    if (randAttack <= 2 ) {
                                        MGhealth -= 10;
                                        if (MGhealth == 0) {
                                            Thread.sleep(1000);
                                            System.out.println("Magnaguards Defeated!");
                                            MGdead = true;
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Attack! Magnaguards health: " + MGhealth + ". Enter input: ");
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Failed Attack! Enter input: ");
                                    }
                                }
                                else if (input.equalsIgnoreCase("b")) {
                                    randBlock = rand.nextInt(5);
                                    if (randBlock <= 2) {
                                        Thread.sleep(1000);
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 10;
                                        if (health == 0) {
                                            Thread.sleep(1000);
                                            System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                            dead = true;
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Block! Health = " + health + ". Enter input: ");
                                        }
                                    }
                                }
                                else {
                                    Thread.sleep(1000);
                                    System.out.print("Invalid input. Enter input: ");
                                }
                            }
                        }

                        else {
                            while (MGdead==false && dead==false) {
                                input = sc.nextLine();
                                if (input.equalsIgnoreCase("a")) {
                                    randAttack = rand.nextInt(5);
                                    if (randAttack <= 2 ) {
                                        MGhealth -= 10;
                                        if (MGhealth == 0) {
                                            Thread.sleep(1000);
                                            System.out.println("Magnaguards Defeated!");
                                            MGdead = true;
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Attack! Magnaguards health: " + MGhealth + ". Enter input: ");
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Failed Attack! Enter input: ");
                                    }
                                }
                                else if (input.equalsIgnoreCase("b")) {
                                    randBlock = rand.nextInt(5);
                                    if (randBlock <= 2) {
                                        Thread.sleep(1000);
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 15;
                                        if (health <= 0) {
                                            Thread.sleep(1000);
                                            System.out.println("Anakin: \"Let me take it from here, Master.\"");
                                            dead = true;
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Block! Health = " + health + ". Enter input: ");
                                        }
                                    }
                                }
                                else {
                                    Thread.sleep(1000);
                                    System.out.print("Invalid input. Enter input: ");
                                }
                            }
                        }

                        boolean holdOn = false;
                        if (MGdead == true) {
                            Thread.sleep(2000);
                            System.out.println("\nAnakin: \"Hey, I could use some help over here!\"");
                            Thread.sleep(1000);
                            System.out.println("You and Anakin quickly force Grievous against the wall.");
                            Thread.sleep(1000);
                            System.out.println("Grievous: \"You lose, General Kenobi.\"");
                            Thread.sleep(1000);
                            System.out.println("Griveous throws his electric staff at the glass: shattering it instantly.");
                            Thread.sleep(1000);
                            System.out.print("Press H to hold onto a console and not fly into space: ");
                            String holdOnInput = sc.nextLine();
                            if (holdOnInput.equalsIgnoreCase("h")) {
                                holdOn = true;
                                Thread.sleep(1000);
                                System.out.println("Success!\n");
                            }
                            else {
                                Thread.sleep(1000);
                                System.out.println("You got sucked into the vacuum of space: you died.");
                            }
                        }
                        else {
                            Thread.sleep(2000);
                            System.out.println("Anakin kills the rest of the Magnaguards, but Grievous shatters a glass window and you get sucked into space: you died.");
                        }

                        boolean openS3 = false;
                        if (holdOn = true) {
                            Thread.sleep(2000);
                            System.out.println("Anakin: \"Strap yourselves in, we're going to land.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"We've got to slow this wreck down. Open all hatches, extend all flaps, and drag fins.\"");
                            Thread.sleep(1000);
                            System.out.print("Press O to open hatches and extend flaps and drag fins: ");
                            String openInputS3 = sc.nextLine();
                            if (openInputS3.equalsIgnoreCase("o")) {
                                openS3 = true;
                                Thread.sleep(1000);
                                System.out.println("You: \"Steady, steady.\"");
                                Thread.sleep(1000);
                                System.out.println("Anakin: \"We're coming in too hot.\"");
                                Thread.sleep(1000);
                                System.out.println("Anakin safely lands the ship, however not without a bit of bumpiness.");
                                Thread.sleep(1000);
                                System.out.println("You: \"Another happy landing...\"");
                            }
                            else {
                                Thread.sleep(1000);
                                System.out.println("The ship crashes into Coruscant. You, Anakin, and the Chancellor all die...");
                            }
                        }
                        Thread.sleep(3000);


                        // Scene 4: Jedi Council Meeting about Anakin on council and location of Grievous
                        boolean accept4S = false;
                        if (openS3 == true)
                        {
                            System.out.println("\n\nAnakin is standing in front of the council, upon being asked by Chancellor Palpatine, to be his personal representative on the Jedi Council.");
                            Thread.sleep(1000);
                            System.out.println("Yoda: \"Allow this appointment lightly, the Council does not. Disturbing is this move by Chancellor Palpatine.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"I understand.\"");
                            Thread.sleep(1000);
                            System.out.println("Mace Windu: \"You are on this Council, but we do not grant you the rank of Master.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"What? How can you do this? This is outrageous, it's unfair... I'm more powerful than any of you. How can you be on the Council and not be a Master?");
                            Thread.sleep(1000);
                            System.out.println("Mace Windu: \"Take a seat, young Skywalker.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"Forgive me, Master\"\n");
                            Thread.sleep(2000);

                            System.out.println("After the meeting, you go to talk to Anakin about a new assignment for him.\n");
                            Thread.sleep(1000);
                            System.out.println("You: \"Anakin, look, I am on your side. I didn't want to put you in this situation.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"What situation?\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"The Council wants you to report on all the Chancellor's dealings. They want to know what he is up to.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"You want me to spy on the Chancellor? That's treason! Why are you asking this of me?\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"The Council is asking you...\"\n");
                            Thread.sleep(2000);

                            System.out.println("General Grievous's hideout has been found. There is a later Council meeting to discuss who shall face Grevious.");
                            Thread.sleep(1000);
                            System.out.println("Yoda: \"The capture of General Grievous will end this war. Quickly and decisively we should proceed.\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"Does everyone agree?\"");
                            Thread.sleep(1000);
                            System.out.println("All the Council members affirm.");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"The Chancellor has requested that I lead the campaign.\"");
                            Thread.sleep(1000);
                            System.out.println("Mace Windu: \"The Coucil will make up it's own mind who is to go, not the Chancellor.\"");
                            Thread.sleep(1000);
                            System.out.println("Yoda: \"A Master is needed, with more experience.\"");
                            Thread.sleep(1000);
                            System.out.println("Mace Windu: \"Given our resources, I recommend we send only one Jedi... Master Kenobi.\"");
                            Thread.sleep(1000);

                            while (accept4S == false) {
                                System.out.print("Press A to accept the mission and face General Grievous: "); // Major decision #1 for Obi-Wan
                                Thread.sleep(1000);
                                String acceptS4 = sc.nextLine();
                                if (acceptS4.equalsIgnoreCase("a")) {
                                    System.out.println("Mace Windu: \"Very well. Council is adjourned.\"");
                                    Thread.sleep(1000);
                                    accept4S = true;
                                }
                            }
                        }
                        Thread.sleep(3000);

                        // Scene 5: Fight with Grievous on Utapau
                        boolean Gdead = false;
                        if (accept4S == true)
                        {
                            System.out.println("\n\nYou head to the planet Utapau to investigate more closely where General Grievous is.");
                            Thread.sleep(1000);
                            System.out.println("He arrives and begins to talk with a representative of the people: Tion Medon.");
                            Thread.sleep(1000);
                            System.out.println("\nMedon: \"Greetings, young Jedi. What brings you to our remote sanctuary?\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"With your kind permission, I should like some fuel and to use your city as a base as I search for General Grievous.\"");
                            Thread.sleep(1000);
                            System.out.println("Medon: \"He is here! We are being held hostage. They are watching us. Tenth level. Thousands of Battle Droids.\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"I understand. Tell your people to take shelter. If you have warriors, now is the time.\"");
                            Thread.sleep(2000);

                            System.out.println("You find a corral will large Lizards. You tame one and end up using it for transportation.");
                            Thread.sleep(1000);
                            System.out.println("You sneak above the Separatist base and watch what is happening. At the right moment you jump down behind General Grievous.");
                            Thread.sleep(2000);
                            System.out.println("You: \"Hello, there.\"");
                            Thread.sleep(1000);
                            System.out.println("Grievous: \"General Kenobi, you are a bold one. Surely, you must realize: you are doomed.\"");
                            Thread.sleep(2000);

                            // Fight with Grievous
                            System.out.println("\n\n       Battle: Obi-Wan vs. General Grievous");
                            Thread.sleep(500);
                            System.out.println("Controls:\nA = Attack\nB = Block");
                            Thread.sleep(500);
                            System.out.println("\nYour health: 50\nGrievous's health: 100");

                            int healthS5 = 50;
                            int Ghealth = 100;
                            int randAttackS5 = 0;
                            int randBlockS5 = 0;
                            String inputS5 = "";

                            Thread.sleep(1000);
                            System.out.print("Enter input: ");

                            if (diff == 1) {
                                while (Gdead==false) {
                                    inputS5 = sc.nextLine();
                                    if (inputS5.equalsIgnoreCase("a")) {
                                        randAttackS5 = rand.nextInt(5);
                                        if (randAttackS5 <= 2 ) {
                                            Ghealth -= 20;
                                            if (Ghealth == 0) {
                                                Thread.sleep(1000);
                                                System.out.println("General Grievous Defeated!");
                                                Gdead = true;
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Successful Attack! Grievous's health: " + Ghealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputS5.equalsIgnoreCase("b")) {
                                        randBlockS5 = rand.nextInt(5);
                                        if (randBlockS5 <= 2) {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthS5 -= 5;
                                            if (healthS5 <= 0) {
                                                Thread.sleep(1000);
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Failed Block! Health = " + healthS5 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            else if (diff == 2) {
                                while (Gdead==false) {
                                    inputS5 = sc.nextLine();
                                    if (inputS5.equalsIgnoreCase("a")) {
                                        randAttackS5 = rand.nextInt(5);
                                        if (randAttackS5 <= 2 ) {
                                            Ghealth -= 20;
                                            if (Ghealth == 0) {
                                                Thread.sleep(1000);
                                                System.out.println("General Grievous Defeated!");
                                                Gdead = true;
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Successful Attack! Grievous's health: " + Ghealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputS5.equalsIgnoreCase("b")) {
                                        randBlockS5 = rand.nextInt(5);
                                        if (randBlockS5 <= 2) {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthS5 -= 5;
                                            if (healthS5 <= 0) {
                                                Thread.sleep(1000);
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Failed Block! Health = " + healthS5 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            else {
                                while (Gdead==false) {
                                    inputS5 = sc.nextLine();
                                    if (inputS5.equalsIgnoreCase("a")) {
                                        randAttackS5 = rand.nextInt(5);
                                        if (randAttackS5 <= 2 ) {
                                            Ghealth -= 20;
                                            if (Ghealth == 0) {
                                                Thread.sleep(1000);
                                                System.out.println("General Grievous Defeated!");
                                                Gdead = true;
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Successful Attack! Grievous's health: " + Ghealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputS5.equalsIgnoreCase("b")) {
                                        randBlockS5 = rand.nextInt(5);
                                        if (randBlockS5 <= 2) {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthS5 -= 5;
                                            if (healthS5 <= 0) {
                                                Thread.sleep(1000);
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Failed Block! Health = " + healthS5 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }
                        }
                        Thread.sleep(3000);

                        // Scene 6: Order 66 and infiltrating the Temple
                        boolean chosenVaderS6 = false;
                        if (Gdead==true)
                        {
                            System.out.println("\n\nAfter having just defeated General Grievous, you go up to your clone commander Cody.");
                            Thread.sleep(1000);
                            System.out.println("You: \"Cody, I have just defeated Grievous, it should be an easy battle from here.\"");
                            Thread.sleep(1000);
                            System.out.println("Cody: \"Yes, sir!\"");
                            Thread.sleep(2000);

                            System.out.println("You continue to fight the battle on your Lizard.");
                            Thread.sleep(1000);
                            System.out.println("After you leave, Cody gets a comlink call from Darth Sidious...");
                            Thread.sleep(1000);
                            System.out.println("Darth Sidious: \"Commander Cody, the time has come. Execute Order Sixty-Six.\"");
                            Thread.sleep(1000);
                            System.out.println("Cody: \"It will be done, My Lord. Blast him!\"");
                            Thread.sleep(1000);
                            System.out.println("A fellow Clone shoots a volley of laser blasts from behind you: knocking you off your lizard, plummeting to the bottom of the area.");
                            Thread.sleep(1000);
                            System.out.print("Luckily you land in a small lake of water. Press P to put on your breathing apparatus: ");
                            Thread.sleep(2000);

                            String breathS6 = sc.nextLine();
                            boolean breathesS6 = false;
                            if (breathS6.equalsIgnoreCase("p")) {
                                breathesS6 = true;
                                System.out.println("You successfully get out of the cave and into your starfighter.");
                                Thread.sleep(1000);
                                System.out.println("Once in space, you get contacted by Senator Organa, trying to rescue Jedi who survived the ambush.");
                                Thread.sleep(1000);
                                System.out.println("You rendezvous with Organa and see Master Yoda");
                                Thread.sleep(1000);
                                System.out.println("\nYou: \"How many other Jedi managed to survive?\"");
                                Thread.sleep(1000);
                                System.out.println("Yoda: \"Head from no one, have we.\"");
                                Thread.sleep(1000);
                                System.out.println("You: \"Have we had any contact from the Temple?\"");
                                Thread.sleep(1000);
                                System.out.println("Yoda: \"Received a coded retreat message, we have.\"");
                                Thread.sleep(1000);
                                System.out.println("Organa: \"It requests all Jedi to return to the Temple. It says that the war is over.");
                                Thread.sleep(1000);
                                System.out.println("You: \"Well then we must go back! We have to dismantle the coded signal.\"");
                                Thread.sleep(2000);

                                System.out.println("\nYou and Yoda arrive at the Jedi Temple and begin to encode a new signal into the private radio broadcasts.");
                                Thread.sleep(1000);
                                System.out.println("You: \"Wait, Master. There is something I must know...\"");
                                Thread.sleep(1000);
                                System.out.println("Yoda: \"If into the security recordings you go, only pain will you find.\"");
                                Thread.sleep(2000);
                                System.out.println("You turn on the recordings, showing Anakin killing the Jedi and being sworn into the dark side by Darth Sidious.");
                                Thread.sleep(1000);

                                while (chosenVaderS6 == false) {
                                    System.out.print("Do you want to fight Darth Sidious or Darth Vader? "); // Major decision #2 for Obi-Wan
                                    Thread.sleep(2000);
                                    String choiceS6 = sc.nextLine();
                                    if (choiceS6.contains("Vader")) {
                                        chosenVaderS6 = true;
                                        System.out.println("Yoda: \"Very well then. May the Force be with you.\"");
                                        Thread.sleep(1000);
                                    }
                                    else if (choiceS6.contains("Sidious")) {
                                        System.out.println("Yoda: \"To fight this Lord Sidious, strong enough, you are not.\"");
                                        Thread.sleep(1000);
                                    }
                                    else {
                                        System.out.println("Invalid input. Try again.");
                                        Thread.sleep(1000);
                                    }
                                }
                            }
                            else {
                                System.out.println("Could not breath underwater: you died.");
                                Thread.sleep(1000);
                            }
                        }
                        Thread.sleep(2000);


                        // Scene 7: Fight with Anakin
                        boolean Adead = false;
                        if (chosenVaderS6 == true)
                        {
                            System.out.println("\n\nYou sneak onto Padme's starship which is going to visit Anakin on Mustafar.");
                            Thread.sleep(1000);
                            System.out.println("On Mustafar, Padme and Anakin share a quick embrace.");
                            Thread.sleep(1000);
                            System.out.println("Padme: \"I was told terrible things. They said you turned to the dark side... that you killed younglings.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"They're trying to turn you against me. I don't want to hear anymore. The Jedi turned against me. Don't you turn against me.\"");
                            Thread.sleep(1000);
                            System.out.println("Padme: \"Anakin, you're breaking my heart. You're going down a path I can't follow.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"Because of Obi-Wan?\"");
                            Thread.sleep(1000);
                            System.out.println("Padme: \"Stop, stop now. Come back!\"");
                            Thread.sleep(2000);

                            System.out.println("\nYou appear in the doorway of the starship.");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"Liar! You're with him. You brought him here to kill me!\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin chokes Padme with the Force, she turns unconscious.");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"You turned her against me.\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"You have done that yourself. Your anger and your lust for power have already done that.");
                            Thread.sleep(1000);
                            System.out.println("You have allowed this Dark Lord to twist your mind. Until now... until now you have become the very thing you swore to destroy.\"");
                            Thread.sleep(2000);

                            System.out.println("Anakin: \"I see through the lies of the Jedi. I do not fear the dark side as you do.");
                            Thread.sleep(1000);
                            System.out.println("I have brought peace, freedom, justice, and security to my new Empire.\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"Your new Empire?\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"Don't make me kill you.\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"Anakin, my allegiance is to the Republic. To democracy!");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"If you're not with me, then you're my enemy.\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"Only a Sith deals in absolutes. I will do what I must.\"");
                            Thread.sleep(1000);
                            System.out.println("Anakin: \"You will try.\"");
                            Thread.sleep(3000);

                            // Fight
                            System.out.println("\n\n       Battle: Obi-Wan vs. Anakin");
                            Thread.sleep(500);
                            System.out.println("Controls:\nA = Attack\nB = Block");
                            Thread.sleep(5000);
                            System.out.println("\nYour health: 100\nAnakin's health: 200");

                            int healthOS7 = 100;
                            int Ahealth = 200;
                            int randAttackOS7 = 0;
                            int randBlockOS7 = 0;
                            String inputOS7 = "";

                            Thread.sleep(1000);
                            System.out.print("Enter input: ");

                            if (diff == 1) {
                                while (Adead==false) {
                                    inputOS7 = sc.nextLine();
                                    if (inputOS7.equalsIgnoreCase("a")) {
                                        randAttackOS7 = rand.nextInt(5);
                                        if (randAttackOS7 <= 2 ) {
                                            Ahealth -= 20;
                                            if (Ahealth == 0) {
                                                Thread.sleep(1000);
                                                System.out.println("You: \"It's over Anakin. I have the high ground!\"");
                                                Thread.sleep(1000);
                                                System.out.println("Anakin: \"You underestimate my power.\"");
                                                Thread.sleep(1000);
                                                System.out.println("You: \"Don't try it.\"");
                                                Thread.sleep(1000);
                                                System.out.println("Anakin tries to jump over you, but you slice him; cutting off both legs and one arm.");
                                                Adead = true;
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Successful Attack! Anakin's health: " + Ahealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputOS7.equalsIgnoreCase("b")) {
                                        randBlockOS7 = rand.nextInt(5);
                                        if (randBlockOS7 <= 2) {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthOS7 -= 10;
                                            if (healthOS7 <= 0) {
                                                Thread.sleep(1000);
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Failed Block! Health = " + healthOS7 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            else if (diff == 2) {
                                while (Adead==false) {
                                    inputOS7 = sc.nextLine();
                                    if (inputOS7.equalsIgnoreCase("a")) {
                                        randAttackOS7 = rand.nextInt(5);
                                        if (randAttackOS7 <= 2 ) {
                                            Ahealth -= 20;
                                            if (Ahealth == 0) {
                                                Thread.sleep(1000);
                                                System.out.println("You: \"It's over Anakin. I have the high ground!\"");
                                                Thread.sleep(1000);
                                                System.out.println("Anakin: \"You underestimate my power.\"");
                                                Thread.sleep(1000);
                                                System.out.println("You: \"Don't try it.\"");
                                                Thread.sleep(1000);
                                                System.out.println("Anakin tries to jump over you, but you slice him; cutting off both legs and one arm.");
                                                Adead = true;
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Successful Attack! Anakin's health: " + Ahealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputOS7.equalsIgnoreCase("b")) {
                                        randBlockOS7 = rand.nextInt(5);
                                        if (randBlockOS7 <= 2) {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthOS7 -= 15;
                                            if (healthOS7 <= 0) {
                                                Thread.sleep(1000);
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Failed Block! Health = " + healthOS7 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            else {
                                while (Adead==false) {
                                    inputOS7 = sc.nextLine();
                                    if (inputOS7.equalsIgnoreCase("a")) {
                                        randAttackOS7 = rand.nextInt(5);
                                        if (randAttackOS7 <= 2 ) {
                                            Ahealth -= 20;
                                            if (Ahealth == 0) {
                                                Thread.sleep(1000);
                                                System.out.println("You: \"It's over Anakin. I have the high ground!\"");
                                                Thread.sleep(1000);
                                                System.out.println("Anakin: \"You underestimate my power.\"");
                                                Thread.sleep(1000);
                                                System.out.println("You: \"Don't try it.\"");
                                                Thread.sleep(1000);
                                                System.out.println("Anakin tries to jump over you, but you slice him; cutting off both legs and one arm.");
                                                Adead = true;
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Successful Attack! Anakin's health: " + Ahealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            Thread.sleep(1000);
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputOS7.equalsIgnoreCase("b")) {
                                        randBlockOS7 = rand.nextInt(5);
                                        if (randBlockOS7 <= 2) {
                                            Thread.sleep(1000);
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthOS7 -= 20;
                                            if (healthOS7 <= 0) {
                                                Thread.sleep(1000);
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                Thread.sleep(1000);
                                                System.out.print("Failed Block! Health = " + healthOS7 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        Thread.sleep(1000);
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            Thread.sleep(2000);
                            System.out.println("You: \"You were the Chosen One! It was said that you would destory the Sith, not join them.");
                            Thread.sleep(1000);
                            System.out.println("Bring balance to the force, not leave it in darkness.\"");
                            Thread.sleep(2000);
                            System.out.println("Anakin: \"I hate you!\"");
                            Thread.sleep(1000);
                            System.out.println("You: \"You were my brother, Anakin. I loved you.\"");
                        }
                        Thread.sleep(3000);


                        // Scene 8: Aftermath and Luke & Leia's birth
                        if (Adead == true)
                        {
                            System.out.println("\nPadme is transported to a medical site on Polis Massa.");
                            Thread.sleep(1000);
                            System.out.println("You walk in.");
                            Thread.sleep(1000);
                            System.out.println("Medical Droid: \"Medically, she is completely healthy. However, for reasons we can't explain,");
                            Thread.sleep(1000);
                            System.out.println("we are losing her. We need to operate quickly if we are to save the babies. She's carrying twins.\"");
                            Thread.sleep(2000);

                            System.out.println("Padme gives birth to the first child: a boy");
                            Thread.sleep(1000);
                            System.out.println("Padme: \"Luke\"");
                            Thread.sleep(2000);

                            System.out.println("She gives birth to the second: a girl");
                            Thread.sleep(1000);
                            System.out.println("Padme: \"Leia\"");
                            Thread.sleep(2000);

                            System.out.println("Unfortunately, Padme dies just after birth.");
                            Thread.sleep(2000);

                            System.out.println("Leia goes to the Organa family: to live safely on Alderaan.");
                            Thread.sleep(1000);
                            System.out.println("Luke goes to his family in Tatooine: to be watched over by you.");
                            Thread.sleep(3000);
                        }
                    }
                }
            }






            // Anakin story
            if (storyselection==2)
            {
                // Scene 1: Flying over Coruscant in the battle
                System.out.println("\n\nAnd the story begins...");
                System.out.println("\nYou: \"Master, General Grievous's ship is directly ahead.\nThe one crawling with vulture droids\"");
                System.out.println("Obi-Wan: \"I see it. Oh, this is going to be easy.\"");
                System.out.println("You: \"This is where the fun begins.\"");
                System.out.println("You: \"Missiles. Pull up!\"");
                System.out.print("Press A to avoid the missiles: ");
                String saveS1v2 = sc.nextLine();
                String shieldS1 = "";
                if (saveS1v2.equalsIgnoreCase("a"))
                {
                    System.out.println("Success! You survived the missiles!");
                    System.out.println("\nYou: \"Stay on my wing. The General's Command Ship is dead ahead. Easy, pull up, head for the hangar.\"");
                    System.out.println("Obi-Wan: \"Have you noticed the shields are still up?\"");
                    System.out.print("Press S to shoot the shield generator: ");
                    shieldS1 = sc.nextLine();
                    if (shieldS1.equalsIgnoreCase("s")) {
                        System.out.println("Success! You destroyed the shield generator\n\nYou and Obi-Wan fly inside the Invisble Hand...");
                    }
                    else {
                        System.out.println("Unable to enter the Invisible Hand, mission failed.");
                    }
                }
                else {
                    System.out.println("Did not pull up in time, you died.");
                }




                // Scene 2: Inside the Invisible Hand and fight with Dooku
                boolean cddeadv2 = false;
                if (shieldS1.equalsIgnoreCase("s")) {
                    System.out.println("\n\nObi-Wan: \"The Chancellor's signal is coming from right there. The observation platform at the top of that spire\"");
                    System.out.println("You: \"I sense Count Dooku...\"");
                    System.out.println("Obi-Wan: \"I sense a trap.\"");
                    System.out.println("You: \"Next move?\"");
                    System.out.println("Obi-Wan: \"Spring the trap.\"\n");
                    System.out.println("You and Obi-Wan go to rescue the Chancellor.");
                    System.out.println("Count Dooku appears in the doorway behind you...\n");



                    // Fight
                    System.out.println("       Battle: Obi-Wan & Anakin vs. Count Dooku");
                    System.out.println("Controls:\nA = Attack\nB = Block");
                    System.out.println("\nYour health: 50\nCount Dooku's health: 50\n");


                    int health = 50;
                    int CDhealth = 50;
                    int randAttack = 0;
                    int randBlock = 0;
                    String input = "";




                    // If difficulty "Easy" was chosen
                    if (diff == 1)
                    {
                        System.out.print("Obi-Wan attacks Count Dooku. Enter input: ");
                        while (cddeadv2 == false)
                        {
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("a")) {
                                randAttack = rand.nextInt(5);
                                if (randAttack <= 2) {
                                    CDhealth -= 10;
                                    if (CDhealth == 0) {
                                        System.out.println("\nCount Dooku Defeated!");
                                        cddeadv2 = true;
                                    }
                                    else {
                                        System.out.print("Successful Attack! Count Dooku health: " + CDhealth + ". Enter input: ");
                                    }
                                }
                                else {
                                    System.out.print("Attack Blocked! Enter input: ");
                                }
                            }
                            else if (input.equalsIgnoreCase("b")) {
                                randBlock = rand.nextInt(5);
                                if (health == 5)
                                {
                                    System.out.print("Successful Block! Enter input: ");
                                }
                                else {
                                    if (randBlock <= 2) {
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 5;
                                        System.out.print("Block Failed! Your health: " + health + ". Enter input: ");
                                    }
                                }
                            }
                            else {
                                System.out.print("Invalid input. Enter input: ");
                            }
                        }
                    }


                    // If difficulty "Medium" was chosen
                    else if (diff == 2)
                    {
                        System.out.print("Obi-Wan attacks Count Dooku. Enter input: ");
                        while (cddeadv2 == false)
                        {
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("a")) {
                                randAttack = rand.nextInt(5);
                                if (randAttack <= 2) {
                                    CDhealth -= 5;
                                    if (CDhealth == 0) {
                                        System.out.println("\nCount Dooku Defeated!");
                                        cddeadv2 = true;
                                    }
                                    else {
                                        System.out.print("Successful Attack! Count Dooku health: " + CDhealth + ". Enter input: ");
                                    }
                                }
                                else {
                                    System.out.print("Attack Blocked! Enter input: ");
                                }
                            }
                            else if (input.equalsIgnoreCase("b")) {
                                randBlock = rand.nextInt(5);
                                if (health == 5)
                                {
                                    System.out.print("Successful Block! Enter input: ");
                                }
                                else {
                                    if (randBlock <= 2) {
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 5;
                                        System.out.print("Block Failed! Your health: " + health + ". Enter input: ");
                                    }
                                }
                            }
                            else {
                                System.out.print("Invalid input. Enter input: ");
                            }
                        }
                    }


                    // If difficulty "Hard" was chosen
                    else
                    {
                        System.out.print("Obi-Wan attacks Count Dooku. Enter input: ");
                        while (cddeadv2 == false)
                        {
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("a")) {
                                randAttack = rand.nextInt(5);
                                if (randAttack <= 2) {
                                    CDhealth -= 10;
                                    if (CDhealth == 0) {
                                        System.out.println("\nCount Dooku Defeated!");
                                        cddeadv2 = true;
                                    }
                                    else {
                                        System.out.print("Successful Attack! Count Dooku health: " + CDhealth + ". Enter input: ");
                                    }
                                }
                                else {
                                    System.out.print("Attack Blocked! Enter input: ");
                                }
                            }
                            else if (input.equalsIgnoreCase("b")) {
                                randBlock = rand.nextInt(5);
                                if (health == 10)
                                {
                                    System.out.print("Successful Block! Enter input: ");
                                }
                                else {
                                    if (randBlock <= 2) {
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 10;
                                        System.out.print("Block Failed! Your health: " + health + ". Enter input: ");
                                    }
                                }
                            }
                            else {
                                System.out.print("Invalid input. Enter input: ");
                            }
                        }
                    }


                    System.out.println("\nChancellor: \"Congratulations Anakin, you killed Count Dooku!\"");
                    System.out.println("Obi-Wan: \"What? You did?\"");
                    System.out.println("You: \"Yes, while you were unconscious on the floor.\"");
                    System.out.println("Obi-Wan: \"Wow, that's very impressive. Good job Anakin, I am proud of you.\"");
                    System.out.println("You: \"Thank you, Master\"");
                }




                // Scene 3: Fight with Grievous and Magnaguards, landing Invisible Hand
                if (cddeadv2 == true)
                {
                    System.out.println("\n\nYou, Obi-Wan, and the Chancellor are running through the Invisble Hand.");
                    Thread.sleep(1000);
                    System.out.println("A Ray Shield is deployed upon you, trapping you...");
                    Thread.sleep(2000);

                    System.out.println("\nYou enter the bridge of the Invisble Hand and meet General Grievous.");
                    System.out.println("General Grievous: \"Oh yes. General Kenobi, the Negotiator. We've been waiting for you. That wasn't much of a rescue.\"");
                    System.out.println("Obi-Wan: \"That depends upon your point of view. Hah!\"");
                    System.out.println("General Grievous: \"And Anakin Skywalker ... I was expecting someone with your reputation to be a little older.\"");
                    System.out.println("You: \"General Grievous... You're shorter than I expected\"");
                    System.out.println("General Grievous: \"Ahhhh, Jedi scum...\"");

                    System.out.println("\nR2-D2 creates a distraction by extending all of his arms, shooting out electrical pulses, and bouncing around");
                    System.out.print("Press F to use the force to get your lightsaber: ");
                    String lightS3 = sc.nextLine();
                    boolean cut = false;
                    if (lightS3.equalsIgnoreCase("f")) {
                        System.out.print("\nPress C to cut your electrobonds: ");
                        String cutS3 = sc.nextLine();
                        if (cutS3.equalsIgnoreCase("c")) {
                            cut = true;
                        }
                        else {
                            System.out.println("Grievous disarms you and executes you on the spot.");
                        }
                    }
                    else {
                        System.out.println("General Grievous puts you in a jail cell and when the ship breaks apart, you die.");
                    }

                    // Fight with Grievous
                    if (cut == true)
                    {
                        System.out.println("\n\n       Battle: Obi-Wan & Anakin vs. General Grievous & Magnaguards");
                        Thread.sleep(500);
                        System.out.println("Controls:\nA = Attack\nB = Block");
                        Thread.sleep(500);
                        System.out.println("\nYour health: 50\nGeneral Grievous's health: 50");

                        int health = 50;
                        int GGhealth = 50;
                        int randAttack = 0;
                        int randBlock = 0;
                        boolean window = false;
                        boolean dead = false;
                        String input = "";

                        System.out.println("You: \"You take the magnaguards, I'll take Grievous.\"");
                        System.out.print("Enter input: ");

                        if (diff == 1) {
                            while (window==false && dead == false) {
                                input = sc.nextLine();
                                if (input.equalsIgnoreCase("a")) {
                                    randAttack = rand.nextInt(5);
                                    if (randAttack <= 2 ) {
                                        GGhealth -= 10;
                                        if (GGhealth == 0) {
                                            System.out.println("General Grievous throws his staff into the window: shattering it instantly");
                                            window = true;
                                        }
                                        else {
                                            System.out.print("Successful Attack! Grievous's health: " + GGhealth + ". Enter input: ");
                                        }
                                    }
                                    else {
                                        System.out.print("Failed Attack! Enter input: ");
                                    }
                                }
                                else if (input.equalsIgnoreCase("b")) {
                                    randBlock = rand.nextInt(5);
                                    if (randBlock <= 2) {
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 5;
                                        if (health == 0) {
                                            System.out.println("Obi-Wan: \"Let me take it from here, Anakin.\"");
                                            dead = true;
                                        }
                                        else {
                                            System.out.print("Failed Block! Health = " + health + ". Enter input: ");
                                        }
                                    }
                                }
                                else {
                                    System.out.print("Invalid input. Enter input: ");
                                }
                            }
                        }

                        else if (diff == 2) {
                            while (window==false && dead==false) {
                                input = sc.nextLine();
                                if (input.equalsIgnoreCase("a")) {
                                    randAttack = rand.nextInt(5);
                                    if (randAttack <= 2 ) {
                                        GGhealth -= 10;
                                        if (GGhealth == 0) {
                                            System.out.println("General Grievous throws his staff into the window: shattering it instantly");
                                            window = true;
                                        }
                                        else {
                                            System.out.print("Successful Attack! Grievous's health: " + GGhealth + ". Enter input: ");
                                        }
                                    }
                                    else {
                                        System.out.print("Failed Attack! Enter input: ");
                                    }
                                }
                                else if (input.equalsIgnoreCase("b")) {
                                    randBlock = rand.nextInt(5);
                                    if (randBlock <= 2) {
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 10;
                                        if (health == 0) {
                                            System.out.println("Obi-Wan: \"Let me take it from here, Anakin.\"");
                                            dead = true;
                                        }
                                        else {
                                            System.out.print("Failed Block! Health = " + health + ". Enter input: ");
                                        }
                                    }
                                }
                                else {
                                    System.out.print("Invalid input. Enter input: ");
                                }
                            }
                        }

                        else {
                            while (window==false && dead==false) {
                                input = sc.nextLine();
                                if (input.equalsIgnoreCase("a")) {
                                    randAttack = rand.nextInt(5);
                                    if (randAttack <= 2 ) {
                                        GGhealth -= 10;
                                        if (GGhealth == 0) {
                                            System.out.println("General Grievous throws his staff into the window: shattering it instantly");
                                            window = true;
                                        }
                                        else {
                                            System.out.print("Successful Attack! Grievous's health: " + GGhealth + ". Enter input: ");
                                        }
                                    }
                                    else {
                                        System.out.print("Failed Attack! Enter input: ");
                                    }
                                }
                                else if (input.equalsIgnoreCase("b")) {
                                    randBlock = rand.nextInt(5);
                                    if (randBlock <= 2) {
                                        System.out.print("Successful Block! Enter input: ");
                                    }
                                    else {
                                        health -= 15;
                                        if (health <= 0) {
                                            System.out.println("Obi-Wan: \"Let me take it from here, Anakin.\"");
                                            dead = true;
                                        }
                                        else {
                                            System.out.print("Failed Block! Health = " + health + ". Enter input: ");
                                        }
                                    }
                                }
                                else {
                                    System.out.print("Invalid input. Enter input: ");
                                }
                            }
                        }

                        boolean holdOn = false;
                        if (window == true) {
                            System.out.print("Press H to hold onto a console and not fly into space: ");
                            String holdOnInput = sc.nextLine();
                            if (holdOnInput.equalsIgnoreCase("h")) {
                                holdOn = true;
                                System.out.println("Success!\n");
                            }
                            else {
                                System.out.println("You got sucked into the vacuum of space: you died.");
                            }
                        }

                        boolean landS3 = false;
                        if (holdOn = true) {
                            System.out.println("You: \"Strap yourselves in, we're going to land.\"");
                            System.out.println("You: \"We've got to slow this wreck down. Open all hatches, extend all flaps, and drag fins.\"");
                            System.out.println("Obi-Wan opens and extends everything");
                            System.out.println("Obi-Wan: \"Steady, steady.\"");
                            System.out.println("You: \"We're coming in too hot.\"");
                            System.out.print("Press L to land the ship: ");
                            String landInputS3 = sc.nextLine();
                            if (landInputS3.equalsIgnoreCase("l")) {
                                landS3 = true;
                                System.out.println("Success! You safely lands the ship, however not without a bit of bumpiness.");
                                System.out.println("Obi-Wan: \"Another happy landing...\"");
                            }
                            else {
                                System.out.println("The ship crashes into Coruscant. You, Obi-Wan, and the Chancellor all die...");
                            }
                            Thread.sleep(3000);
                        }


                        // Scene 4: Talk with Palpatine about being on Council and then talk with Council.
                        if (landS3 == true)
                        {
                            System.out.println("\n\nYou and Chancellor Palpatine are having a chat in Palpatine's office.");
                            System.out.println("Palpatine: \"I'm depending on you, Anakin.\"");
                            System.out.println("You: \"For what? I don't understand.\"");
                            System.out.println("Palpatine: \"To be the eyes, ears, and voice of the Republic...\"");
                            System.out.println("Palpatine: \"Anakin, I'm appointing you to be my personal representative on the Jedi Council.\"");
                            System.out.println("You: \"Me? A Master? I am overwhelmed, sir, but the Council elects its own members. They will never accept this.\"");
                            System.out.println("Palpatine: \"I think they will. They need you more than you know...\"");

                            System.out.println("\nYou are standing in front of the council, upon being asked by Chancellor Palpatine, to be his personal representative on the Jedi Council.");
                            System.out.println("Yoda: \"Allow this appointment lightly, the Council does not. Disturbing is this move by Chancellor Palpatine.\"");
                            System.out.println("You: \"I understand.\"");
                            System.out.println("Mace Windu: \"You are on this Council, but we do not grant you the rank of Master.\"");
                            System.out.println("You: \"What? How can you do this? This is outrageous, it's unfair... I'm more powerful than any of you. How can you be on the Council and not be a Master?");
                            System.out.println("Mace Windu: \"Take a seat, young Skywalker.\"");
                            System.out.println("You: \"Forgive me, Master\"\n");

                            System.out.println("After the meeting, you go to talk to Anakin about a new assignment for him.\n");
                            System.out.println("Obi-Wan: \"Anakin, look, I am on your side. I didn't want to put you in this situation.\"");
                            System.out.println("You: \"What situation?\"");
                            System.out.println("Obi-Wan: \"The Council wants you to report on all the Chancellor's dealings. They want to know what he is up to.\"");
                            System.out.println("You: \"You want me to spy on the Chancellor? That's treason! Why are you asking this of me?\"");
                            System.out.println("Obi-Wan: \"The Council is asking you...\"\n");
                            Thread.sleep(3000);
                        }

                        // Scene 5: Tragedy of Darth Plagueis the Wise and Palpatine reveals himself
                        if (landS3 == true)
                        {
                            System.out.println("Palpatine summoned you to the Galaxies Opera House...");
                            System.out.println("You: \"You wanted to see me, Chancellor.\"");
                            System.out.println("Palpatine: \"Yes, Anakin. Sit down, let me tell you a story.\"");
                            System.out.println("Palpatine: \"Did you ever hear the Tragedy of Darth Plagueis the Wise?\"");
                            System.out.println("You: \"No.\"");
                            System.out.println("Palpatine: \"I thought not. It's not a story the Jedi would tell you. Darth Plagueis was a dark lord of the Sith");
                            System.out.println("so powerful and so wise, he could use the Force to influence the midichlorians to create... life...");
                            System.out.println("He had such a knowledge of the dark side, he could even save the ones he cared about from dying.\"");
                            System.out.println("You: \"He could actually save people from death?\"");
                            System.out.println("Palpatine: \"The dark side of the Force is a pathway to many abilities some consider to be unnatural...\"");
                            System.out.println("You: \"Is it possible to learn this power?\"");
                            System.out.println("Palpatine: \"Not from a Jedi.\"\n");

                            Thread.sleep(2000);
                            System.out.println("Palpatine: \"Why don't we go to my office? I have something I'd like to show you.\"\n");
                            Thread.sleep(2000);

                            System.out.println("You: \"Chancellor, we have just received a report from Master Kenobi. He has engaged General Grievous.\"");
                            System.out.println("Palpatine: \"We can only hope Master Kenobi is up to the challenge.\"");
                            System.out.println("You: \"I should be there with him.\"");
                            System.out.println("Palpatine: \"They don't trust you, Anakin. They know your power will be too strong to control. Let me help you to know the subtleties of the Force.\"");
                            System.out.println("You: \"How do you know the ways of the Force?\"");
                            System.out.println("Palpatine: \"My mentor taught me everything about the Force... even the nature of the dark side.\"");
                            System.out.println("You: \"You know the dark side?\"");
                            System.out.println("Palpatine: \"Anakin, if one is to understand the great mystery, one must study all its aspects, not just the dogmatic, narrow view of the Jedi.");
                            System.out.println("Be careful of the Jedi, Anakin. In time they will destroy you. Let me train you.");
                            System.out.println("Only through me can you achieve a power greater than any Jedi. Learn to know the dark side of the Force, Anakin, ");
                            System.out.println("and you will be able to save your wife from certain death.\"");
                            System.out.println("You: \"What did you say?\"");
                            System.out.println("Palpatine: \"Use my knowledge, I beg you.\"");
                            System.out.println("You: \"You're a Sith Lord!\"");
                            System.out.print("Press I to ignite your lightsaber: ");

                            String saberinputS5 = sc.nextLine();
                            if (saberinputS5.equalsIgnoreCase("i")) {
                                System.out.println("\nPalpatine: \"Are you going to kill me?\"");
                                System.out.println("You: \"I would certainly like to.\"");
                                System.out.println("Palpatine: \"I know you would. I can feel your anger. It gives you focus, makes you stronger.");
                                System.out.println("Anakin: \"I am going to turn you over to the Jedi Council.\"");
                                System.out.println("Palpatine: \"Of course you should. Anakin, know the power of the dark side. The power to save your wife.\"");
                            }
                            else {
                                System.out.println("\nAnakin: \"I am going to turn you over to the Jedi Council.\"");
                                System.out.println("Palpatine: \"Of course you should. Anakin, know the power of the dark side. The power to save your wife.\"");
                            }

                            System.out.println("\nYou go to the Jedi Temple to urgently talk to Mace Windu.");
                            System.out.println("You: \"Master Windu, I must talk to you.\"");
                            System.out.println("Windu: \"What is it, Skywalker?\"");
                            System.out.println("You: \"I think Chancellor Palpatine is a Sith Lord. He knows the ways of the Force, he has been trained to use the dark side.\"");
                            System.out.println("Windu: \"Then our worst fears have been realized. We must move quickly if the Jedi Order is to survive.");
                            System.out.println("Wait for us in the Council Chambers until we return.\"");
                            System.out.println("You: \"Yes, Master.\"");
                            Thread.sleep(3000);
                        }

                        // Scene 6: Falling to Dark Side and Order 66
                        int choiceS6 = 0;
                        if (landS3 == true)
                        {
                            // Dark side
                            System.out.println("Against your better judgement, you can't help but go to Palpatine's office.");
                            System.out.println("You arrive to see Palpatine pinned against a wall with Mace Windu's lightsaber in front of him.");
                            System.out.println("Palpatine: \"Anakin! I told you it would come to this. I was right. The Jedi are taking over.\"");
                            System.out.println("Windu: \"Your plot to regain control of the Republic is over... you have lost.\"");
                            System.out.println("Palpatine: \"No! No! You will die!\"");
                            System.out.println("Palpatine shoots lightning toward Windu, but he blocks it and redirects it back to Palpatine.");
                            System.out.println("Palpatine: \"You are not one of them, Anakin. Don't let him kill me. I am your pathway to power.\n I have the power to save the one you love. You must choose.\"");
                            System.out.println("Windu: \"Don't listen to him, Anakin\"");
                            System.out.println("You: \"You can't kill him, Master. It is not the Jedi way... He must live... I need him... \"");
                            System.out.println("Windu raises his arm to strike down the Chancellor...\n");

                            while (choiceS6==0) {
                                System.out.print("Press A to stop Windu.\nOR\nPress B to let Windu kill the Chancellor.\nEnter input: "); // Major decision #1 for Anakin

                                String winduChoiceS6 = sc.nextLine();
                                if (winduChoiceS6.equalsIgnoreCase("a")) {
                                    choiceS6 = 1;
                                    System.out.println("\nYou cut off Windu's arm. In a state of disbelief, Windu is blasted by Palpatine's lightning.");
                                    System.out.println("Palpatine: \"Power! Unlimited power!\"");
                                    System.out.println("Windu flies off into Coruscant and dies from the fall."); // Yes he did die, if Disney brings him back and say he didn't, that is trash
                                    System.out.println("You: \"What have I done?\"");
                                    System.out.println("Palpatine: \"You are fulfilling your destiny, Anakin. Become my apprentice. Learn to use the dark side of the Force.\"");
                                    System.out.println("You: \"I will do whatever you ask. Just help me save padme's life. I can't live without her.");
                                    System.out.println("I pledge myself to your teachings.\"");
                                    System.out.println("Palpatine: \"Good. Good. The Force is strong with you. A powerful Sith you will become. Henceforth, you shall be known as Darth...");
                                    Thread.sleep(1000);
                                    System.out.println("Vader.\"");
                                    System.out.println("\nPalpatine puts on his dark cloak; now Darth Sidious...\n");

                                    System.out.println("Darth Sidious: \"When the Jedi learn what has transpired here, they will kill us. Every single Jedi is now an enemy of the Republic.\"");
                                    System.out.println("Palpatine: \"Go to the Jedi Temple. We will catch them off balance.");
                                    System.out.println("Do what must be done Lord Vader. Do not hesitate. Show no mercy.");
                                    System.out.println("After you have killed all the Jedi in the Temple, go to the Mustafar system. Wipe out Viceroy Gunray and the other Separatist leaders.\"");

                                    System.out.println("\nPalpatine: \"Once more, the Sith will rule the galaxy! And we shall have peace...\"");
                                }
                                else if (winduChoiceS6.equalsIgnoreCase("b")) {
                                    choiceS6=2;
                                    System.out.println("\nPalpatine dies because of Windu's attack");
                                    System.out.println("Windu: \"Good job, Anakin: you have earned my trust.\"");
                                    System.out.println("You: \"Thank you, Master.\"");

                                    System.out.println("\nBack at the Jedi Temple, you are called for a meeting of the Council.");
                                    System.out.println("Windu: \"Anakin, I believe that after the incidents regarding the Chancellor, and you revealing him to us, that you deserve the rank of Master.\"");
                                    System.out.println("You: \"Thank you, Master. I am very thankful\"");

                                    System.out.println("The war has been won and peace has finally returned to the Republic. You live with Padme, and your two children, happily ever after...");
                                }
                                else {
                                    System.out.println("Invalid input. Try again:");
                                }
                            }

                            // Operation Knightfall (Order 66/Jedi Temple)
                            if (choiceS6==1)
                            {
                                System.out.println("\n\nYou go to the Jedi Temple with a battalion of clones");
                                System.out.println("You proceed to slaughter all Jedi there, including Younglings.");
                                System.out.println("After killing everyone in the temple, you fly to Mustafar and kill all the Separatist leaders hidden there.");
                            }
                        }

                        // Scene 7: Fight with Obi-Wan jump is major decision
                        boolean medead = false;
                        if (choiceS6==1)
                        {
                            System.out.println("\n\nPadme comes to Mustafar to visit you.");
                            System.out.println("You and Padme share a quick embrace.");
                            System.out.println("Padme: \"I was told terrible things. They said you turned to the dark side... that you killed younglings.\"");
                            System.out.println("You: \"They're trying to turn you against me. I don't want to hear anymore. The Jedi turned against me. Don't you turn against me.\"");
                            System.out.println("Padme: \"Anakin, you're breaking my heart. You're going down a path I can't follow.\"");
                            System.out.println("You: \"Because of Obi-Wan?\"");
                            System.out.println("Padme: \"Stop, stop now. Come back!\"");

                            System.out.println("\nObi-Wan appears in the doorway of the starship.");
                            System.out.println("You: \"Liar! You're with him. You brought him here to kill me!\"");
                            System.out.println("You chokes Padme with the Force, she turns unconscious.");
                            System.out.println("You: \"You turned her against me.\"");
                            System.out.println("Obi-Wan: \"You have done that yourself. Your anger and your lust for power have already done that.");
                            System.out.println("You have allowed this Dark Lord to twist your mind. Until now... until now you have become the very thing you swore to destroy.\"");

                            System.out.println("You: \"I see through the lies of the Jedi. I do not fear the dark side as you do.");
                            System.out.println("I have brought peace, freedom, justice, and security to my new Empire.\"");
                            System.out.println("Obi-Wan: \"Your new Empire?\"");
                            System.out.println("You: \"Don't make me kill you.\"");
                            System.out.println("Obi-Wan: \"Anakin, my allegiance is to the Republic. To democracy!");
                            System.out.println("You: \"If you're not with me, then you're my enemy.\"");
                            System.out.println("Obi-Wan: \"Only a Sith deals in absolutes. I will do what I must.\"");
                            System.out.println("You: \"You will try.\"");

                            // Fight
                            System.out.println("\n\n       Battle: Anakin vs. Obi-Wan");
                            System.out.println("Controls:\nA = Attack\nB = Block");
                            System.out.println("\nYour health: 100\nObi-Wan's health: 200");

                            int healthAS7 = 100;
                            int Ohealth = 200;
                            int randAttackAS7 = 0;
                            int randBlockAS7 = 0;
                            String inputAS7 = "";


                            System.out.print("Enter input: ");

                            if (diff == 1) {
                                while (medead==false) {
                                    inputAS7 = sc.nextLine();
                                    if (inputAS7.equalsIgnoreCase("a")) {
                                        randAttackAS7 = rand.nextInt(5);
                                        if (randAttackAS7 <= 2 ) {
                                            Ohealth -= 20;
                                            if (Ohealth == 0) {
                                                System.out.println("Obi-Wan: \"It's over Anakin. I have the high ground!\"");
                                                System.out.println("You: \"You underestimate my power.\"");
                                                System.out.println("Obi-Wan: \"Don't try it.\"");
                                                System.out.println("You try to jump over Obi-Wan, but Obi-Wan slices you; cutting off both legs and one arm.");
                                                medead = true;
                                            }
                                            else {
                                                System.out.print("Successful Attack! Obi-Wan's health: " + Ohealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputAS7.equalsIgnoreCase("b")) {
                                        randBlockAS7 = rand.nextInt(5);
                                        if (randBlockAS7 <= 2) {
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthAS7 -= 10;
                                            if (healthAS7 <= 0) {
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                System.out.print("Failed Block! Health = " + healthAS7 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            else if (diff == 2) {
                                while (medead==false) {
                                    inputAS7 = sc.nextLine();
                                    if (inputAS7.equalsIgnoreCase("a")) {
                                        randAttackAS7 = rand.nextInt(5);
                                        if (randAttackAS7 <= 2 ) {
                                            Ohealth -= 20;
                                            if (Ohealth == 0) {
                                                System.out.println("Obi-Wan: \"It's over Anakin. I have the high ground!\"");
                                                System.out.println("You: \"You underestimate my power.\"");
                                                System.out.println("Obi-Wan: \"Don't try it.\"");
                                                System.out.println("You try to jump over Obi-Wan, but Obi-Wan slices you; cutting off both legs and one arm.");
                                                medead = true;
                                            }
                                            else {
                                                System.out.print("Successful Attack! Obi-Wan's health: " + Ohealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputAS7.equalsIgnoreCase("b")) {
                                        randBlockAS7 = rand.nextInt(5);
                                        if (randBlockAS7 <= 2) {
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthAS7 -= 15;
                                            if (healthAS7 <= 0) {
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                System.out.print("Failed Block! Health = " + healthAS7 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            else {
                                while (medead==false) {
                                    inputAS7 = sc.nextLine();
                                    if (inputAS7.equalsIgnoreCase("a")) {
                                        randAttackAS7 = rand.nextInt(5);
                                        if (randAttackAS7 <= 2 ) {
                                            Ohealth -= 20;
                                            if (Ohealth == 0) {
                                                System.out.println("Obi-Wan: \"It's over Anakin. I have the high ground!\"");
                                                System.out.println("You: \"You underestimate my power.\"");
                                                System.out.println("Obi-Wan: \"Don't try it.\"");
                                                System.out.println("You try to jump over Obi-Wan, but Obi-Wan slices you; cutting off both legs and one arm.");
                                                medead = true;
                                            }
                                            else {
                                                System.out.print("Successful Attack! Obi-Wan's health: " + Ohealth + ". Enter input: ");
                                            }
                                        }
                                        else {
                                            System.out.print("Failed Attack! Enter input: ");
                                        }
                                    }
                                    else if (inputAS7.equalsIgnoreCase("b")) {
                                        randBlockAS7 = rand.nextInt(5);
                                        if (randBlockAS7 <= 2) {
                                            System.out.print("Successful Block! Enter input: ");
                                        }
                                        else {
                                            healthAS7 -= 20;
                                            if (healthAS7 <= 0) {
                                                System.out.println("Successful Block! Enter input: ");
                                            }
                                            else {
                                                System.out.print("Failed Block! Health = " + healthAS7 + ". Enter input: ");
                                            }
                                        }
                                    }
                                    else {
                                        System.out.print("Invalid input. Enter input: ");
                                    }
                                }
                            }

                            System.out.println("Obi-Wan: \"You were the Chosen One! It was said that you would destory the Sith, not join them.");
                            System.out.println("Bring balance to the force, not leave it in darkness.\"");
                            System.out.println("You: \"I hate you!\"");
                            System.out.println("Obi-Wan: \"You were my brother, Anakin. I loved you.\"");
                        }

                        // Scene 8: Becoming Darth Vader and the rise of the Empire
                        if (medead == true)
                        {
                            System.out.println("Darth Sidious: \"Tell Captain Kagi to preapre my shuttle. I sense Lord Vader is in danger.\"");
                            System.out.println("Sidious quickly arrives to Mustafar.");
                            System.out.println("Darth Sidious: \"Anakin! Anakin! There he is. He's still alive. Get a medical capsule, immediately.\"");
                            System.out.println("You are transported back to a hospital on Coruscant to be treated.");
                            System.out.println("Prosthetic limbs are put on... and Anakin is put into his uniform.");

                            System.out.println("\nDarth Sidious: \"Lord Vader, can you hear me?\"");
                            System.out.println("You: \"Yes, my Master. Where is Padme? Is she safe? Is she all right?\"");
                            System.out.println("Darth Sidious: \"I'm afraid she died. It seems in your anger, you killed her.\"");
                            System.out.println("You: \"I couldn't have! She was alive! I felt it! No!!!");

                            System.out.println("\nA few years later, Darth Vader and Darth Sidious are on the bridge of an Imperial Star Destroyer.");
                            System.out.println("...looking at the beginning of the Death Star...");
                        }
                    }
                }
            }
            System.out.println("\n\n\n             THE END");
            System.out.println("\n          Created By:");
            System.out.println("          Anders Gustafson\n");
            System.out.println("        Based on STAR WARS by:");
            System.out.println("           George Lucas");

            System.out.print("\n\nWould you like to play again? ");
            String run = sc.nextLine();
            if (run.contains("Yes")) {
                System.out.println("\n\n\n");
            }
            else {
                running = false;
            }
        }
    }
}



