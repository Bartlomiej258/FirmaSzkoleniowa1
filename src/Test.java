public class Test {
    public static void main(String[] args) {

        Address address = new Address("Warszawa ", "ul. Jerozolimska ", "25a");
        Address address1 = new Address("Poznań ", "ul. Jagiellońska ", "24d");
        Address address2 = new Address("Wrocław ", "ul. Batorego ", "445a");

        GroupClasses groupClasses = new GroupClasses();
        String groupJava = groupClasses.setGroup("java");
        String groupJavaScript = groupClasses.setGroup("JavaScript");




        Student student = new Student("Marek ", "Nowak ", address, groupJava, 3);
        Student student2 = new Student("Arkadiusz ", "Zelent ", address, groupJava,5);
        Student student3 = new Student("Grzegorz ", "Bąk ", address, groupJavaScript,4);
        Student student4 = new Student("Tomasz ", "Nowak ", address, groupJavaScript,4);
        student.printInfo();
        student2.printInfo();

        Teacher teacher = new Teacher("Krzysztof ", "Kowalski ", address1, groupJava,7);
        Teacher teacher1 = new Teacher("Bogdan ", "Nowakowski ", address2, groupJavaScript,11);
        teacher.printInfo();
        teacher1.printInfo();


    }
}
