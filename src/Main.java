public class Main {
    public static void main(String[] args) {

        int credit = 1000000; // сумма кредита
        int creditTerm = 12; // срок кредита в месяцах
        double perYear = 9.99; // годовая ставка в процентах
        double perMonth = perYear / creditTerm / 100; // месячная ставка

        CreditPaymentService service = new CreditPaymentService();
        int payment = (int) service.calculate(credit, creditTerm = 12, perMonth);
        int payment2 = (int) service.calculate(credit, creditTerm = 24, perMonth);
        int payment3 = (int) service.calculate(credit, creditTerm = 36, perMonth);

        System.out.println(payment);
        System.out.println(payment2);
        System.out.println(payment3);
    }


}
