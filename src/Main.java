import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть ім'я студента: ");
        String name = scanner.nextLine();

        System.out.print("Введіть кількість оцінок: ");
        int numGrades = scanner.nextInt();
        int[] grades = new int[numGrades];

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Введіть оцінок " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        System.out.print("Виберіть тип студента (1 - Бакалавр, 2 - Магістр): ");
        int studentType = scanner.nextInt();

        Student student;

        if (studentType == 1) {
            student = new UndergraduateStudent(name, grades);
        } else if (studentType == 2) {
            student = new GraduateStudent(name, grades);
        } else {
            System.out.println("Невірний вибір типа студента.");
            return;
        }

        student.displayStudentInfo();

        scanner.close();
    }
}