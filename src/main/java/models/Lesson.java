package models;


import db.IDB;
import sun.plugin.dom.core.CoreConstants;

import javax.persistence.*;

@Entity
@Table(name="lessons")
public class Lesson implements IDB {

    private int id;
    private String title;
    private int classroomNumber;
    private Course course;

    public Lesson(){}

    public Lesson(String title, int classroomNumber, Course course){
        this.title = title;
        this.classroomNumber = classroomNumber;
        this.course = course;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }


    @Column(name="title")
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }


    @Column(name="classroom_number")
    public int getClassroomNumber(){
        return this.classroomNumber;
    }
    public void setClassroomNumber(int classroomNumber){
        this.classroomNumber = classroomNumber;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
