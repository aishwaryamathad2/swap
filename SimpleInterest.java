

public class SimpleInterest {
    public static void main(String[] args) {
        // Hardcoded values
        double principal = 10000.0; // e.g., ₹10,000
        double rate = 5.5;          // annual interest rate in %
        double time = 3.0;          // time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display results
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate (% per annum): " + rate);
        System.out.println("Time (years): " + time);
        System.out.println("Simple Interest = ₹" + simpleInterest);
    }
}
