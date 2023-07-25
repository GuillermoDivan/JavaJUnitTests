package Services;
import Entities.TaskManager;
import java.util.ArrayList;
import java.util.Scanner;


public class TaskManagerService {
    Scanner input = new Scanner(System.in);
    public static ArrayList<TaskManager> TaskList = new ArrayList<>();

    public TaskManager createTask(){
        System.out.println("Ingrese el nombre de la tarea:");
        String title = input.next();
        TaskManager tm = new TaskManager();
        tm.setTitle(title);
        tm.setStatus(true);
        addToTaskList(tm);
        return tm;
    }

    public void addToTaskList(TaskManager tm){
        TaskList.add(tm);
    }

    public void addDescription(TaskManager tm){
        System.out.println("Ingrese la descripción de la tarea:");
        tm.setDescription(input.next());
    }

    public void stopTask(TaskManager tm){
        tm.setStatus(false);
    }

    public void resumeTask(TaskManager tm){
        tm.setStatus(true);
    }

    public void showTaskList(){
        for (int i = 0; i < TaskList.size(); i++){
            System.out.print("["+TaskList.get(i).getTitle()+"]");
        }
        System.out.println("");
    }

    public void deleteTask(TaskManager tm){
        TaskList.remove(tm);
    }

}
