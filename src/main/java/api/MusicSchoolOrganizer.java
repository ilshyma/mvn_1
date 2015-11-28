package api;

import impl.Perfomance;

import java.util.List;

/**
 * Created by user on 24.11.2015.
 */
public interface MusicSchoolOrganizer {
    void addNewStudent (Student student, SchoolClass schoolClass);
    void deleteStudentFromClass(Student student);
    List<Student> getAllStudents();
    List<Student> getStudentsFromClass(SchoolClass schoolClass);
    void schedulePerfomance(Perfomance perfomance);

}
