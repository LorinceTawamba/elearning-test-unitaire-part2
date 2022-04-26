package com.iuc.master.tl.traitement;

public class Calculator {

    public Calculator() {
        super();
    }

    public double addition(double op1, double op2) {
        return op1 + op2;
    }

    public double soustraction(double op1, double op2) {
        return op1 - op2;
    }

    public double multiplication(double op1, double op2) {
        return op1 * op2;
    }

    public double division(double op1, double op2) {
        if (op1 != 0) {
            return op1 / op2;
        }
        else {
            return Double.NaN;
        }
    }
}
