package libs;

public class WorkWithArray {
    public int matrix[][];
    final static int defaultX = 5, defaultY = 5;

    //метод который создает матрицу у меня конструктор класса. и все методы работают с этой матрицой по умолчанию, если не передавать в них матрицы.
    //размер дефолтовой матрицы задается в самом начале статическими константами.
    //3 варианта конструктора класса. 1) Если параменты не заданы матрица 5 на 5 заполняем 0. 2) 5 на 5 заполняем заданным целочисленным
    //3) задаем размер матрицы и целочисленное значение для заполнения
    public WorkWithArray() {
        this(defaultX, defaultY, 0);
    }

    public WorkWithArray(int value) {
        this(defaultX, defaultY, value);
    }

    // Ловим исключение когда размерности матрицы заданны отрицательными значениями и в случае такого исключения
    // задаем матрицу значениями по умолчанию. В данном случае это 5 на 5 и выводим уведомление в консоль.
    public WorkWithArray(int x, int y, int fill) {

        try {
            matrix = new int[x][y];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size, default values would be used " + defaultX + " * " + defaultY);
            matrix = new int[defaultX][defaultY];
        } catch (
                Exception e) {
            System.out.println("Error, default values would be used " + defaultX + " * " + defaultY);
            matrix = new int[defaultX][defaultY];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = fill;
            }
        }
        printMatrix();
    }
    //Уточнить какая диагональ
    //Есть 2 варианта метода заполнения диагонали.
    // 1) Заполняет главную диагональ (начиная с левого верхнего угла заданным целочисленным значением
    // 2) Тоже что и первый, но есть второй параметр типа boolean, если он в false, то мы заполняем побочную диагональ (правый верхний угол)

    public void fillingOfDiagonal(int value) {
        fillingOfDiagonal(matrix, value, true);
    }

    public void fillingOfDiagonal(int[][] arrayArray, int value) {
        fillingOfDiagonal(arrayArray, value, true);
    }

    public void fillingOfDiagonal( int value, boolean mainDiag) {
        fillingOfDiagonal(matrix, value, mainDiag);
    }

    public void fillingOfDiagonal(int[][] arrayArray, int value, boolean mainDiag) {
        if (arrayArray.length == arrayArray[0].length) {
            for (int i = 0; i < arrayArray.length; i++) {
                for (int j = 0; j < arrayArray[0].length; j++) {

                    if (mainDiag && (i == j)) {
                        matrix[i][j] = value;
                    } else if (!mainDiag && (i == arrayArray[0].length - j - 1)) {
                        matrix[i][j] = value;
                    }
                }
            }
        } else {
            System.out.println("Matrix is not a square matrix.");
        }
    }

    public void printMatrix() {
        printMatrix(matrix);
    }

    public void printMatrix(int[][] arrayArray) {
        if (arrayArray.length > 0) {
            for (int i = 0; i < arrayArray.length; i++) {
                for (int j = 0; j < arrayArray[0].length; j++) {
                    System.out.print(arrayArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Empty array.");
        }
    }
}