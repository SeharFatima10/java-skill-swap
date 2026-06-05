import java.util.*;

class Student {
    int id;
    String name;
    ArrayList<String> skills;
    Student next;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.skills = new ArrayList<>();
        this.next = null;
    }
}
class SkillNode {
    String skill;
    ArrayList<Student> students;
    SkillNode left, right;

    public SkillNode(String skill) {
        this.skill = skill;
        this.students = new ArrayList<>();
        left = right = null;
    }
}

class SkillManagementSystem {

    private Student head;
    private SkillNode root;

    public void addStudent(int id, String name, List<String> skills) {

        Student student = new Student(id, name);

        for (String skill : skills) {
            student.skills.add(skill);
        }

        if (head == null) {
            head = student;
        } else {
            Student temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = student;
        }

        for (String skill : skills) {
            root = insertSkill(root, skill.toLowerCase(), student);
        }

        System.out.println("Student added successfully!");
    }

    private SkillNode insertSkill(
            SkillNode node,
            String skill,
            Student student) {

        if (node == null) {
            SkillNode newNode = new SkillNode(skill);
            newNode.students.add(student);
            return newNode;
        }

        int compare = skill.compareTo(node.skill);

        if (compare < 0) {
            node.left = insertSkill(node.left, skill, student);
        } else if (compare > 0) {
            node.right = insertSkill(node.right, skill, student);
        } else {
            node.students.add(student);
        }

        return node;
    }

    public void searchBySkill(String skill) {

        SkillNode result = searchSkill(root, skill.toLowerCase());

        if (result == null) {
            System.out.println("No students found with skill: " + skill);
            return;
        }

        System.out.println("\nStudents having skill: " + skill);

        for (Student s : result.students) {
            System.out.println(
                    "ID: " + s.id +
                            ", Name: " + s.name);
        }
    }

    private SkillNode searchSkill(
            SkillNode node,
            String skill) {

        if (node == null)
            return null;

        int compare = skill.compareTo(node.skill);

        if (compare == 0)
            return node;

        if (compare < 0)
            return searchSkill(node.left, skill);

        return searchSkill(node.right, skill);
    }

    public void displayStudents() {

        if (head == null) {
            System.out.println("No students available.");
            return;
        }

        Student temp = head;

        while (temp != null) {

            System.out.println("\nStudent ID: " + temp.id);
            System.out.println("Name: " + temp.name);
            System.out.println("Skills: " + temp.skills);

            temp = temp.next;
        }
    }
}
    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            SkillManagementSystem system = new SkillManagementSystem();

            int choice;

            do {

                System.out.println("\n===== Student Skill Finder =====");
                System.out.println("1. Add Student");
                System.out.println("2. Search Students By Skill");
                System.out.println("3. Display All Students");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Number of Skills: ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        List<String> skills =
                                new ArrayList<>();

                        for (int i = 1; i <= n; i++) {
                            System.out.print(
                                    "Enter Skill " + i + ": ");
                            skills.add(sc.nextLine());
                        }

                        system.addStudent(id, name, skills);
                        break;

                    case 2:

                        System.out.print(
                                "Enter Skill to Search: ");
                        String skill = sc.nextLine();

                        system.searchBySkill(skill);
                        break;

                    case 3:
                        system.displayStudents();
                        break;

                    case 4:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 4);

            sc.close();
        }
    }





