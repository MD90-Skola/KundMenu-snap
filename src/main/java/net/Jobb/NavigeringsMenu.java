package net.Jobb;

import java.util.Scanner;

public class NavigeringsMenu {
    public static void start() {
        Scanner scanner = new Scanner(System.in); // 🔹 Läser in användarens input
        NamnListor namnListor = new NamnListor(); // 🔹 Skapar listan med kunder

        while (true) {
            // 🔹 Visar huvudmenyn
            System.out.println("\n--- Välkommen till person databasen ---");
            System.out.println("1. Visa kunder");
            System.out.println("Namn/personnummer/kundnummer");
            System.out.println("- Sök - ");


            String input = scanner.nextLine().trim(); // 🔹 Tar bort extra mellanslag

            if (input.equals("1")) {
                // 🔹 Om användaren väljer "1" → Visa alla kunder
                namnListor.visaAllaKunder();
            } else if (input.equalsIgnoreCase("exit")) {
                // 🔹 Om användaren skriver "exit" → Stäng programmet
                System.out.println("Programmet avslutas...");
                scanner.close();
                return;
            } else {
                // 🔹 Annars → behandla input som en sökning
                namnListor.sokPerson(input);
            }
        }
    }
}
