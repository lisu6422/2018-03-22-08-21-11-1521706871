package practice06;

public class Teacher extends Person {

    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }


    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass == null) {
            return super.introduce() + String.format(" I am a Student. I am at No Class.");
        }else {
            return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass);

        }
    }
}
