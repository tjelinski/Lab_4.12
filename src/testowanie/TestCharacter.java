package testowanie;

import myapp.MyCharacter;

public class TestCharacter {
    public static void main(String[] args) {
        // Utwórz obiekt klasy MyCharacter
        MyCharacter myCharacter = new MyCharacter("Gandalf", "Mag", "Człowiek", 100);

        // Ustaw wartości dla pól obiektu
        // (możesz to zrobić przy pomocy setterów lub poprzez konstruktor, jak powyżej)

        // Wyświetl informacje o postaci na konsoli
        myCharacter.displayInfo();
    }
}

