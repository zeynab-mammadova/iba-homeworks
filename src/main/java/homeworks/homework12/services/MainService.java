package homeworks.homework12.services;

import homeworks.homework12.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}
