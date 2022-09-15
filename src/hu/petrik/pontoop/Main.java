package hu.petrik.pontoop;

import hu.petrik.pontoop.pont.Pont;

public class Main {

    public static void main(String[] args) {
	    Pont p1 = new Pont();
        Pont p2 = new Pont(0,0);
        Pont p3 = new Pont(3,4);
        Pont p4 = new Pont (100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Pont[] pontok = new Pont[10]; // 80 byte

        for (int i = 0 ; i< pontok.length; i++){
            pontok[i] = new Pont (100);
        }
        for(int i = 0 ; i< pontok.length; i++){
            System.out.print(pontok[i]+", ");
        }
        for(Pont p: pontok){// foreach in java
            System.out.println(p);
        }

        //Origotól legtávolabb
        int furtherIndex = 0;
        for(int i = 1; i < pontok.length;i++){
            if(pontok[furtherIndex].origoDistance() < pontok[i].origoDistance()){
                furtherIndex = i;
            }
        }


        System.out.println("A legtávolabbi pont az origótól: "+ (furtherIndex+1)+ ", Kordinátái: "+ (pontok[furtherIndex]) + ", Távolsága: "+ pontok[furtherIndex].origoDistance());

        Pont[] twoPoint = new Pont[2];
        Pont p5 = new Pont(100);
        Pont p6 = new Pont(100);

        System.out.println("A p5 és p6 távolsága: "+ p5.twoPointDistance(p6));

        Pont p7 = new Pont(100);
        System.out.println(p7);
        System.out.println(p7.onePoint());
    }
}
