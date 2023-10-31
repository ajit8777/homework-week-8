package homework_week_8.programme_26_encapsulation;

/**
 * Encapsulations example
 */
public class Encapsulate {
    // private variables declared
    private String name;
    private int rollNo;
    private int age;

    //set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }

    //get method for name to access private variable name
    public String getName() {
        return name;
    }

    //get method for RollNo to access private variable RollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for RollNo to access private variable rollNo
    public void setRoleNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //get method for age to access private variable age
    public int getAge() {
        return age;
    }

    //set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }
}
