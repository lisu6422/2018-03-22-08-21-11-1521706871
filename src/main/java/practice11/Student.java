package practice11;



public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.appendMember(this);
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


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj instanceof Student){
            return getId() == ((Student) obj).getId();
        }
        return false;
    }
}