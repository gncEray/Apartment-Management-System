package src;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.*;
class ResidentOpMenuView implements ViewInterface {
    String whichResident;

    public ViewData create(ModelData modelData, String functionName, String operationName) throws Exception {
        System.out.println("Resident Op Menu icindeyiz");

        Integer choice;

        do {
            System.out.println("1. Show all residents");
            System.out.println("2. Show filtered residents");
            System.out.println("3. Add an resident");
            System.out.println("4. Update an resident");
            System.out.println("5. Delete an resident");
            System.out.println("6. Back");
            System.out.println();

            choice = getInteger("Enter your choice : ", false);
        }
        while (choice == null || choice < 1 || choice > 6);


        Map<String, Object> userInput = new HashMap<>();
        Integer aptNo;

        userInput.put("mainMenuChoice", choice);

        switch (choice.intValue()) {
            case 1: {
                ResidentQuestioner.wanterApartment();
                operationName = "select";
                break;
            }
            case 2: {
                ResidentQuestioner.wanterApartment();
                operationName = "select.gui";
                break;
            }
            case 3: {
                ResidentQuestioner.wanterApartment();
                operationName = "insert.gui";
                break;
            }
            case 4: {
                ResidentQuestioner.wanterApartment();
                operationName = "update.gui";
                break;
            }
            case 5: {
                ResidentQuestioner.wanterApartment();
                operationName = "delete.gui";
                break;
            }
            case 6: return new ViewData("MainMenu", "");
            default: return new ViewData(null, null);
        }

        return new ViewData("Resident", operationName, new HashMap<>());
    }

    @Override
    public String toString() {
        return "Main Menu View";
    }

    @Override
    public Integer getInteger(String prompt, boolean allowNulls) throws ParseException {
        return ViewInterface.super.getInteger(prompt, allowNulls);
    }

    @Override
    public Double getDouble(String prompt, boolean allowNulls) throws ParseException {
        return ViewInterface.super.getDouble(prompt, allowNulls);
    }

    @Override
    public Boolean getBoolean(String prompt, boolean allowNulls) throws ParseException {
        return ViewInterface.super.getBoolean(prompt, allowNulls);
    }

    @Override
    public Date getDate(String prompt, boolean allowNulls) throws ParseException {
        return ViewInterface.super.getDate(prompt, allowNulls);
    }

    @Override
    public String getString(String prompt, boolean allowNulls) throws ParseException {
        return ViewInterface.super.getString(prompt, allowNulls);
    }

}
