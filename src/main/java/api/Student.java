package api;

/**
 * Created by user on 24.11.2015.
 */
public class Student {
    private String fio;
    private int age;
    private SchoolClass schoolClass;

    Student(SchoolClass schoolClass, String fio, int age){
        this.fio = fio;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;
        if(other == this) return true;
        if(getClass() != other.getClass()) return false;
        Student student = (Student) other;
        return fio == student.fio && age == student.age && schoolClass == student.schoolClass;
    }

    @Override
    public int hashCode() {
        int result = fio != null ? fio.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (schoolClass != null ? schoolClass.hashCode() : 0);
        return result;
    }
}
