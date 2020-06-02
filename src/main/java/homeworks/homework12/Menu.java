package homeworks.homework12;

public class Menu {

  public String show() {
    StringBuilder sb = new StringBuilder();
    sb.append("======================================================================================================\n");
    sb.append("|                                             HAPPY FAMILY                                           |\n");
    sb.append("======================================================================================================\n");
    sb.append("| 1. Fill with test data                                                                             |\n");
    sb.append("| 2. Display the entire list of families                                                             |\n");
    sb.append("| 3. Display families where the number of people is greater than the specified number                |\n");
    sb.append("| 4. Display families where the number of people is less than the specified number                   |\n");
    sb.append("| 5. Calculate the number of families where the number of members is                                 |\n");
    sb.append("| 6. Create a new family                                                                             |\n");
    sb.append("| 7. Delete a family by its index in the general list                                                |\n");
    sb.append("| 8. Edit a family by its index in the general list                                                  |\n");
    sb.append("| 9. Remove all children over the age of majority                                                    |\n");
    sb.append("| Exit                                                                                               |\n");
    sb.append("======================================================================================================\n");
    return sb.toString();
  }
}
