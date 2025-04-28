package designPattern.prototypePattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student ob = new Student(34, "Avnish");
        Student ob2 = (Student)ob.clone();
        ob2.display();
    } 
}
