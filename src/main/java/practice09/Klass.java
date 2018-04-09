package practice09;

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

    public void appendMember(Student student) {
        studentList.add(student);
    }
}