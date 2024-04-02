public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int array[] = new int[50];
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            array[j] = i;
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println("Завдання 2");
        int array2[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array2[i] = (int) Math.round(Math.random() * 9);
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 20; i++){
            if (i%2!=0) {
                array2[i] = 0;
            }
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Завдання 3");
        double mid1 = 0, mid2 = 0, mid3=0;
        int ar1[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ar1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + ar1[i];
            System.out.print(ar1[i] + " ");
        }
        System.out.println(" ");
        int ar2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ar2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + ar2[i];
            System.out.print(ar2[i] + " ");
        }
        System.out.println(" ");
        int ar3[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ar3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + ar3[i];
            System.out.print(ar3[i] + " ");
        }
        System.out.println(" ");

        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);

        if (mid1>mid2 & mid1>mid3){
            System.out.println("Середнє значення пешого масиву є більшим");
        } else if (mid2>mid1 & mid2>mid3) {
            System.out.println("Середнє значення другого масиву є більшим");
        } else if (mid3>mid1 & mid3>mid2) {
            System.out.println("Середнє значення третього масиву є більшим");
        }else{
            System.out.println("Середнє значення масивів рівне");
        }
        System.out.println("Завдання 4");
        int a1[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(a1[i] + " ");
        }
        System.out.println(" ");
        int a2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(a2[i] + " ");
        }
        System.out.println(" ");
        int a3[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a3[i] = a1[i]+a2[i];
            System.out.print(a3[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Завдання 5");
        int s=0;
        int array3[] = new int[15];
        for (int i = 0; i < 10; i++) {
            array3[i] = (int) Math.round(Math.random() * 10);
            if (array3[i]%2==0){
                s++;
            }
            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
        System.out.println("кількість парних чисел = "+s);
        System.out.println("Завдання 6");
        int[][] array4 = new int[15][];
        array4 [0] = new int [5];
        array4 [1] = new int [5];
        array4 [2] = new int [5];
        array4 [3] = new int [5];
        array4 [4] = new int [8];
        array4 [5] = new int [8];
        array4 [6] = new int [8];
        array4 [7] = new int [8];
        array4 [8] = new int [3];
        array4 [9] = new int [3];
        array4 [10] = new int [3];
        array4 [11] = new int [3];
        array4 [12] = new int [9];
        array4 [13] = new int [9];
        array4 [14] = new int [9];
        for(int i=0;i<array4.length;i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (int) (Math.random() * 15);
                System.out.print(array4[i][j] + " ");
            }
        }
        System.out.println(" ");



    }
}