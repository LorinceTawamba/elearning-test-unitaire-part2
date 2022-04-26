package com.iuc.master.tl.traitement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    private double op1;
    private double op2;

    private Calculator cal;

    @BeforeEach
    public void setUp() {
        op1 = new Random().nextDouble()*50;
        op2 = new Random().nextDouble()*75;
        cal = new Calculator();
    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void additionTest() {
        // Given
        System.out.println("op1 = " + op1);
        System.out.println("op1 = " + op1);

        // When
        double expected = op1+op2;
        double resultat = cal.addition(op1, op2);

        // Then
        assertEquals(expected, resultat);
    }

    @Test
    public void soustractionTest() {
        // Given
        System.out.println("op1 = " + op1);
        System.out.println("op1 = " + op1);

        // When
        double expected = op1-op2;
        double resultat = cal.soustraction(op1, op2);

        // Then
        assertEquals(expected, resultat);
    }

    @Test
    public void multiplicationTest() {
        // Given
        System.out.println("op1 = " + op1);
        System.out.println("op1 = " + op1);

        // When
        double expected = op1*op2;
        double resultat = cal.multiplication(op1, op2);

        // Then
        assertEquals(expected, resultat);
    }

    @Test
    public void divisionTest() {
        // Given
        System.out.println("op1 = " + op1);
        System.out.println("op1 = " + op1);

        // When
        double expected = op1 / op2;
        double resultat = cal.division(op1, op2);

        // Then
        assertEquals(expected, resultat);
    }


}
