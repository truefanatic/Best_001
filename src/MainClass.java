import currency.Dollar;
import currency.Euro;
import currency.UzDollar;
import libs.LibsClass;
import libs.WorkWithArray;
import libs.WorkWithList;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static libs.LibsClass.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("MainClass.class");
        logger.info("Info text");
        logger.debug("Debug text");
        logger.error("Error text");
        System.out.println("Hello world!");
        int var1 = 5;
        int var2 = 10;
        int rez;
        rez = var1 + var2;
        System.out.println("Result = " + rez);
        String stringVar = "Test ", stringVar2 = "12";
        System.out.println(stringVar + stringVar2);
        int result = sum(12, 15);
        sum(13, result);
        LibsClass libsClass = new LibsClass();
        libsClass.sum("33", 44);
        libsClass.sum("88a8", 44);
        System.out.println("--End---");
        minus(2, 3);
        mult(2, 6);
        libsClass.division(40, 0);
        libsClass.division(15.4, 5);
        int[] array = {2, 4, 26, 7, 28, 10, 9, 20, 33};
        int[] array2 = new int[11];
        System.out.println(array[2]);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
            System.out.print(array2[i] + ", ");
        }
        libsClass.printArray(array, 12);

        int[][] arrayArray = {{1, 34, 26}, {2, 45, 89}, {5, 67, 87}};

        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = 0; j < arrayArray[i].length; j++) {
                System.out.println(arrayArray[i][j] + " ");
            }
            System.out.println("");
        }
        List ourList2;
        ourList2 = new ArrayList();
        System.out.println(ourList2);
        ourList2.add("test");
        System.out.println(ourList2);
        ourList2.add(3);
        System.out.println(ourList2);
        System.out.println(ourList2.get(1));

        double rez_6 = libsClass.division(0, 0);
        System.out.println("rez_6 = " + rez_6);
        libsClass.reversePrintArray(3);
        WorkWithArray workWithArray = new WorkWithArray(3, 3, 0);
//
//        workWithArray.fillingOfDiagonal(workWithArray.matrix,1);
//        workWithArray.printMatrix(workWithArray.matrix);
//        workWithArray.fillingOfDiagonal(2,true);
//        workWithArray.printMatrix(workWithArray.matrix);
//        workWithArray.fillingOfDiagonal(3,false);
//        workWithArray.printMatrix(workWithArray.matrix);
//        workWithArray.fillingOfDiagonal(4,true);
//        workWithArray.printMatrix(workWithArray.matrix);

        List<String> ourList1 = new ArrayList<>();
        ourList1.add("test1");
        System.out.println("list " + ourList1);

        List<List<String>> ourListList = new ArrayList<>();
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.get(0).add("test111");
        ourListList.get(0).add("test112");
        ourListList.add(new ArrayList<>());
        ourListList.get(1).add("test121");
        ourListList.add(new ArrayList<>(ourList1));
        ourListList.add(ourList1);
        ourList1.add("test2");
        ourListList.add(ourList1);
        for (List<String> line : ourListList) {
            System.out.println(line);
        }
        Map<String, String> ourMap = new HashMap<>();
        ourMap.put("login", "log");
        ourMap.put("passWord", "pass");
        ourMap.put("key", "value");
        ourMap.put("value", "value11");
        System.out.println(ourMap);
        System.out.println(ourMap.get("passWord"));
        System.out.println(ourMap.get("value"));

        List<Map<String, String>> ourListMap = new ArrayList<>();
        ourListMap.add(ourMap);
        System.out.println(ourListMap);
        ourListMap.add(new HashMap<>(ourMap));
        System.out.println(ourListMap);
        ourListMap.add(new HashMap<>());
        ourListMap.get(2).put("key1", "value1");
        System.out.println(ourListMap);
        for (Map map : ourListMap) {
            System.out.println(map.size());
        }
        String test = new String("ttt");
        String test2 = new String("ttt");
        if (test2.equals(test)) {
            System.out.println("var1");
        } else {
            System.out.println("var2");
        }
        Dollar dollar = new Dollar(10);
        System.out.println("Курс доллара: " + dollar.getKursNBU());
        dollar.setKursNBU(15);
        System.out.println("Курс доллара: " + dollar.getKursNBU());
        dollar.convertGrnToCurrency(1000);
        dollar.convertCurrencyToGrn(1000);
        Euro euro = new Euro(32);
        euro.convertCurrencyToGrn(1000);
        euro.convertGrnToCurrency(100);
        UzDollar uzDollar = new UzDollar(10000);
        uzDollar.isFreeConverted();
        uzDollar.convertCurrencyToGrn(100);
        uzDollar.convertGrnToCurrency(100);



        WorkWithList workWithList = new WorkWithList();
        List<List<String>> ourList = new ArrayList<>();

        workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(0,"test01",ourList);

       workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(1,"test11",ourList);
        ourList = workWithList.addValueToListList(1,"test12",ourList);
        ourList = workWithList.addValueToListList(0,"test02",ourList);

        workWithList.addNewList(ourList);
        workWithList.addValueToListList(2,"test21", ourList);
        workWithList.addValueToListList(1,"test13", ourList);
    }
}
