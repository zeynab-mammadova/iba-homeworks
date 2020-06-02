package homeworks.homework13.services;

import homeworks.homework13.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}
