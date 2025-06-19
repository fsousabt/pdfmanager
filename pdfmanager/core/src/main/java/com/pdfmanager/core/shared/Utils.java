package com.pdfmanager.core.shared;

import java.util.OptionalInt;

public class Utils {
  public static OptionalInt parseOptionalInt(String value) {
    try {
        return OptionalInt.of(Integer.parseInt(value));
    } catch (NumberFormatException e) {
        return OptionalInt.empty();
    }
  }
  public static int parseIntOrThrow(String value) throws NumberFormatException {
     return Integer.parseInt(value);
  }

}
