package practice06;

import practice05.Person;

public class Student extends Person {


    private Integer klass;

    public Student(String name, int age, Integer klass) {
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
        return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass);
    }
}

