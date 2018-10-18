package libs;

public class LibsClass {
    public static int sum(int slogaemoe1, int slogaemoe2) {
        int tempResult = slogaemoe1 + slogaemoe2;
        System.out.println("Result = " + tempResult);
        return tempResult;
    }

    public int sum(String slogaemoe1, int slogaemoe2) throws Exception {
        try {
            int tempResult = Integer.parseInt(slogaemoe1) + slogaemoe2;
            System.out.println(tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Format Error" + e);
            return 789;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return 999;
        }
    }

    public int division(int intDividend, int intDivisor) {
        int tempResult = 9999; // результат который мы получим, при делении на ноль
        try {
            tempResult = intDividend / intDivisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by Zero, result = 9999");
        }
        System.out.println("Result =" + tempResult);
        return tempResult;
    }

    public double division(double dividend, double divisor) {
        double tempResult = dividend / divisor;
        System.out.println("Result =" + tempResult);
        return tempResult;
    }

    public static int minus(int minus1, int minus2) {
        int tempResult = minus1 - minus2;
        System.out.println("Result = " + tempResult);
        return tempResult;
    }

    public static int mult(int multi1, int multi2) {
        int tempResult = multi1 * multi2;
        System.out.println("Result = " + tempResult);
        return tempResult;
    }

    public void reversePrintArray(int lenght) {
        try {
            String arrayStr[] = new String[lenght];
            for (int i = 1; i < lenght; i++) {
                arrayStr[i] = "test" + i;
            }
            arrayStr[0] = "test";
            for (int i = arrayStr.length; i > 0; i--) {
                System.out.println(arrayStr[i - 1]);
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Empty array");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void printArray(int[] array, int valueForComparing) {
        if (array.length > 0) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] > valueForComparing) {
                    System.out.println("Элемент " + index + array[index] + " больше " + valueForComparing);
                } else if (array[index] == valueForComparing) {
                    System.out.println("Элемент " + index + array[index] + " равно " + valueForComparing);
                } else if (array[index] < valueForComparing) {
                    System.out.println("Элемент " + index + array[index] + " меньше " + valueForComparing);
                } else {
                    System.out.println("Never happened!");
                }
            }
        } else {
            System.out.println("Error : empty array");
        }
    }
}