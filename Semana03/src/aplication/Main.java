package aplication;
import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int CURRENT_YEAR = 2026;
    static List<Integer> ageStudentList = new ArrayList<>();

    public static void main(String[] args) {

        final String GREETING_MESSAGE = "saludo estufdiantes de java";
        String[] nameStudents = {"Rosa", "Julio", "Sofia", "julia", "Luci"};
        int[] birthYears = {2000, 2020, 2008, 2009, 2001};

        showMessage(GREETING_MESSAGE);
        ListStudents(nameStudents, fillAgesList(birthYears));


    }


    static void showMessage(String message) {
        System.out.println(message);
    }

    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;

    }

    static List<Integer> fillAgesList(int[] birthYears) {
        for (int birthYear : birthYears) {
            int age = calculateAge(birthYear);
            ageStudentList.add(age);
        }
        return ageStudentList;
    }
    static void ListStudents(String[] namesStudents, List<Integer> ageStudentList) {
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < namesStudents.length; i++){
            System.out.println(namesStudents[i] + " - Edad:" + ageStudentList.get(i));
        }
    }
}