package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLenght = 10;
    private String alternateEmail;
    private String companySuffix = "aemicro.com";
    private String employeeID;

    // construtor para receber o nome e sobrenome
    public Email(String firstName, String lastName, String employeeID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;

        //chama o método que pergunta qual é o dpto e retorna o dpto escolhido
        this.department = setDepartment();

        //chama o método que retorna uma senha aleatória
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your password is: " + this.password);

        //reúne os elementos para gerar o email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


    }
        //método "setDepartment" que será chamado pelo construtor  para permitir que o usuário escolha um código de dpto
    private String setDepartment() {
        System.out.println("New worker: " + firstName + " " + lastName + "\nDepartment Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else {return "";}
    }

    public String getEmployeeID() {
        return employeeID;
    }
        //gera uma senha aleatória
    private String randomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[lenght];
        for (int i=0; i<lenght; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
        //define a capacidade da caixa de email
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

        //define o email alternativo
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;

    }
        //altera a senha
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity () { return mailboxCapacity; }
    public String getAlternateEmail () { return alternateEmail;}
    public String getPassword() { return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + " " +
                "\nEmployee ID: " + employeeID + " " +
                "\nCOMPANY EMAIL: " + email + " " +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }
}


















