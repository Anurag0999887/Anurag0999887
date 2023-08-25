import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    public void updateProfile(String newUsername, String newPassword) {
        username = newUsername;
        password = newPassword;
    }
}

class MCQQuestion {
    private String question;
    private String[] options;
    private int correctAnswer;

    public MCQQuestion(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

public class OnlineExamination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        User user = new User("Anurag", "Anurag123"); 
        if (user.login(username, password)) {
            System.out.println("Login successful!");
            MCQQuestion question = new MCQQuestion("What is the capital of India?",
                    new String[]{"Dehli", "London", "Indore", "mumbai"}, 1);
            question.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct answer!");
            } else {
                System.out.println("Incorrect answer.");
            }
            System.out.print("Update username: ");
            String newUsername = scanner.next();
            System.out.print("Update password: ");
            String newPassword = scanner.next();
            user.updateProfile(newUsername, newPassword);
            System.out.println("Profile updated successfully.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
        scanner.close();
    }
}
