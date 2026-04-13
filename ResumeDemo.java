import java.util.*;

abstract class JobRole {}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

public class ResumeDemo {
    public static void process(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        List<SoftwareEngineer> list = Arrays.asList(new SoftwareEngineer(), new SoftwareEngineer());

        process(list);
    }
}