public class Main {
    public static void main(String[] args) {
        Contact contact1 = new EmailContact("Aden","aneuman1@cscc.edu");
        contact1.contact();
        Contact contact2 = new PhoneContact("Aden", "123-456-7890");
        contact2.contact();

    }
}

abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public abstract void contact();
}

class EmailContact extends Contact {
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}

class PhoneContact extends Contact {
    private String phoneNumber;

    public PhoneContact(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + phoneNumber);
    }
}

