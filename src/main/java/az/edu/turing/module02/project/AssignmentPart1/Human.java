package az.edu.turing.module02.project.AssignmentPart1;

public class Human {
    public static String name;
    public static String surname;
    public static int year;
    public static int iq;
    static Pet pet;
    static Human mother;
    static Human father;
    public static String[][] schedule;

    public static String getName() {return name;}

    public static void setName(String name) {Human.name = name;}

    public static String getSurname() {return surname;}

    public static void setSurname(String surname) {Human.surname = surname;}

    public static int getYear() {return year;}

    public static void setYear(int year) {Human.year = year;}

    public static int getIq() {return iq;}

    public static void setIq(int iq) {Human.iq = iq;}

    public Pet getPet() {return pet;}

    public void setPet(Pet pet) {this.pet = pet;}

    public Human getMother() {return mother;}

    public void setMother(Human mother) {this.mother = mother;}

    public Human getFather() {return father;}

    public void setFather(Human father) {this.father = father;}

    public static String[][] getSchedule() {return schedule;}

    public static void setSchedule(String[][] schedule) {Human.schedule = schedule;}

    public static void greetPet(){
        System.out.printf("\nHello, %s", pet.getNickname());
    }
    public static void describePet(){
        if (Pet.trickLevel > 50) {
            System.out.printf("\nI have an %s is %d years old, he is very sly", pet.getSpecies(), pet.getAge());
        } else if (Pet.trickLevel <50) {
            System.out.printf("\nI have an %s is %d years old, he is almost not sly", pet.getSpecies(), pet.getAge());
        }
    }
}
