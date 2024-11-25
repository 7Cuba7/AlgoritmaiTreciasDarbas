package bmt;

public class Shell {

  int sort(int arr[]) {
    int n = arr.length;
    for (int gap = n / 2; gap > 0; gap = gap / 2) {
      for (int i = gap; i < n; i = i + 1) {
        int temp = arr[i];
        int j;
        for (j = i; j >= gap && arr[j - gap] > temp; j = j - gap) {
          arr[j] = arr[j - gap];
        }
        arr[j] = temp;
      }
    }
    return 0;
  }

  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public void core() {
    int arr[] = { 12, 34, 54, 2, 3 }; // Skaiciu sarasas
    System.out.println("Array before sorting");
    printArray(arr);

    sort(arr);

    System.out.println("Array after sorting");
    printArray(arr);
  }

}
