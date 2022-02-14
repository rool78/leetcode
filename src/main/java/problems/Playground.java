package problems;

import java.util.LinkedHashSet;
import java.util.Objects;

public final class Playground {

    public static void main(String[] args) {

        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        s.add(1);
        s.add(1);
        s.add(2);

        for (int i : s) {
            System.out.println(i);
        }

        s.

        int[] arr = s.toArray(new int[0]);
    }
 final class Cell {
        int x;
        int y;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Cell cell = (Cell) o;
         return x == cell.x && y == cell.y;
     }

     @Override
     public int hashCode() {
         return Objects.hash(x, y);
     }
 }






}
