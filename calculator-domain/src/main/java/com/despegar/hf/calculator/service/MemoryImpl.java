package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class MemoryImpl
    implements Memory {
    BigDecimal mem;

    @Override
    public void clear() {
        this.mem = null;

    }

    @Override
    public BigDecimal read() {
        // TODO Auto-generated method stub
        return this.mem;
    }

    @Override
    public void store(BigDecimal value) {
        this.mem = value;

    }

}
