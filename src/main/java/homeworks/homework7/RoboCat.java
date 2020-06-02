package homeworks.homework7;

public class RoboCat extends Pet {

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }

    @Override
    public void eat() {
        super.eat();
    }
}

