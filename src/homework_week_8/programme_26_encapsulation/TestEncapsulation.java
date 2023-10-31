package homework_week_8.programme_26_encapsulation;

////declare main method and called static method
public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRoleNo(51);
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollno: " + obj.getRollNo());
    }
}
