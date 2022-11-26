import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        Student student0 = new Student("Olfert", passedCourses);
        Student student1 = new Student("Findus", new ArrayList<>());
        passedCourses.add("Danish");
        passedCourses.add("Java 1.0");


        ArrayList<String> canTeach = new ArrayList<>();
        Teacher teacher0 = new Teacher("Mrs.Olfertsen", canTeach);
        Teacher teacher1 = new Teacher("Mrs.Petersen", new ArrayList<>());
        canTeach.add("Danish");
        canTeach.add("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student0);
        persons.add(student1);
        persons.add(teacher0);
        persons.add(teacher1);

        for (Person person: persons) {
            if (!person.addCourse("Java 1.0")){
                System.out.println(person.getName()+" har allerede bestået dette kursus");
            }else {
                System.out.println(person.getName() + " kan ikke undervise i dette fag");
            }
        }
        }
    }

