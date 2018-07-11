package db.db_handelers;

import models.Course;
import models.Student;

import java.util.List;

public class DBCourse extends DBHelper {

    public static List<Course> getAll(){
        return getAll(Course.class);
    }

    public static Course find(int id){
        return find(id, Course.class);
    }

    public static List<Student> findStudents(Course course){
        return findManyListForOne(course, Student.class, "course");
    }
}
