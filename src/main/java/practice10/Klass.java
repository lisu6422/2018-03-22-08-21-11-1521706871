package practice10;


import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Integer number;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }


    public String getDisplayName() {
        return number == null ? "No Class" : String.format("Class %d",number);
    }

    public void assignLeader(Student leader) {
        if(!studentList.contains(leader)){
            System.out.println("It is not one of us.");
            return;
        }

        this.leader = leader;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj instanceof Klass){
            return number.equals(((Klass) obj).number);
        }
        return false;
    }
}