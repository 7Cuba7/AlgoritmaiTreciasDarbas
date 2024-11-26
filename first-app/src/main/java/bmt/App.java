package bmt;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Shell shell = new Shell();
        QuickSort quickSort = new QuickSort();
        double startTime = System.currentTimeMillis();
        shell.ShellMain();
        // quickSort.QuickSortMain();
        double endTime = System.currentTimeMillis();
        double elapsedTime = (endTime - startTime) / 1000;
        System.out.println("Execution time: " + elapsedTime + "s");

    }
}
