

public class Source {
    public static void main(String[] args) {
        // store 5 roll nos
        int [] numbers = new int [5];

        // store 5 names
        String [] names = new String [5];

        //data of 5 students : { roll no, marks, students}
        Student [] students = new Student[5];
        // students[0] = new Student();
        // students[0].rno = 1;
        System.out.println(Student.i);
        // just declaring
        Student shashi = new Student(13, "shashi", 18.9f);
        Student rashmi = new Student(12, "rashmi", 99.9f);

        System.out.println(shashi.name);
        System.out.println(rashmi.name);

        Student temp = new Student();

        temp = shashi;
        shashi = rashmi;
        rashmi = temp;
        System.out.println(shashi.name);
        System.out.println(rashmi.name);
        shashi = new Student();
        System.out.println(shashi.name);

        // System.out.println(shashi);
        // shashi = new Student();
        // System.out.println(shashi.toString() + " " + shashi.getClass() + " " + Integer.toHexString(shashi.hashCode()) );
        
        Student random = new Student(rashmi);
        System.out.println(random.name);


    }   
}
class Student{
    int rno;
    String name;
    float marks;
    static int i = 0;
    static{
        System.out.println("hi");
    }
    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
    Student (){
        // internally: new Student(13, "sas", 0.05f)
        this(13, "sas", 0.05f);// calling a constructor inside of a constructor using this keyword
        this.rno = 0;
        this.name = "";
        this.marks = 0.0f;
    }
    Student (int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

class Teacher{
    int id;
    String name, subject;
}