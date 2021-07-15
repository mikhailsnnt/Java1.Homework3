public class Homework3 {
    public static void main(String[] args) {
        //Task1
        int[] a = {1,0,1,1,0,0,1,0,1,0,1,1,1,1};
        for (int i = 0;i<a.length;++i)
            a[i] = 1-a[i]; //Красивый аналог условию

        //Task2
        int[] Array2 = new int[100];
        for(int i =0 ;i<Array2.length;++i)
            Array2[i] = 1+Array2[i];

        //Task3
        int[] Array3 =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0;i<Array3.length;++i)
        {
            if (Array3[i] < 6)
                Array3[i]*=2;
        }

        //Task4
        int task4N = 5;
        int[][] task4Matrix = new int[task4N][task4N];
        for (int i =0;i<task4N;++i)
        {
            task4Matrix[i][i] = 1;
            task4Matrix[task4N-1-i][i] = 1;
        }
        System.out.println("Task4 : ");
        for (int i =0;i<task4N;++i)
        {
            for (int j = 0;j<task4N;++j)
                System.out.print(task4Matrix[i][j]+" ");
            System.out.println();
        }

    }
}
