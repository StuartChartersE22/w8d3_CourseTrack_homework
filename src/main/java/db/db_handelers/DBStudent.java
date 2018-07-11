package db.db_handelers;

import db.db_handelers.DBHelper;
import models.Student;

import java.util.List;

public class DBStudent extends DBHelper {

    public static List<Student> getAll(){
        return getAll(Student.class);
    }

    public static Student find(int id){
        return find(id, Student.class);
    }
}
