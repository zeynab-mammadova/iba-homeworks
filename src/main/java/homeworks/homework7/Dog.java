package homeworks.homework7;

public class Dog extends Pet {

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Oops..");
    }

}
