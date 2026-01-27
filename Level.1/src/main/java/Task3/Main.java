package Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<String, String>();

        try {
            Scanner fileReader = new Scanner(new File("countries.txt"));

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    countries.put(parts[0].trim(), parts[1].trim());
                }
            }
            fileReader.close();
        } catch (IOException e) {
                System.out.println("Error reading countries.txt");
                return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String username = sc.nextLine();

        List<String> countriesList = new ArrayList<>(countries.keySet());

        Collections.shuffle(countriesList);

        int score = 0;

        //Game
        for (int i = 0; i < countriesList.size() && i < 10; i ++) {
            String country = countriesList.get(i);
            String capital = countries.get(country);

            System.out.println("The capital of " + country + " is: ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(capital)) {
                System.out.println("You're correct!");
                score++;
            } else {
                System.out.println("You're wrong. The correct capital is " + capital);
            }
        }

        System.out.println("Game finished!");
        System.out.println(username + " your score is " + score + "/10");

        try {
            FileWriter writer = new FileWriter("classification.txt", true);
            writer.write(username + " - " + score + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing classification file");
        }

        sc.close();

    }
}
