package com.java.principles.solid.liskov.substitution.wrong;

public class Printer {

        BasePrinter canonPrinter = new CanonPrinter();
        BasePrinter hpPrinter = new HpPrinter();

        public void print(String value)
        {
            //canon have all attributes
            canonPrinter.print(value);
            canonPrinter.scan(value);


            //hp dosen't have scan attribute. scan will throw NotImplementedException
            hpPrinter.print(value);
            hpPrinter.scan(value);
        }

    }
