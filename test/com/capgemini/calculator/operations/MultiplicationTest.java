package com.capgemini.calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    Multiplication multiplication = new Multiplication();

    @Test
    void executeMultiplication() {
        assertEquals(2, multiplication.executeOperation(1,2));
    }
}