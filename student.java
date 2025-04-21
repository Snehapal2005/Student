//create a class student with private attributes and use setter and getter method to access and modified them

public class student {
    //private attributes
    private String name;
    private int age;
    private String grade;

    // constructor
    public student(String name,int age,String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //getter method
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }
  // setter method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
 // main method
    public static void main(String[] args) {
        student stud = new student("sneha ",19,"2nd year");
        //Accessing value using getter
        System.out.println("name:"+stud.getName());
        System.out.println("Age:"+stud.getAge());
        System.out.println("grade:"+stud.getGrade());

        // Modifying values using setter
        stud.setName("sneha pal");
        stud.setAge(19);
        stud.setGrade("4rth sem");
        System.out.println("updated Info:");
        System.out.println("Name:"+stud.getName());
        System.out.println("Age:"+stud.getAge());
        System.out.println("Grade:"+stud.getGrade());
    }
}
