public class Student extends Person{

    private int mark;

    public Student(String firstName, String lastName, Address address, String groupClasses, int mark) {
        super(firstName, lastName, address, groupClasses);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }





    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(" ocena " + mark + " uczy się w grupie " + getGroupClasses());
    }
}
