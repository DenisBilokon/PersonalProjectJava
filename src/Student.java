import java.util.Scanner;

class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public void displayStudentInfo() {
        System.out.println("Ім'я студента: " + name);
        System.out.print("Оцінки: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nСередній балл: " + calculateAverageGrade());
    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int[] grades) {
        super(name, grades);
    }

    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Тип студента: Бакалавр");
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String name, int[] grades) {
        super(name, grades);
    }

    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Тип студента: Магістр");
    }
}