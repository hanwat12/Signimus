package SignimusTechnologyTask;


class Person{
    
    private String Name;
    private int Age;
    public Person(String name, int age) {
        Name = name;
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }


}

class Student extends Person{

    private String Stu_Id;
    private String Course_field;
    
    public String getStu_Id() {
        return Stu_Id;
    }

    public void setStu_Id(String stu_Id) {
        Stu_Id = stu_Id;
    }

    public String getCourse_field() {
        return Course_field;
    }

    public void setCourse_field(String course_field) {
        Course_field = course_field;
    }

    public Student(String name, int age, String stu_Id, String course_field) {
            super(name, age);
            Stu_Id = stu_Id;
        Course_field = course_field;
    }

    @Override
    public String toString() {
        return "Name :" + getName()
                + ", Age :" + getAge() +
                ", Student Id :" + Stu_Id +
                ", course_field :"+ Course_field;
                
    }
}

public class Task5 {

    public static void main(String[] args) {
        
        Student std= new Student ("Himanshu Hanwat" , 22 ,"S12345" , "Computer Science");

        System.out.println(std);
        
    }

    
}
