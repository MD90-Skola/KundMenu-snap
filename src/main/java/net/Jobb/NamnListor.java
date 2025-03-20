package net.Jobb;

// NamnListor.java



import java.util.ArrayList;

public class NamnListor {
    // 🔹 Här lagras all kunddata i en 2D-array
    private String[][] personer = {
            {"Mikaela", "Bergström", "790511-1126", "#4186"},
            {"Sara", "Andersson", "750121-7015", "#1304"},
            {"Erik", "Persson", "790321-7725", "#5280"},
            {"Oskar", "Persson", "700727-5997", "#8787"},
            {"Erik", "Johansson", "780502-8093", "#8438"},
            {"David", "Larsson", "781226-2430", "#4473"},
            {"Anna", "Andersson", "960924-8428", "#7095"},
            {"Anna", "Larsson", "721102-1810", "#9604"},
            {"Lisa", "Persson", "980927-1903", "#4714"},
            {"Lisa", "Nilsson", "760913-5072", "#1718"}
    };

    // 🔹 Visar alla kunder (endast namn och efternamn)
    public void visaAllaKunder() {
        System.out.println("\n--- Lista över alla kunder ---");
        for (String[] person : personer) {
            System.out.println(person[0] + " " + person[1]); // 🔹 Visar endast PersonTagg
        }
    }

    // 🔹 Söker efter en person baserat på namn, personnummer eller kundnummer
    public void sokPerson(String input) {
        ArrayList<String> resultat = new ArrayList<>();
        String inputLower = input.toLowerCase(); // 🔹 Gör sökningen skiftlägesokänslig

        for (String[] person : personer) {
            // 🔹 Jämför input med förnamn, efternamn eller kundnummer
            if (person[0].toLowerCase().equals(inputLower) ||
                    person[1].toLowerCase().equals(inputLower) ||
                    person[3].equalsIgnoreCase(input)) {
                // 🔹 Skapa en sträng med PersonID och lägg till i listan
                resultat.add(person[0] + " " + person[1] + " - " + person[2] + " - " + person[3]);
            }
        }

        if (resultat.isEmpty()) {
            // 🔹 Om ingen träff hittades
            System.out.println("\nIngen träff på '" + input + "'.");
        } else if (resultat.size() == 1) {
            // 🔹 Om exakt en träff hittades
            System.out.println("\nPerson hittad:");
            System.out.println(resultat.get(0));
        } else {
            // 🔹 Om flera träffar hittades
            System.out.println("\nFlera personer hittades:");
            for (String personInfo : resultat) {
                System.out.println(personInfo);
            }
        }
    }
}
