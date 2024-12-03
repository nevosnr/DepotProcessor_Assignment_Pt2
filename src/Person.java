public class Person {
    private String fname;
    private String lname;
    private int age;


    //Constructor name must reflect class name.
    public Person(String firstName, String lastName, int age){
        fname = firstName;
        lname = lastName;
        this.age = age;
    }

    public String toString(){
        return "Name: " + fname + lname + "Age: " + age;
    }
    
}
