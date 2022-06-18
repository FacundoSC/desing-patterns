package principal;


import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        long inicio = System.currentTimeMillis();
        //for (Integer i: integers) { System.out.println(i);}
       integers.stream().forEach(x-> System.out.println(x));
        long fin = System.currentTimeMillis();
        System.out.println("tiempo de ejecucion de la tarea "+ (fin -inicio)+" ms");

        System.out.println(inicio);
        System.out.println(fin);


    }
}