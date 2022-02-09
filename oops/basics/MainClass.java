package basics;

public class MainClass{
    public static void main(String[] args){
        System.out.println("Hello World");
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1);
        p1.name = "Shashi";
        p1.age = 22;
        System.out.println(p1.name + " " + p1.age.toString());
        
        System.out.println(p2);
        p2.name = "Rahul";
        p2.age = 21;
        System.out.println(p2.name + " " + p2.age.toString());
        
        p1.walk();
        p2.eat();
        p2.walk(1000);
    }
}

class Person{
    String name;
    Integer age;

    void walk(){
        System.out.println(name + " is walking.");
    }

    void walk(Integer steps){
        System.out.println(name + " has walked " + steps + " steps.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }

}