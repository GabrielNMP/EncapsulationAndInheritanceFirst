package ru.skypro;

public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, String surname, String faculty, int magicPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Student: " +
                name +
                " " + surname +
                "\n Faculty-" + faculty +
                ", MagicPower-" + magicPower +
                ", Transgression-" + transgression +
                "\n";
    }
    public int hogwartsMainAbility() {
        return  magicPower + transgression;
    }

    public void bestHogwartsStudent(Hogwarts hogwarts) {
        int first = hogwartsMainAbility();
        int second = hogwarts.hogwartsMainAbility();

        if (first > second) {
            System.out.println(" Student - " + getName() + " " + getSurname() +
                    " with coli of point " + first
                    + " studying in Hogwarts better then student - " + hogwarts.getName() + " " + hogwarts.getSurname() + " with coli of points " + second + "." );

        } else if (second > first) {
            System.out.println(" Student - " + hogwarts.getName() + " " + hogwarts.getSurname() +
                    " with coli of point " + second
                    + " studying in Hogwarts better then student - " + getName() + " " + getSurname() + " with coli of points " + first + "." );

        }else  {
            System.out.println("Student " + getName() + " " + getSurname()
                    + " is studying in Hogwarts school of magic as well as student "
                    + hogwarts.getName() + " " + hogwarts.getSurname() + " with coli of points " + first +".");

        }
    }


}
