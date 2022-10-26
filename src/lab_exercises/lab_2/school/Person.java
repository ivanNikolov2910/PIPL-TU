package lab_exercises.lab_2.school;

public class Person {
    private String name;
    private String egn;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    public void sayName(){
        System.out.println("My name is " + this.name);
    }

    public static void sayHi(){
        System.out.println("Hi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }
}
