package homeworks.homework7;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void respond() {
        System.out.printf("Meow I am %s\n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I peed..");
    }

}
