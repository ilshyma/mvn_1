package impl;

import api.MusicSchoolOrganizer;
import api.SchoolClass;
import api.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 24.11.2015.
 */
public class Perfomance implements MusicSchoolOrganizer {

    List<Student> listStudent = new ArrayList<Student>();

    public void addNewStudent(Student student, SchoolClass schoolClass) {
        student.setSchoolClass(schoolClass);
        schoolClass.setAmountStudents(schoolClass.getAmountStudents()+1);
        listStudent.add(student);
    }

    public void deleteStudentFromClass(Student student) {
        for(Student st: listStudent){
            if(st.equals(student)) {
                listStudent.remove(st);
            }
        }
    }

    public List<Student> getAllStudents() {
        return listStudent;
    }

    public List<Student> getStudentsFromClass(SchoolClass schoolClass) {
        List<Student> studentList = new ArrayList<Student>();
        for(Student st: listStudent){
            if(st.getSchoolClass().equals(schoolClass)){
                studentList.add(st);
            }
        }
        return studentList;
    }

    public void schedulePerfomance(Perfomance perfomance) {
        for(Student st: listStudent){
            System.out.println(st.getFio()+" "+st.getSchoolClass());
        }
    }
}
