public class Homework3 {
    public static void main(String[] args) {
        //Task1
        int[] array1 = {1,0,1,1,0,0,1,0,1,0,1,1,1,1};
        System.out.println("Task1:");
        for (int i = 0;i<array1.length;++i){
            array1[i] = 1-array1[i]; //Красивый аналог условию
            System.out.print(array1[i]+ " ");
        }



        //Task2
        System.out.println("\nTask2:");
        int[] array2 = new int[100];
        for(int i =0 ;i<array2.length;++i)
        {
            array2[i] = 1+i;
            System.out.print(array2[i]+" ");
        }

        //Task3
        System.out.println("\nTask3:");
        int[] array3 =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0;i<array3.length;++i)
        {
            if (array3[i] < 6)
                array3[i]*=2;
            System.out.print(array3[i] + " ");
        }

        //Task4
        int task4N = 5;
        int[][] task4Matrix = new int[task4N][task4N];
        for (int i =0;i<task4N;++i)
        {
            task4Matrix[i][i] = 1;
            task4Matrix[task4N-1-i][i] = 1;
        }
        System.out.println("\nTask4 : ");
        for (int i =0;i<task4N;++i)
        {
            for (int j = 0;j<task4N;++j)
                System.out.print(task4Matrix[i][j]+" ");
            System.out.println();
        }


    }
}
