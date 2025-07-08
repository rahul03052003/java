class NotEligibleToVoteException extends Exception {
    public NotEligibleToVoteException(String message) {
        super(message);
    }
}


public class VoterEligibility {
    public static void checkEligibility(int age) throws NotEligibleToVoteException {
        if (age < 18) {
            throw new NotEligibleToVoteException("User must be at least 18 years old to vote.");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (NotEligibleToVoteException e) {
            System.out.println("Voting Error: " + e.getMessage());
        }
    }
}