package todoapp;

import java.util.*;

//class CompareByPriority implements Comparator<Task> {
//    public int compare(Task t1, Task t2) {
//        return t2.getPriority()-t1.getPriority();
//    }
//}

public class ToDoManager {

    private Queue<Task> pendingTasks;
    private Stack<Task> completedTasks;

    public ToDoManager(){
        pendingTasks = new PriorityQueue<>((t1,t2)-> t1.getPriority()- t1.getPriority());
        completedTasks = new Stack<>();
    }

    public void addTask(Task task){
        pendingTasks.offer(task);
        System.out.println("New task added : "+task.getTitle());
    }

    public void showCompletedTasks(){
        System.out.println("Completed Tasks : ");
        while (!completedTasks.isEmpty()){
            Task currentTask = completedTasks.pop();
            System.out.println(currentTask.getTitle());
        }
    }

    public void processPendingTask(){
        while (!pendingTasks.isEmpty()){
            Task currentTask = pendingTasks.poll();
            System.out.println("Processing task : "+currentTask.getTitle());
            System.out.println("Task Completed");
            completedTasks.push(currentTask);
        }
    }


    public static void main(String[] args) {

        ToDoManager todo = new ToDoManager();

        todo.addTask(new Task("Learn Java","Learn Java 17 and its features",3));
        todo.addTask(new Task("Learn Spring","Learn Spring Boot and its features",5));
        todo.addTask(new Task("Learn Docker","Learn Docker and its features",4));

        todo.processPendingTask();
        todo.showCompletedTasks();


    }

}
