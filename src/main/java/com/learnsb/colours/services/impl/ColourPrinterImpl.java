package com.learnsb.colours.services.impl;

import com.learnsb.colours.services.BluePrinter;
import com.learnsb.colours.services.ColourPrinter;
import com.learnsb.colours.services.GreenPrinter;
import com.learnsb.colours.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
  private final RedPrinter redPrinter;
  private final BluePrinter bluePrinter;
  private final GreenPrinter greenPrinter;

  public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join("---, ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
