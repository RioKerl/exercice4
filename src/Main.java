public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("WOE", "qnge", 49, "01/01/2001");
        Person person2 = new Person();


        person1.setNom("kerl");
        person1.setPrenom("gbozo");
        person1.setAge(32);
        person1.setDateNaiss("01/01/1998");
        System.out.println(person1.toString());


        person2.setNom("piere");
        person2.setPrenom("baba");
        person2.setAge(24);
        person2.setDateNaiss("01/02/1991");
        System.out.println(person2.toString());

        System.out.print("Age : " + person2.calculAge() + " ans");

    }
}