public class CreditPaymentService {
    public double calculate(int credit, int creditTerm, double perMonth) {
        double payment = credit * (perMonth * Math.pow((1 + perMonth), creditTerm)) / (Math.pow((1 + perMonth), creditTerm) - 1);

        return (payment);

    }
}
