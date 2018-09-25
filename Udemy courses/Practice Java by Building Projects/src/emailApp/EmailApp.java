package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("john","kovalsky");
        email1.setAlternateEmail("ww@wp.pl");
        System.out.println("Your altenate email is: " + email1.getAlternateEmail());
        System.out.println(email1.showInfo());

    }
}
