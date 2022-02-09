public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);// will not swap as java is pass by value
        Integer x = 10;
        Integer y = 20;
        swap(x,y);// still won't swap even though object's reference value is passed because Integer is a final class
        System.out.println(a+" "+b);
        System.out.println(x+" "+y);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}
