package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {
    /*
     *Method will add new List<String> to List
     */
    public void addNewList(List<List<String>> ourList) {
        ourList.add(new ArrayList<>());
        printListList(ourList);
    }

    /* Method should add value to some List
     * @param numberOfList
     * @param value
     */
    public List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        try {
            ourList.get(numberOfList).add(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Negative number of list!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This list is not exist yet!");
        } catch (Exception e) {
            System.out.println("Error!");
        }
        printListList(ourList);
        return ourList;
    }

    //**
// * Method should print Every List on new line
// */
    private void printListList(List<List<String>> ourList) {
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(ourList.get(i));
        }
        System.out.println("---------");
    }
}
