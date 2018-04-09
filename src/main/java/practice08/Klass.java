package practice08;

public class Klass {

    private Integer number;
    private Student leader;

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
        this.leader = leader;
    }
}
