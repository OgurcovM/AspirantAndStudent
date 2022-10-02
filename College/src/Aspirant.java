public class Aspirant extends Student
{
    String scientificWork;
    int a = 20000;
    int b = 18000;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return a;
        } else {
            return b;
        }
    }
}

