import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        billCalculator b=new billCalculator() ;
//billCalculator b=new billCalculator(true,"Cristiano Ronaldo","Zia Colony National Highway",911,"cr7@gmail.com",'C') ;
//billCalculator b2=new billCalculator(false,"Lionel MEssi" , "City Campus PECHS",15,"leo10@gmail.com",'R') ;

        //CustomerInfo c1 = new CustomerInfo("Cristiano Ronaldo","Zia Colony National Highway",911,"cr7@gmail.com",'C' ) ;
//CustomerInfo c =  new CustomerInfo("Lionel MEssi" , "City Campus PECHS",15,"leo10@gmail.com",'R') ;

        System.out.println("Admin or User?\npress\n1 for admin\n2 for user");
        Scanner x = new Scanner(System.in);
        int op = x.nextInt();

        if (op == 1) {
            b.adminIntro();
        } else if (op == 2) {
            b.intro() ;
            System.out.println("press verification key to proceed further.");
            int key= x.nextInt();
            if (key==7) {

                   b.setName("Cristiano Ronaldo");
                    b.setAddress("Zia Colony National Highway");
                    b.setContact(911);
                    b.setUnits(1800);
                    b.setEmail("cr7@gmail.com") ;
                    b.setType('C');

                } else if (key==10) {
                    b.setName("Lionel Messi");
                    b.setAddress("City Campus PECHS");
                    b.setContact(15);
                    b.setUnits(2150);
                    b.setEmail("leo10@gmail.com") ;
                    b.setType('R');




                }
                b.Infoprint();


                b.menu();
                Scanner input = new Scanner(System.in);
                System.out.println("Select your option");
                int choice = input.nextInt();
                if (choice == 1) {
                    b.setUnits(100);
                    if ((b.getType() == 'C')) {
                        b.Commercial();
                    } else if (b.getType() == 'R') {
                        b.Recidential();
                    }

                } else if (choice == 2) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter your complaint: ");
                    String complaint = scanner.nextLine();

                    LocalDateTime currentDateTime = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String dateTime = currentDateTime.format(formatter);

                    System.out.println("\nThank you for submitting your complaint. We are sorry for any inconvenience.Our team will get back to you within 24 hours.\nWe are generating your complaint ticket...");

                    System.out.println("Complaint: " + complaint);

                    System.out.println("Date and Time: " + dateTime);
                }

            }

        }

    }






