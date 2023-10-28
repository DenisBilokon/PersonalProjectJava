import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введіть ім'я студента: ");
            String name = scanner.nextLine();

            System.out.print("Введіть кількість оцінок: ");
            int numGrades = scanner.nextInt();
            int[] grades = new int[numGrades];

            for (int i = 0; i < numGrades; i++) {
                System.out.print("Введіть оцінку " + (i + 1) + ": ");
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
                System.out.println("Невірний вибір типу студента.");
                return;
            }

            student.displayStudentInfo();

            System.out.print("Бажаєте ввести іншого студента? (1 - так, 2 - ні): ");
            int anotherStudent = scanner.nextInt();
            if (anotherStudent != 1) {
                break;
            }

            // Очистка буфера вводу
            scanner.nextLine();
        }

        scanner.close();
    }
}