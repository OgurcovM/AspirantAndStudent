public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    int a = 10000;
    int b = 8000;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship() {
        if (averageMark == 5) {
            return a;
        } else {
            return b;
        }
    }
}
