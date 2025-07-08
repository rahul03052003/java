import java.util.Scanner;

// Custom exception for invalid phone numbers
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Validator class to check phone number
class PhoneValidator {
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");
        }
        System.out.println("Phone number is valid.");
    }
}

// Main class to run the program
public class RecruitmentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter applicant phone number: ");
        String applicantPhone = scanner.nextLine();

        try {
            PhoneValidator.validatePhoneNumber(applicantPhone);
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        scanner.close();
    }
}
