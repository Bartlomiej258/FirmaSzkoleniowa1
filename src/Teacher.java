public class Teacher extends Person {

    private int experience;

    public Teacher(String firstName, String lastName, Address address, String groupClasses, int experience) {
        super(firstName, lastName, address, groupClasses);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println( experience + " lat doświadczenia " + " szkoli grupę " + groupClasses);
    }
}
