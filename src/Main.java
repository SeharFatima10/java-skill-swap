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
}

class Main{
    public static void main(String[] args) {

    }
}


