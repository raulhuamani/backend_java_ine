package app.minterface;

import static app.Main.*;

public interface MyFirstInterface {

  static String NAME = "Hola interface";

  void printElement(String element);

  String getElementPrint();

  default void logInterface() {
    print(" Hola interface " + NAME);
  }
}
