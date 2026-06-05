 for (String skill : skills) {
            root = insertSkill(root, skill.toLowerCase(), student);
        }

        System.out.println("Student added successfully!");
    }

    // BST Insert
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
        }
        else if (compare > 0) {
            node.right = insertSkill(node.right, skill, student);
        }
        else {
            node.students.add(student);
        }

        return node;
    }
