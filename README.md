# README

## Översikt
Det här projektet hanterar en kunddatabas med möjlighet att:
1. Visa en lista på alla kunder.
2. Söka efter en kund baserat på namn, efternamn, personnummer eller kund-ID.

## Funktionalitet

### 1. Lista på alla kunder
- Ger en översikt över alla registrerade kunder.
- Personnummer visas **inte** i den här listan.

### 2. Sökfunktion
- Du kan söka efter en kund genom att ange:
  - Namn
  - Efternamn
  - Personnummer
  - Kund-ID

#### Filter
- Ignorerar blanksteg (whitespace).
- Ignorerar symbolen “#”.
- Skiljer inte på små och stora bokstäver (insensitivt för versaler/gemener).

### 3. Visning av personnummer
- Personnummer visas enbart när du aktivt söker upp en specifik kund med personnummer.

## Användning
1. **Visa alla kunder**: 
   - Använd `lista_kunder` eller motsvarande kommando/funktion för att se alla kunder.
   - I denna vy visas aldrig personnummer.

2. **Sök efter kund**:
   - Ange exempelvis `sök_kund [namn]`, `sök_kund [efternamn]`, `sök_kund [personnummer]` eller `sök_kund [kund-ID]`.
   - Sökmotorn ignorerar:
     - Blanksteg
     - Symbolen “#”
     - Stora och små bokstäver

3. **Få fram personnummer**:
   - Sökningen visar personnumret om en exakt matchning på personnummer eller kund-ID hittas.


