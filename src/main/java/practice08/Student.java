package practice08;
public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {

        if(klass.getLeader() != null && klass.getLeader().getId() == getId()){
            return super.introduce() + String.format(" I am a Student. I am Leader of %s.",klass.getDisplayName());
        }

        return super.introduce() + String.format(" I am a Student. I am at %s.",klass.getDisplayName());
    }
}