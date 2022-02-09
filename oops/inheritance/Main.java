package inheritance;

public class Main {
    public static void main(String[] args) {
    
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight); 
        BoxWeight box4 = new BoxWeight(1.02, 2.02, 3.02, 4.00);
        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight); 

    }
}
