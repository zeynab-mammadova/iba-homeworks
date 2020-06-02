package homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        Human Micheal = new Human("Micheal", "Karleone", 1970, 105, new Human("Jane", "Karleone", 1970), new Human("Vito", "Karleone", 1970), new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"}));
        Human mother = new Human("Jane", "Karleone", 1970, 110, new Human(), new Human(), new Pet());
        Human father = new Human("Vito", "Karleone", 1970, 90, new Human(), new Human(), new Pet());
        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "sleep", "drink"});

        Human Zeynab = new Human("Zeynab", "Mammadova", 2001, 100, new Human("Elnara", "Mammadova", 1983), new Human(), new Pet("hamster", "Yulaf", 3, 60, new String[]{"eating", "playing", "sleeping"}));
        Human Mubariz = new Human("Mubariz", "Mammadov", 1969, 105, new Human(), new Human("Cemshid", "Mammadov", 1940), new Pet("hamster", "Yulaf", 3, 60, new String[]{"eating", "playing", "sleeping"}));
        Human Elnara = new Human("Elnara", "Mammadova", 1983, 106, new Human(), new Human("Hesen", "Qasimov", 1942), new Pet("hamster", "Yulaf", 3, 60, new String[]{"eat", "play", "sleep"}));

        Human Doja = new Human("Doja", "Sani", 1973);
        Human Nick = new Human("Nick", "Sani", 1980);
        Human Jack = new Human("Jack", "Sani", 2002, 89, new Human("Doja", "Sani", 1983), new Human("Nick", "Sani", 1980), new Pet("dog", "Pug", 1, 45, new String[]{"jumping", "sleeping", "eating,woofing"}));
        Pet JackPet = new Pet("dog", "Pug", 1, 45, new String[]{"jumping", "sleeping", "eating,woofing"});

        Jack.greatPet();
        Jack.describePet();
        Jack.feedPet(false);
        JackPet.eat();
        JackPet.foul();
        JackPet.respond();
        System.out.println(Micheal.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(pet.toString());
        System.out.println(Zeynab.toString());
        System.out.println(Mubariz.toString());
        System.out.println(Elnara.toString());
        System.out.println(Doja.toString());
        System.out.println(Jack.toString());
        System.out.println(JackPet.toString());
    }
}