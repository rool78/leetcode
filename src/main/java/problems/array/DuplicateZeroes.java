package problems.array;

import java.util.LinkedList;
import java.util.Queue;

/*
Haz una función que reciba un array de números y, sobre el mismo array (sin hacer una copia)
duplique los ceros, desplazando los números siguientes a la derecha. El tamaño del array no
debe cambiar, por lo que los números que no puedan escribirse dentro del espacio reservado se
descartan.

EJEMPLOS:
Entrada: (1, 2, 3, 0, 4)
Salida: (1, 2, 3, 0, 0)

Entrada: (0, 1, 2, 3)
Salida: (0, 0, 1, 2)
 */
public class DuplicateZeroes {


    public static void main(String[] args) {
        int[] sol = duplicateZeroes(new int[]{0,0,0,0,0,0,0});
        for (int i : sol) {
            System.out.println(i);
        }

    }

    static int[] duplicateZeroes(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int elementsAdded = 0;
        int i = 0;
        while (elementsAdded < arr.length) {
            queue.offer(arr[i]);
            elementsAdded++;
            if (arr[i] == 0) {
                queue.offer(0);
                elementsAdded++;
            }
            i++;
        }
        i = 0;
        while (!queue.isEmpty() && i < arr.length) {
            arr[i++] = queue.poll();
        }
        return arr;
    }
}
