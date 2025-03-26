public class billCalculator extends CustomerInfo  {
    int units;
    final double commercialtax = 0.3;
    final double recidentialtax = 0.15;
    final double gst = 0.11;
    final double govsubsidy = 0.1;
    final double gst2 = 0.28;
    double taxprice;
    double finalbill;
    final int priceperunit = 18;
    double initialprice;
    double billafterduedate;

   // public billCalculator(boolean condition, String n, String add, int con, String em, char t) {
     //   super(condition, n, add, con, em, t);
    //}

    // public billCalculator(String n, String add, int con, String em, char t) {
     //   super(n, add, con, em, t);
    //}

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void Recidential() {
        initialprice = priceperunit * getUnits();
        System.out.println("bill before tax: " + initialprice);
        taxprice = initialprice * recidentialtax * gst * govsubsidy;
        finalbill = taxprice + initialprice;
        System.out.println("total charges(including tax): " + finalbill);
        billafterduedate = finalbill + (finalbill * 0.15);
        System.out.println("charges after due date: " + billafterduedate);
        System.out.println("BILL PAID");
    }

    public void Commercial() {
        initialprice = priceperunit * getUnits();
        System.out.println("bill before tax: " + initialprice);
        taxprice = initialprice * commercialtax * gst * govsubsidy;
        finalbill = taxprice + initialprice;
        System.out.println("total charges(including tax): " + finalbill);
        billafterduedate = finalbill + (finalbill * 0.15);
        System.out.println("charges after due date: " + billafterduedate);
        System.out.println("BILL NOT PAID REMAINING AMOUNT RS.2500/-");
    }









}
