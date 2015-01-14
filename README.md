# ZADACA_S09
package Zadaca 1 _ Sedmica 9

1) Na implementacije DynamicArrayInt i LinkedListInt koje smo radili na vjezbama trebate 
dodati I metode
public int getSize()
public boolean contains(int value)

2) Napravite nove klase SortedDynamicArrayInt i SortedLinkedListInt koje po svemu treba da 
nalikuju vec napisanim klasama osim sto ce elementi uvijek biti sortirani u neopadajucem 
redoslijedu (od najmanjeg ka najvecem). To znaci da treba da promijenite add metodu u 
ovim klasama.

3) Implementirajte double linked list-u, ona treba da bude slicna implementaciji koju smo radili 
na vjezbama, osim sto svaki nod osim pokaivaca na sljedeci ima i pokazivac na prethodni.


package Zadaca 2 _ Sedmica 9

1) Napisite kod za uklanjanje duplikata iz nesortirane LinkedListe.
2) Rijesite zadatak iznad bez koristenja buffera (dodatnih nizova i slicno).
Hint
Zadatak je moguce uraditi pomocu 2 petlje.

3) Napisite metodu int getMiddleValue(); koja vraca vrijednost noda na sredini single liste. U 
implementaciji LinkedListe nemate varijablu size, odnosno nemate pristupa informaciji o 
velicni liste
Hint
Koristite 2 noda za kretanje po listi, jedan malo brzi, drugi malo sporiji. Mozete i Googleati 
slow runner and fast runner LinkedList. 

4) (neobavezan) Napisite metodu int getNtoLastValue(int n); koja vraca vrijednost na nodeu 
koji je n mjesta udaljen od zadnjeg mjesta u single linked listi. U implementaciji LinkedListe 
nemate varijablu size, odnosno nemate pristupa informaciji o velicni liste.

5) (neobavezan) Implementirajet counting sort. Counting sort broji koliko puta se svaki broj 
izmedu 0 i m ponavlja u nizu, gdje je m najveci broj u nizu koji sortiramo.

package Zadaca 3 _ Sedmica 9

Date su klase Person i PhonebookApp.

Implementirati metode sortByFirstName i sortByLastName klase PhonebookApp tako da sortiraju niz osoba po imenu, odnosno prezimenu koristeći insertion sort
Obratite pažnju na rezultate pod prezimenom "Hodžić". Zakomentarišite liniju sortByFirstName i pogledajte rezultate pod istim prezimenom ponovo. Šta primjećujete? Kako biste okarakterisali ovu osobinu sortiranja? Da li se isti efekat dešava ako koristimo selection ili bubble sort?
Dat je i interface Comparator. U klasi PhonebookApp dodati metodu sortWithComparator koja prima dva argumenta: niz osoba i objekat klase koja implementira Comparator interface. Zamijenite korištenje metoda sortByFirstName i sortByLastName tako što ćete koristiti sortWithComparator s dva različito komparatora: jedan koji poredi imena, a drugi koji poredi prezimena.
Savjeti:

Zadatak 3. možete riješiti korištenjem anonimnih klasa (mada su i obične klase sasvim prihvatljive).
Prilikom implementacije compare metode, obratite pažnju da vraća iste vrijednosti kao i compareTo metoda na String objektima.
