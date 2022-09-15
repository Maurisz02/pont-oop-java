package hu.petrik.koroop.kor;

import hu.petrik.pontoop.pont.Pont;

public class Kor {
    private Pont kPont;
    private int r;

    public Kor(Pont kpont, int r){
        this.kPont = kpont;
        this.r = r;
    }

    public Kor(int r){
        this.kPont = new Pont(0,0);
        this.r = r;
    }

    public double kerulet(){
        return 2*this.r*Math.PI;
    }

    public double terulet(){
        return Math.pow(this.r,2) * Math.PI;
    }

    public Kor(){
        this.kPont = new Pont(100);
        this.r = (int) (Math.random() * ((2 * 20) + 1)) - 20;

    }

    @Override
    public String toString(){
        return String.format("A kör középpontjának koordinátája: "+this.kPont+" , sugara: "+this.r);
    }
}
