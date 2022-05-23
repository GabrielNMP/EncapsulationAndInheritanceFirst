package ru.skypro;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courge;

    public Gryffindor(String name, String surname, String faculty,int magicPower, int transgression, int nobility, int honor, int courge) {
        super(name, surname, faculty, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courge = courge;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourge() {
        return courge;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourge(int courge) {
        this.courge = courge;
    }

    @Override
    public String toString() {

        return super.toString() + " Faculty specifics: " +
                "Nobility-" + nobility +
                ", Honor-" + honor +
                ", Courge-" + courge +
                "\n"  ;
    }
     public int gryffindorAbility() {
        return  nobility + honor + courge;
     }

    public void bestGryffindorStudent(Gryffindor gryffindor) {
        int first = gryffindorAbility();
        int second = gryffindor.gryffindorAbility();

        if (first > second) {
            System.out.println(" Student - " + getName() + " " + getSurname()  +
                    " with coli of point " + first
                    + " better Gryffindor student then - " + gryffindor.getName() + " " + gryffindor.getSurname()+ " with coli of points " + second + "." );

        } else if (second > first) {
            System.out.println(" Student - " + gryffindor.getName() + " " + gryffindor.getSurname()+
                    " with coli of point " + second
                    + " better Gryffindor student then - " + getName() + " " + getSurname() + " with coli of points " + first + "." );

        }else  {
            System.out.println("Student " + getName() + " " + getSurname()
                    + " is studying in Gryffindor faculty as well as student "  + gryffindor.getName() + " " + gryffindor.getSurname() + " with coli of points " + first  + ".");

        }
    }
}
