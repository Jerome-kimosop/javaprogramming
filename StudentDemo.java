

public class StudentDemo {
    String name;
    int id;
    public StudentDemo(String name, int id){
        this.name = name ;
        this.id = id ;
    }

    public StudentDemo() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[]args){
        StudentDemo student1;
        student1 = new StudentDemo();
        student1.setName("Jerome");
        student1.setId(37309462);

        System.out.println("Student name is"+student1.getName()+ "and id is"+student1.getId());

    }
}
