package task3;

import java.io.InputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        try (InputStream is = Main.class.getResourceAsStream("/countries.txt")) {
            if (is == null) {
                System.out.println("System could not find countries.txt in resources.");
                return;
            }
            Scanner fileReader = new Scanner(is);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                String lineWithComma = line.replace(" ", ",");
                String[] parts = lineWithComma.split(",");

                if (parts.length == 2) {
                    countries.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading countries.txt from resources.");
            return;
        }

        if (countries.isEmpty()) {
            System.out.println("No data found in countries.txt.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String username = sc.nextLine();

        List<String> countriesList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesList);

        int score = 0;

        for (int i = 0; i < countriesList.size() && i < 10; i++) {
            String country = countriesList.get(i);
            String capital = countries.get(country);

            System.out.println("Question " + (i + 1) + ": What is the capital of " + country + "?");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct capital is " + capital);
            }
        }

        System.out.println("Game finished!");
        System.out.println(username + ", your score is " + score + "/10");

        try (FileWriter writer = new FileWriter("classification.txt", true)) {
            writer.write(username + " - " + score + "\n");
        } catch (IOException e) {
            System.out.println("Error writing classification file.");
        }

        sc.close();
    }
}
