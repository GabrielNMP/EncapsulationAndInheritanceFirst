package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resurcefullness;
    private int thirstForPower;

    public Slytherin(String name, String surname, String faculty, int magicPower, int transgression, int cunning, int determination, int ambition, int resurcefullness, int thirstForPower) {
        super(name, surname, faculty, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resurcefullness = resurcefullness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResurcefullness() {
        return resurcefullness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResurcefullness(int resurcefullness) {
        this.resurcefullness = resurcefullness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Faculty specifics: " +
                "Cunning-" + cunning +
                ", Determination-" + determination +
                ", Ambition-" + ambition +
                ", Resurcefullness-" + resurcefullness +
                ", ThirstForPower-" + thirstForPower +
                "\n";
    }
    public int slytherinAbility() {
        return  cunning + determination + ambition + resurcefullness + thirstForPower;
    }

    public void bestSlytherinStudent(Slytherin slytherin) {
        int first = slytherinAbility();
        int second = slytherin.slytherinAbility();

        if (first > second) {
            System.out.println(" Student - " + getName() + " " + getSurname() +
                    " with coli of point " + first
                    + " better Slytherin student then - " + slytherin.getName() + " " + slytherin.getSurname()+ " with coli of points " + second + "." );

        } else if (second > first) {
            System.out.println(" Student - " + slytherin.getName() + " " + slytherin.getSurname()+
                    " with coli of point " + second
                    + " better Slytherin student then - " + getName() + " " + getSurname() + " with coli of points " + first + "." );

        }else  {
            System.out.println("Student " + getName() + " " + getSurname()
                    + " is studying in Slytherin faculty as well as student "  + slytherin.getName() + " " + slytherin.getSurname() + " with coli of points " + first  + ".");

        }
    }
}
