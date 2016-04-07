package zadania;

public class SymetrycznaTablica implements Zadanie {

    public void startTask() {

        boolean checker = true;
        int[][] matrix =
                {{1, 2, 3, 4},
                        {2, 5, 6, 7},
                        {3, 6, 8, 9},
                        {4, 7, 8, 10}
                };

        System.out.println("\nDana jest tablica o wymiarach: " + matrix.length + " x " + matrix[0].length + "\nOto tablica:");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
                if (matrix[i][j] != matrix[j][i]) {
                    checker = false;
                }
            }
        }
        System.out.println();

        if (checker) {
            System.out.print("Tablica jest symetryczna!");
        } else {
            System.out.print("Tablica nie jest symetryczna!");
        }
    }
}

