package command.exercise;

import command.example.CommandInterface;

public class ShellSort implements CommandInterface {

    private int[] arr;

    public ShellSort(int[] arr){
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Shellsort");
        CommandInterface.printArray(arr, "Before");
        sort();
        CommandInterface.printArray(arr, "After");
        System.out.println("Shellsort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    private void sort(){
        int n = arr.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
    }
}
