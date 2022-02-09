package inheritance;

public class Box {
    double l,h,w;
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // cuboid
    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
