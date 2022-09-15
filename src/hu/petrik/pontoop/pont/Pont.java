package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont(){
        x = 0;
        y = 0;
    };

    public Pont(int x, int y){
        this.x = x;
        this.y = y;
    };

    public Pont(int n){
        this.x =coordinateGenerate(n);
        this.y =coordinateGenerate(n);
    }

    private int coordinateGenerate(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public double origoDistance(){
        //négyzetgyök sqrt, hatvanyozas pow
        return Math.sqrt(Math.pow(this.x,2)+ Math.pow(this.y, 2));
    }


    public double twoPointDistance(Pont p1){

        return Math.sqrt(Math.pow(p1.x - this.x,2) + Math.pow(p1.y - this.y,2));
    }

    public int onePoint(){
        if(this.y > 0 && this.x > 0){
            return 4;
        }else if(this.y > 0 && this.x < 0){
            return 1;
        }else if(this.y < 0 && this.x < 0){
            return 2;
        }else if(this.y < 0 && this.x > 0){
            return 3;
        }else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)",this.x, this.y);
    }
}
