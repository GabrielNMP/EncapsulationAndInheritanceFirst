package ru.skypro;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, String surname, String faculty, int magicPower, int transgression, int intelligence, int wisdom, int wit, int creative) {
        super(name, surname, faculty, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() + " Faculty specifics: " +
                "Intelligence-" + intelligence +
                ", Wisdom-" + wisdom +
                ", Wit-" + wit +
                ", Creative-" + creative +
                "\n";
    }

    public int ravenclawAbility() {
        return  intelligence + wisdom + wit + creative;
    }

    public void bestRavenclawStudent(Ravenclaw ravenclaw) {
        int first = ravenclawAbility();
        int second = ravenclaw.ravenclawAbility();

        if (first > second) {
            System.out.println(" Student - " + getName() + " " + getSurname() +
                    " with coli of point " + first
                    + " better Ravenclaw student then - " + ravenclaw.getName() + " " + ravenclaw.getSurname()+ " with coli of points " + second + "." );

        } else if (second > first) {
            System.out.println(" Student - " + ravenclaw.getName() + " " + ravenclaw.getSurname()+
                    " with coli of point " + second
                    + " better Ravenclaw student then - " + getName() + " " + getSurname() + " with coli of points " + first + "." );

        }else  {
            System.out.println("Student " + getName() + " " + getSurname()
                    + " is studying in Ravenclaw faculty as well as student "  + ravenclaw.getName() + " " + ravenclaw.getSurname() + " with coli of points " + first  + ".");

        }
    }
}
