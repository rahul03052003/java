import java.util.Scanner;

// Custom exception
class NotEligibleToVoteException extends Exception {
    public NotEligibleToVoteException(String message) {
        super(message);
    }
}

// Voter eligibility logic
public class VoterEligibility {
    public static void checkEligibility(int age) throws NotEligibleToVoteException {
        if (age < 18) {
            throw new NotEligibleToVoteException("User must be at least 18 years old to vote.");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter applicant age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(age);
        } catch (NotEligibleToVoteException e) {
            System.out.println("Voting Error: " + e.getMessage());
        }

        scanner.close();
    }
}
