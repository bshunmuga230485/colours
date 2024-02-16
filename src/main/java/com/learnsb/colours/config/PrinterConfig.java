package com.learnsb.colours.config;

import com.learnsb.colours.services.BluePrinter;
import com.learnsb.colours.services.ColourPrinter;
import com.learnsb.colours.services.GreenPrinter;
import com.learnsb.colours.services.RedPrinter;
import com.learnsb.colours.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {



    @Bean
    public RedPrinter redPrinter() {
        return new TamilRedPrinter();
    }
    @Bean
    public BluePrinter bluePrinter() {
        return new TamilBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new TamilGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
