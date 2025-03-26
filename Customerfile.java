import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Customerfile {

        private static final String FILENAME = "customer.txt";

        public static void write(CustomerInfo customer) {
            try (FileWriter fw = new FileWriter(FILENAME, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(customer.getName() + "," + customer.getAddress() + "," + customer.getContact());
                System.out.println("Customer information written to file.");
            } catch (IOException e) {
                System.err.println("Error writing customer information to file: " + e.getMessage());
            }
        }

        public static List<CustomerInfo> read() {
            List<CustomerInfo> customers = new ArrayList<>();

            try (FileReader fr = new FileReader(FILENAME);
                 BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");


                }
                System.out.println("Customer information read from file.");
            } catch (FileNotFoundException e) {
                System.err.println("Error opening customer file: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error reading customer information from file: " + e.getMessage());
            }

            return customers;
        }
    }

