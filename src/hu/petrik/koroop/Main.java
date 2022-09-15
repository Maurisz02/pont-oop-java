package hu.petrik.koroop;

import hu.petrik.koroop.kor.Kor;

public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor(5);

        System.out.println(k1);
        System.out.println(k1.kerulet());
        System.out.println(k1.terulet());

    }
}
