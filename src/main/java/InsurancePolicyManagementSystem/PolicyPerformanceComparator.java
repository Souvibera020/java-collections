package InsurancePolicyManagementSystem;


import java.time.LocalDate;
import java.util.*;

public class PolicyPerformanceComparator {
    public static void comparePerformance(Set<Policy> policySet, List<Policy> policies) {
        long startTime, endTime;

        // Measure Insertion Time
        startTime = System.nanoTime();
        for (Policy policy : policies) {
            policySet.add(policy);
        }
        endTime = System.nanoTime();
        System.out.println(policySet.getClass().getSimpleName() + " Insertion Time: " + (endTime - startTime) + " ns");

        // Measure Search Time
        Policy searchPolicy = policies.get(policies.size() / 2);
        startTime = System.nanoTime();
        boolean found = policySet.contains(searchPolicy);
        endTime = System.nanoTime();
        System.out.println(policySet.getClass().getSimpleName() + " Search Time: " + (endTime - startTime) + " ns");

        // Measure Deletion Time
        startTime = System.nanoTime();
        policySet.remove(searchPolicy);
        endTime = System.nanoTime();
        System.out.println(policySet.getClass().getSimpleName() + " Deletion Time: " + (endTime - startTime) + " ns\n");
    }

    public static void main(String[] args) {
        List<Policy> samplePolicies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            samplePolicies.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Health", 1000 + (i % 500)));
        }

        comparePerformance(new HashSet<>(), samplePolicies);
        comparePerformance(new LinkedHashSet<>(), samplePolicies);
        comparePerformance(new TreeSet<>(), samplePolicies);
    }
}
