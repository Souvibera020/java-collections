package InsurancePolicyManagementSystem;


import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public List<Policy> getExpiringSoonPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);

        List<Policy> expiringSoon = new ArrayList<>();
        for (Policy policy : treeSetPolicies) {
            if (!policy.getExpiryDate().isAfter(threshold)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public List<Policy> getPoliciesByCoverage(String coverageType) {
        List<Policy> filteredPolicies = new ArrayList<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    public List<Policy> getDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        List<Policy> duplicates = new ArrayList<>();

        for (Policy policy : hashSetPolicies) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Policy policy : hashSetPolicies) {
            if (policyCount.get(policy.getPolicyNumber()) > 1) {
                duplicates.add(policy);
            }
        }

        return duplicates;
    }
}
