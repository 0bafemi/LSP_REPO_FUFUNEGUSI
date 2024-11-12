package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * The VotingMachine class simulates a simple electronic voting machine.
 * It allows adding candidates, casting votes, and displaying the vote count for each candidate.
 */
public class VotingMachine {

    // Map to store candidate names and their corresponding vote counts
    private Map<String, Integer> candidates;

    // Constructor to initialize the candidates map
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the voting machine.
     *
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Initialize vote count to 0
        } else {
            System.out.println("Candidate \"" + name + "\" is already added.");
        }
    }

    /**
     * Casts a vote for the specified candidate.
     *
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            int votes = candidates.get(name);
            candidates.put(name, votes + 1); // Increment vote count by 1
        } else {
            System.out.println("Candidate \"" + name + "\" does not exist.");
        }
    }

    /**
     * Returns a string representation of the vote counts for all candidates.
     *
     * @return a formatted string showing each candidate and their vote count
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            sb.append("Candidate: ").append(entry.getKey())
              .append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
