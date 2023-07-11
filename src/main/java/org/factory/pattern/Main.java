package org.factory.pattern;

public class Main {
    public static void main(String[] args) {
        try {
            Payment payment = PaymentFactory.create(PaymentMethod.CREDIT_CARD);
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}