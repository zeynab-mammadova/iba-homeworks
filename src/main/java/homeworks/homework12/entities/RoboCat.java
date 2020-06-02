package homeworks.homework12.entities;

public class RoboCat extends Pet implements Foulable {
    public RoboCat(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel);
    }

    @Override
    void respond() {
        System.out.println("I'm a robocat");
    }

    @Override
    void eat() {
        super.eat();
    }


    @Override
    public void foul(){
        System.out.println("Oops");
    }
}
