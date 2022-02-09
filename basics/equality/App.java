public class App {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hi";
        String s3 = new String("hi");
        
        System.out.println(s1==s2);
        System.out.println(s1=="hi");

        System.out.println(s1==s3);

        System.out.println(s1.equals("hi"));
        System.out.println(s1.equals(s3));

    }
    
}
