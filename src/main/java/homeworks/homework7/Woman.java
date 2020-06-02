package homeworks.homework7;

public class Woman extends Human{
    @Override
    public void welcomeTheFavorite() {
        System.out.printf("I love you %s\n", getFamily().getPet().getNickname());
    }
    public void makeupLove(String makeup){
        System.out.printf("My favourite %s\n brand is Zoeva", makeup );
    }
}
