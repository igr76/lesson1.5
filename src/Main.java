

public class Main {
    public static void main(String[] args) {


        // объявление массивов
        int[] box1 = new int[3];
        box1[0] = 1;
        box1[1] = 2;
        box1[2] = 3;
        float[] b = new float[]{1.57f, 7.654f, 9.986f};
        boolean[] c = new boolean[]{false, true, true, false};

        // распечатать массивы
        for (int j = 0 ; j < box1.length ; j++) {
            if (j == box1.length -1) {
                System.out.println(box1[j]);
            } else {
                System.out.print(box1[j] + " ,");}
        }
        for (int v = 0 ; v < b.length ; v++) {
            if (v == b.length -1) {
                System.out.println(b[v]);
            } else {
            System.out.print(b[v] + " ,");}
        }
        for (int i = 0; i < c.length; i++) {
            if (i == c.length-1) {
                System.out.println(c[i]);
            } else
                System.out.print(c[i] + " ,");
        }
        // распечатать наоборот
        System.out.println("  ");
        for (int j = box1.length-1 ; j >0 ; j--) {
                System.out.print(box1[j] + " ,");
        }
        System.out.println(box1[0]);
        for (int j = b.length-1 ; j >0 ; j--) {
            System.out.print(b[j] + " ,");
        }
        System.out.println(b[0]);
        for (int j = c.length-1 ; j >0 ; j--) {
            System.out.print(c[j] + " ,");
        }
        System.out.println(c[0]);

        //нечётное в чётное
        System.out.println("  ");
        for (int j = 0 ; j < box1.length ; j++) {
            if (box1[j] % 2 != 0) {
                box1[j] = box1[j] + 1;
            }
        }
        for (int j = 0 ; j < box1.length ; j++) {
            if (j == box1.length - 1) {
                System.out.println(box1[j]);
            } else
                System.out.print(box1[j] + " ,");
        }


    }}