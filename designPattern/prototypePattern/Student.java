package designPattern.prototypePattern;

public class Student implements Cloneable {
    private int roll;
    private String name;

    public Student(){
        this(0, "no name");

    }
    public Student(int roll, String name){
        this.name = name;
        this.roll = roll;
    }

    // this is using shallow cloning
     @Override
    protected Object clone() throws CloneNotSupportedException{
         return super.clone();
    }

    // public Student clone(){
    //   return  new Student(roll, name);
    // }
    public void display() {
       System.out.println("roll no is " +  roll + " name is " + name);
    }
}
