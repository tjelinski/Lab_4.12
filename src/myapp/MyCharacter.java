package myapp;

public class MyCharacter {
    // Pola klasy MyCharacter
    private String imie;
    private String klasaPostaci;
    private String rasa;
    private int sila;

    // Konstruktor inicjalizujący pola
    public MyCharacter(String imie, String klasaPostaci, String rasa, int sila) {
        this.imie = imie;
        this.klasaPostaci = klasaPostaci;
        this.rasa = rasa;
        this.sila = sila;
    }

    // Metoda do wyświetlania informacji o postaci
    public void displayInfo() {
        System.out.println("Imię: " + imie);
        System.out.println("Klasa postaci: " + klasaPostaci);
        System.out.println("Rasa: " + rasa);
        System.out.println("Siła: " + sila);
    }
}

