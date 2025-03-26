import java.io.*;
import java.util.Scanner;
import java.io.IOException;


    public class CustomerInfo {
        String customerID;

        String name;
        String address;
        String password;

        int contact;
        String email;
        char type;


        public void setName(String name) {
            this.name = name;
        }

        public void setContact(int contact) {
            this.contact = contact;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setType(char type) {
            this.type = type;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        //public CustomerInfo(boolean condition, String n, String add, int con, String em, char t) {

        //}





        public String intro() throws FileNotFoundException {

            System.out.println("" +
                    "   ||||||   |||||   |||||  ||||||     |||||   |      |||||   |||||  |||||| ||||||   |  |||||   \n" +
                    "   |        |   |  |         |        |       |      |       |        |    |    |   |  |       \n" +
                    "   ||||||   |||||   |||||    |        |||||   |      |||||   |        |    ||||||   |  |       \n" +
                    "   |        |   |       |    |        |       |      |       |        |    | |      |  |       \n" +
                    "   |        |   |   |||||    |        |||||   |||||| |||||   |||||    |    |   |    |  |||||   \n");
            System.out.println("____________________________________");

            //    String pathname="C:\\Users\\Saif Khan\\Desktop\\OOP Sem 2\\Lab assignments\\OOP project\\src\\passwords.txt" ;

            Scanner file = new Scanner(new File("passwords.txt"));
            while (file.hasNext()) {
                System.out.println("Kindly enter your id and password");
                Scanner input = new Scanner(System.in);
                System.out.println("User id: ");
                String CustomerID = input.nextLine();
                System.out.println("Enter password: ");
                String password = input.nextLine();
                String customerIDFromFile = file.next();
                String passwordFromFile = file.next();
                if (CustomerID.equals(customerIDFromFile) && password.equals(passwordFromFile)) {
                    return customerID;


                } else {
                    System.out.println("customerID or password is invalid!");
                }
            }
            return null ;
        }



        public int user() throws FileNotFoundException {
            if (intro().equals("cristiano7")) {
                return 7;
            } else if (intro().equals("lionel10")) {
                return 10 ;

            }
            return 0 ;
        }

        public static void adminIntro() throws IOException {
            String adminid = "saif1293";
            String adminpass = "umer25";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter admin ID: ");
            String id = scanner.next();
            System.out.println("Enter admin password: ");
            String pass = scanner.next();
            if (id.equals(adminid) && pass.equals(adminpass)) {
                System.out.print("customerID: ");
                String customerID = scanner.next();
                System.out.print("password: ");
                String password = scanner.next();
                scanner.close();
                Scanner file = new Scanner(new File("passwords.txt"));
                String[] customerIDs = new String[100], passwords = new String[100];
                int count = 0;
                while (file.hasNext()) {
                    customerIDs[count] = file.next();
                    passwords[count] = file.next();
                    ++count;
                }
                customerIDs[count] = customerID;
                passwords[count] = password;
                ++count;
                PrintWriter writer = new PrintWriter(new FileWriter("passwords.txt", true));
                writer.println(customerID + " " + password);
                for (int i = 0; i < count; ++i) {
                    writer.printf("%s %s\n", customerIDs[i], passwords[i]);

                }
            } else {
                System.out.println("INVALID");

            }


        }

        public void menu() {
            System.out.println("\tHow can we help you?");
            System.out.println("1.Bill payment");
            System.out.println("2.Complain and customer support");

        }
        public String getName() {
            return name;
        }



        public int getContact() {
            return contact;
        }



        public String getAddress() {
            return address;
        }



        public String getEmail() {

            return email;
        }


        public char getType() {

            return type;
        }

        public void Infoprint() {
            System.out.println("name: " +getName());
            System.out.println("address: "+getAddress());
            System.out.println("contact: "+getContact()) ;
            System.out.println("email: "+email);
            System.out.println("type(residential/commercial): "+getType());




        }

    }











