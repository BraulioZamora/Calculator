package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class CalculatorImpl
    implements Calculator {
    Memory MemoryCal;

    public BigDecimal add(BigDecimal t1, BigDecimal t2) {
        return t1.add(t2);
    }

    public BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        return t1.subtract(t2);
    }

    public BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        return t1.multiply(t2);
    }

    public BigDecimal divide(BigDecimal t1, BigDecimal t2) {
        if (!t2.equals(new BigDecimal("0"))) {
            return t1.divide(t2);

        } else {
            return null;
        }
    }

    @Override
    public void memoryClear() {
        this.MemoryCal.clear();

    }

    @Override
    public BigDecimal memoryRead() {
        return this.MemoryCal.read();
    }

    @Override
    public void memoryStore(BigDecimal value) {
        this.MemoryCal.store(value);
    }

    @Override
    public void setMemory(Memory memory) {
        this.MemoryCal = memory;
    }



    public static void main(BigDecimal[] args) {
        Calculator c = new CalculatorImpl();
        Memory m = new MemoryImpl();
        c.setMemory(m);
        c.memoryStore(BigDecimal.valueOf(2, 3));
        // holaaaaaaaaa
        // hola vengo a geder
        c.memoryClear();
        BigDecimal result = c.memoryRead();
        System.out.println(c.divide(BigDecimal.valueOf(2), BigDecimal.valueOf(3)));
    }

}
