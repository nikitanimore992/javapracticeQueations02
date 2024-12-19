
import java.util.HashMap;
import java.util.Map;




class A_ElectionWinner{
     // Function to find the winner of the election
     public static String findWinner(String[] arr, int n) {
        // Map to store the count of votes for each candidate
        Map<String, Integer> voteCount = new HashMap<>();

        // Count the votes for each candidate
        for (String name : arr) {
            voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);
        }

        // Variables to store the winner and maximum votes
        String winner = "";
        int maxVotes = 0;

        // Find the candidate with maximum votes
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            // Update the winner if votes are higher or if lexicographically smaller in case of tie
            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                winner = candidate;
                maxVotes = votes;
            }
        }

        return winner;
    }
    public static void main(String[] args) {
        // Example usage
        String[] arr = {"nikita", "nikita", "ankit", "radha", "radha", "ankit", "ankit"};
        int n = arr.length;

        String winner = findWinner(arr, n);
        System.out.println("Winner of the election: " + winner);

        
    }
}