public class Person {

    //field (attribute/instance variable)
    private String name;

    //constructor
    public Person(String name){
        this.name = name;
    }

    //getter
    public String getName() {
        return name; //return value of the variable name
    }

    //setter
    public void setName(String name) {
        this.name = name; //assigns the parameter (name) to the name variable.
    }

    //dummy method (function)
    public boolean addCourse (String course){
        return true;
    }
}
