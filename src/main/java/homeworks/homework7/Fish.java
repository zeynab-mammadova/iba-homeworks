package homeworks.homework7;

public class Fish extends Pet{

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void respond() {
        System.out.printf("I'm s%\n",this.getNickname());
    }



}
