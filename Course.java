package Assignment;

public class Course {

    // Attributes
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[4];
        numberOfStudents = 0;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Add student
    public void addStudent(String student) {

        // If array is full, create a larger array
        if (numberOfStudents >= students.length) {

            String[] newStudents =
                    new String[students.length * 2];

            // Copy old students
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        // Add new student
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop student
    public void dropStudent(String student) {

        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                // Shift students to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                // Remove last duplicate value
                students[numberOfStudents - 1] = null;

                numberOfStudents--;

                break;
            }
        }
    }

    // Get students
    public String[] getStudents() {
        return students;
    }

    // Get number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
class TestCourse {

    public static void main(String[] args) {

        // Test constructor
        Course course1 = new Course("Java Programming");

        // Test getCourseName()
        System.out.println("Course name is: "
                + course1.getCourseName());

        // Test initial number of students
        System.out.println("Number of students is: "
                + course1.getNumberOfStudents());


        // Test addStudent()
        course1.addStudent("Ahmed");
        course1.addStudent("Hassan");
        course1.addStudent("Mohamed");

        // Test getNumberOfStudents() after adding students
        System.out.println("\nAfter adding students:");

        System.out.println("Number of students is: "
                + course1.getNumberOfStudents());


        // Test getStudents()
        System.out.println("Students:");

        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }


        // Test dropStudent()
        course1.dropStudent("Hassan");

        // Test number of students after dropping
        System.out.println("\nAfter dropping Hassan:");

        System.out.println("Number of students is: "
                + course1.getNumberOfStudents());


        // Test getStudents() after dropping
        System.out.println("Students:");

        students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }


        // Test adding more students
        // This also tests dynamic array expansion
        course1.addStudent("Ali");
        course1.addStudent("Abdi");
        course1.addStudent("Yusuf");

        // Test number of students
        System.out.println("\nAfter adding more students:");

        System.out.println("Number of students is: "
                + course1.getNumberOfStudents());


        // Test getStudents() again
        System.out.println("Students:");

        students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }
}