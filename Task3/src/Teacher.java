import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher (String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (!canTeach.contains(currentCourses)){
            return false;
        } else {
        } currentCourses.add(course);
        return true;
    }

}

