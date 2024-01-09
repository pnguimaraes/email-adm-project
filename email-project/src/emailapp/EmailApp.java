package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        String employeeID = "AO56856";
        Email eml = new Email("Aiden", "Mackintosh", employeeID);
        System.out.println(eml.showInfo());

    }
}
