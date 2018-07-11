package db.db_handelers;

import db.db_handelers.DBHelper;
import models.Lesson;

import java.util.List;

public class DBLesson extends DBHelper {

    public static List<Lesson> getAll(){
        return getAll(Lesson.class);
    }

    public static Lesson find(int id){
        return find(id, Lesson.class);
    }
}
