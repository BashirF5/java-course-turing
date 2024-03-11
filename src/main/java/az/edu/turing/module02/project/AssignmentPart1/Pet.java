package az.edu.turing.module02.project.AssignmentPart1;

public class Pet {
    public static String species;
    public static String nickname;
    public static int age;
    public static int trickLevel;
    public static String[] habits;

    public String getSpecies() {return species;}

    public String getNickname() {return nickname;}

    public int getAge() {return age;}

    public int getTrickLevel() {return trickLevel;}

    public String[] getHabits() {return habits;}

    public void setSpecies(String species) {this.species = species;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public void setAge(int age) {this.age = age;}

    public void setTrickLevel(int trickLevel) {this.trickLevel = trickLevel;}

    public void setHabits(String[] habits) {this.habits = habits;}

    public static void eat(){
        System.out.println("I am eating");
    }

    public static void respond(){
        System.out.printf("\nHello, owner. I am - %s." + nickname + "I miss you!");
    }

    public static void foul(){
        System.out.println("I need to cover up");
    }

    @Override
    public String toString() {
        return "{}";
    }
}
