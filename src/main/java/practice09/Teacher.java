package practice09;


public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        this(id, name, age,new Klass(null));
    }

    public Teacher(int id, String name, int age, Klass klass) {
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
        return super.introduce() + String.format(" I am a Teacher. I teach %s.",klass.getDisplayName());
    }

    public String introduceWith(Student student) {

        if(klass != null && klass.equals(student.getKlass())) {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.",student.getName());
        }else {
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.",student.getName());
        }
    }
}
