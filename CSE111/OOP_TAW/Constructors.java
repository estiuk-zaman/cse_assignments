public class Constructors {
    public static void main(String[] args) {
        Constractor_student s1 = new Constractor_student("istii",57996);
        Constractor_student s2 = new Constractor_student("subaita",58706);
        Constractor_student s3 = new Constractor_student();
        Constractor_student s4 = new Constractor_student("ohi",67993,4.00);
        s3.details();
        s1.details();
        s2.details();
        s4.details();
    }
}
