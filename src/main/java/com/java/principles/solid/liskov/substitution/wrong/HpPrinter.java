package com.java.principles.solid.liskov.substitution.wrong;

import jdk.jshell.spi.ExecutionControl;
import lombok.SneakyThrows;

public class HpPrinter extends BasePrinter {

    @Override
    public void print(String value) {
        //TODO something
    }

    @SneakyThrows @Override
    public void scan(String value) {
        throw new ExecutionControl.NotImplementedException("NotImplementedException");
    }
}
