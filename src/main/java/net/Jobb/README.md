Programmet stängs då ner.

---

## 🏗️ **Hur är systemet uppbyggt?**
Projektet består av **tre Java-filer**:

### 🔹 **Main.java** – Startpunkt för programmet
- **Anropar `NavigeringsMenu.start()`** som visar menyn.

### 🔹 **NavigeringsMenu.java** – Hanterar menyn
- Visar huvudmenyn och väntar på att användaren väljer en funktion.
- Anropar antingen `visaAllaKunder()` eller `sokPerson(input)`.
- Användaren kan även skriva `"exit"` för att avsluta.

### 🔹 **NamnListor.java** – Lagrar och hanterar kunddata
- **Lagrar all kunddata** (förnamn, efternamn, personnummer och kundnummer).
- **`visaAllaKunder()`** → Visar alla kunders **förnamn + efternamn**.
- **`sokPerson(input)`** → Söker efter en person i databasen.

---
