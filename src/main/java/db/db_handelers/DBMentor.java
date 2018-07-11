package db.db_handelers;

import db.db_handelers.DBHelper;
import models.Mentor;


import java.util.List;

public class DBMentor extends DBHelper {

    public static List<Mentor> getAll(){
        return getAll(Mentor.class);
    }

    public static Mentor find(int id){
        return find(id, Mentor.class);
    }

}
