package homeworks.homework13.io;

public class Parser {
  public Command parse(String origin) {
    if ("1".equals(origin)) return Command.TEST_DATA_CREATE;
    else if ("2".equals(origin)) return Command.ENTIRE_LIST_SHOW;
    else if ("3".equals(origin)) return Command.FAMILY_MEMBERS_MORE_THAN_SHOW;
    else if ("4".equals(origin)) return Command.FAMILY_MEMBERS_LESS_THAN_SHOW;
    else if ("5".equals(origin)) return Command.FAMILY_MEMBERS_EQUALS_COUNT;
    else if ("6".equals(origin)) return Command.FAMILY_CREATE;
    else if ("7".equals(origin)) return Command.FAMILY_INDEX_DELETE;
    else if ("8".equals(origin)) return Command.FAMILY_INDEX_EDIT;
    else if ("9".equals(origin)) return Command.ALL_CHILDREN_ABOVE_AGE_REMOVE;
    else if ("10".equals(origin)) return Command.SAVE_DATA;
    else if ("11".equals(origin)) return Command.LOAD_DATA;
    else if ("EXIT".equalsIgnoreCase(origin)) return Command.EXIT;

    else return Command.HELP;
  }
}
