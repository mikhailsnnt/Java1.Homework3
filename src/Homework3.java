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

        // Задания 5  очевидно, не стал писать семпл.
        // Для задания 6 просто написал функции  min, max для массива
        int[] task7Sample = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Task 7 : " + task7( task7Sample));

    }
    static int [] task5(int len , int initialValue)
    {
        int [] temp = new int[len];
        for (int i = 0;i<len;++i)
            temp[i] = initialValue;
        return temp;
    }

    static int arrayMin (int[] array){ //Минимум в массиве
        int minimum = 1000000000; //
        for(int i= 0;i<array.length;++i)
            minimum = Integer.min(array[i] , minimum);
        return minimum;
    }
    static int arrayMax (int[] array){ //Максимум в массиве
        int maximum = -1000000000; //
        for(int i= 0;i<array.length;++i)
            maximum = Integer.max(array[i] , maximum);
        return maximum;
    }

    static boolean task7 (int[] array)
    {
        int n  = array.length;
        if (n == 0) //Проверка на пустоту массива
            return false;
        int[] prefixSum = new int[n] ;// Решаю задачу за O(n), префикс суммой  суммой , можно про
        prefixSum[0] = array[0];
        for(int i = 1;i<n;++i)
            prefixSum[i] = prefixSum[i-1] + array[i];
        for (int  i = 0;i+1<n;++i)
            if (prefixSum[i] == prefixSum[n-1] - prefixSum[i]) //  Сумма на префиксе равна сумме на суффиксе :)
                return true;  //Спасите меня...  Хотел повыпендриваться, решить эту задачу Декартовым деревом
        return false;
    }




}
