package problems.algoexpert.medium;

public class ArrayOfProducts {

    public int[] arrayOfProducts1(int[] array) {
        int[] sol = new int[array.length];

        int totalProduct = 1;
        for (int i = 0; i < array.length; i++) {
            totalProduct *= array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                sol[i] = totalProduct / array[i];
            } else {
                array[i] = totalProduct;
            }
        }
        return sol;
    }

    public int[] arrayOfProducts(int[] array) {
        int[] sol = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int procuct = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    procuct *= array[j];
                }
            }
            sol[i] = procuct;
        }
        return sol;
    }

    }
