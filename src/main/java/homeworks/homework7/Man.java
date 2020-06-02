package homeworks.homework7;

public class Man extends  Human {
    @Override
    public void welcomeTheFavorite() {
        System.out.printf("I love you %s\n", getFamily().getPet().getNickname());
    }
    public void CarLove(String car){
        System.out.printf("I love %s, and my dream is to buy BMW \n", car );
    }
}
