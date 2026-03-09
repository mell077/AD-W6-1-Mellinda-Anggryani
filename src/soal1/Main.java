package soal1;

class Animal {
    void sound () {
    System . out . println ( "Suara binatang" );
    }
    }

class Cat extends Animal {
    @ Override
    void sound () {
    System . out . println ( "Meow" );
    }
    }

public class Main {
    public static void main ( String [] args ) {
    Animal a = new Cat ();
    a . sound ();
    }
}