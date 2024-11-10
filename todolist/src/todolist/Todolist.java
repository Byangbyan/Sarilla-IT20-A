package todolist;

import javax.swing.*;
import java.util.*;

public class Todolist {
    static LinkedList<String> todo = new LinkedList<>(), done = new LinkedList<>();
    static Stack<String> undoStack = new Stack<>();

    public static void main(String[] args) {
        while (true) {
            String choice = JOptionPane.showInputDialog(null,"1. Add Task\n2. Mark Done\n3. Undo\n4. View To-Do\n5. View Done\n6. Exit");
            switch (choice) {
                case "1": addTask(); break;
                case "2": markDone(); break;
                case "3": undo(); break;
                case "4": viewList(todo, "To-Do List"); break;
                case "5": viewList(done, "Completed Tasks"); break;
                case "6": return;
                default: JOptionPane.showMessageDialog(null, "Invalid operation.");
            }
        }
    }

    static void addTask() {
        String task = JOptionPane.showInputDialog("Enter task:");
        if (task != null) {
            todo.add(task);
            undoStack.push("add:" + task);
            JOptionPane.showMessageDialog(null, "Task Added: " + task);
        }
    }

    static void markDone() {
        if (todo.isEmpty()) return;
        String task = todo.remove(Integer.parseInt(JOptionPane.showInputDialog("Select task number:\n" + getTaskList(todo)))-1);
        done.add(task + " ✔");
        undoStack.push("done:" + task);
    }

    static void undo() {
        if (done.isEmpty()) return;
        String task = done.removeLast().replace(" ✔", "");
        todo.add(task);
    }

    static void viewList(LinkedList<String> list, String title) {
        JOptionPane.showMessageDialog(null, list.isEmpty() ? "Nothing to see here." : title + ":\n" + getTaskList(list));
    }

    static String getTaskList(LinkedList<String> list) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < list.size(); i++) output.append((i + 1) + ". " + list.get(i) + "\n");
        return output.toString();
    }
}

