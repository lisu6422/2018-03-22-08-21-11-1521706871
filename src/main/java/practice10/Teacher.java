package practice10;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Teacher extends Person {
    private Set<Klass> classes;

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        this(id, name, age, null);
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {

        if (classes == null || classes.size() == 0) {
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        }

        List<Integer> klassNumbers = new ArrayList<>();
        for (Klass klass : classes) {
            klassNumbers.add(klass.getNumber());
        }

        Collections.sort(klassNumbers);

        StringBuffer sb = new StringBuffer();
        for (Integer num : klassNumbers) {
            sb.append(" ").append(num).append(",");
        }

        return super.introduce() + String.format(" I am a Teacher. I teach Class%s.", sb.substring(0, sb.length() - 1));
    }

    public String introduceWith(Student student) {

        if (isTeaching(student)) {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    public boolean isTeaching(Student student) {
        if (classes != null && classes.size() > 0) {
            for (Klass klass : classes) {
                if (klass.getStudentList().contains(student)) return true;
            }
        }

        return false;
    }
}
