import Entities.TaskManager;
import Services.TaskManagerService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerServiceTest {
    static TaskManagerService tms;
    static TaskManager task1;
    static TaskManager task2;
    static TaskManager task3;
    static TaskManager task4;
    static TaskManager task5;

    @BeforeAll
    static void beforeAll() {
        tms = new TaskManagerService();
        task1 = new TaskManager("Hacer test a TaskManager");
        task2 = new TaskManager("Comprar comida gato");
        task3 = new TaskManager("Regar el helecho");
        tms.addToTaskList(task1);
        tms.addToTaskList(task2);
        tms.addToTaskList(task3);
    }

    @AfterAll
    static void afterAll() {
        
    }

    @BeforeEach
    void setUp() {
        
    }

    @AfterEach
    void tearDown() {
        
    }

    @Test
    void addToTaskListTest() {
        assertNotNull(TaskManagerService.TaskList.get(0));
    }

    @Test
    void addDescriptionTest() {
        assertNull(task1.getDescription());
        task1.setDescription("Work in progress!");
        assertNotNull(task1.getDescription());
    }

    @Test
    void stopTaskResumeTaskTest() {
        tms.resumeTask(task2);
        assertTrue(task2.isStatus());
        tms.stopTask(task2);
        assertFalse(task2.isStatus());
    }

    @Test
    void showTaskListTest() {
        tms.showTaskList();
        assertEquals(3, TaskManagerService.TaskList.size(), 0);
    }

    @Test
    void removeTaskTest() {
        tms.showTaskList();
        tms.deleteTask(task1);
        assertEquals(2, TaskManagerService.TaskList.size(), 0);
        tms.showTaskList();
    }



}
