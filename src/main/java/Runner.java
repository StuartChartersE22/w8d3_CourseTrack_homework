
import db.db_handelers.DBCourse;
import db.db_handelers.DBLesson;
import db.db_handelers.DBMentor;
import db.db_handelers.DBStudent;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course = new Course("Historic Computing", "BComp");
        DBCourse.save(course);

        Lesson lesson1 = new Lesson("Computer Science", 314, course);
        DBLesson.save(lesson1);
        Lesson lesson2 = new Lesson("History", 1066, course);
        DBLesson.save(lesson2);

        Student student1 = new Student("Stuart", 26, 42, course);
        DBStudent.save(student1);
        Student student2 = new Student("Ben", 24, 23, course);
        DBStudent.save(student2);

        Mentor mentor = new Mentor("Zsolt", student2);
        DBMentor.save(mentor);

        List<Student> courseStudents = DBCourse.findStudents(course);
        List<Lesson> courseLessons = DBCourse.findLessons(course);

        System.exit(0);
    }
}