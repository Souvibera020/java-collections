package InsurancePolicyManagementSystem;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding sample policies
        manager.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(25), "Health", 5000));
        manager.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 3000));
        manager.addPolicy(new Policy("P103", "Charlie", LocalDate.now().plusDays(10), "Home", 7000));

        System.out.println("All Policies: " + manager.getAllPolicies());
        System.out.println("Expiring Soon: " + manager.getExpiringSoonPolicies());
        System.out.println("Health Policies: " + manager.getPoliciesByCoverage("Health"));
        System.out.println("Duplicate Policies: " + manager.getDuplicatePolicies());
    }
}
