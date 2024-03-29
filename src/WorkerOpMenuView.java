package src;

import java.util.*;

public class WorkerOpMenuView implements ViewInterface {

    public ViewData create(ModelData modelData, String functionName, String operationName) throws Exception {
        System.out.println("Worker Op Menu icindeyiz");
        String which;

        Integer choice;
        do {
            System.out.println("1. Show all workers");
            System.out.println("2. Show filtered workers");
            System.out.println("3. Add an worker");
            System.out.println("4. Update an worker");
            System.out.println("5. Delete an worker");
            System.out.println("6. Back");
            System.out.println();

            choice = getInteger("Enter your choice : ", false);
        }
        while (choice == null || choice < 1 || choice > 6);


        Map<String, Object> userInput = new HashMap<>();
        userInput.put("mainMenuChoice", choice);

        switch (choice.intValue()) {
            case 1: {
                which = WorkerQuestioner.whichWorker();
                operationName = "select";
                break;
            }
            case 2: {
                which = WorkerQuestioner.whichWorker();
                operationName = "select.gui";
                break;
            }
            case 3: {
                which = WorkerQuestioner.whichWorker();
                operationName = "insert.gui";
                break;
            }
            case 4: {
                which = WorkerQuestioner.whichWorker();
                operationName = "update.gui";
                break;
            }
            case 5: {
                which = WorkerQuestioner.whichWorker();
                operationName = "delete.gui";
                break;
            }
            case 6: return new ViewData("MainMenu", "");
            default: return new ViewData(null, null);
        }

        return new ViewData("Worker", operationName, new HashMap<>());
    }

    @Override
    public String toString() {
        return "Main Menu View";
    }
}
