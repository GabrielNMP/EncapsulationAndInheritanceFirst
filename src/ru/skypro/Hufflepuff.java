package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, String faculty, int magicPower, int transgression, int diligence, int loyalty, int honesty) {
        super(name, surname, faculty, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " Faculty specifics: " +
                "Diligence-" + diligence +
                ", Loyalty-" + loyalty +
                ", Honesty-" + honesty +
                "\n";
    }

    public int hufflepuffAbility() {
        return  diligence + loyalty + honesty;
    }

    public void bestHufflepuffStudent(Hufflepuff hufflepuff) {
        int first = hufflepuffAbility();
        int second = hufflepuff.hufflepuffAbility();

        if (first > second) {
            System.out.println(" Student - " + getName() + " " + getSurname() +
                    " with coli of point " + first
                    + " better Hufflepuff student then - " + hufflepuff.getName() + " " + hufflepuff.getSurname()+ " with coli of points " + second + "." );

        } else if (second > first) {
            System.out.println(" Student - " + hufflepuff.getName() + " " + hufflepuff.getSurname()+
                    " with coli of point " + second
                    + " better Hufflepuff student then - " + getName() + " " + getSurname() + " with coli of points " + first + "." );

        }else  {
            System.out.println("Student " + getName() + " " + getSurname()
                    + " is studying in Hufflepuff faculty as well as student "  + hufflepuff.getName() + " " + hufflepuff.getSurname() + " with coli of points " + first  + ".");

        }
    }
}
