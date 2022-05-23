package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry", "Potter", "Gryffindor",80,91,90, 78, 46);
        Gryffindor hermione = new Gryffindor("Hermione", "Granger", "Gryffindor",90,88, 90, 79, 90);
        Gryffindor ron = new Gryffindor("Ron", "Weasley", "Gryffindor",60,81, 89, 80, 78);
        Slytherin draco = new Slytherin("Draco", "Malfoy", "Slytherin",80,91, 78, 82, 88, 90, 91);
        Slytherin graham = new Slytherin("Graham", "Montegue", "Slytherin",80,91, 78, 89, 67, 54, 60);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", "Slytherin",80,91, 54, 67, 56, 70, 64);
        Hufflepuff zacharias = new Hufflepuff("Zacharias", "Smith", "Hufflepuff",80,91, 88, 78, 56);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", "Hufflepuff",80,91, 67, 79, 88);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley","Hufflepuff",40,91, 67, 67, 55);
        Ravenclaw cho = new Ravenclaw("Cho", "Chang","Ravenclaw",80,91, 90, 90, 90, 90);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil","Ravenclaw", 80,91, 90, 81, 45, 78);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby","Ravenclaw", 80,91, 45, 67, 88, 34);


        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(ron);
        System.out.println(draco);
        System.out.println(graham);
        System.out.println(gregory);
        System.out.println(zacharias);
        System.out.println(cedric);
        System.out.println(justin);
        System.out.println(cho);
        System.out.println(padma);
        System.out.println(marcus);

    harry.bestHogwartsStudent(justin);
    hermione.bestGryffindorStudent(ron);
    graham.bestSlytherinStudent(draco);
    cedric.bestHufflepuffStudent(justin);
    cho.bestRavenclawStudent(marcus);

    }


}
