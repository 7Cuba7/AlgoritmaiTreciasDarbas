package bmt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shell {

  static int sort(int arr[]) {
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

  private static int[] readNumbersFromFile(String fileName) throws IOException {
    List<Integer> numberList = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        numberList.add(Integer.parseInt(line.trim()));
      }
    }

    return numberList.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int[] arr = new int[0];
    String fileName = "random_10k.txt";

    try {
      arr = readNumbersFromFile(fileName);
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
      return;
    }

    // System.out.println("Array before sorting");
    // printArray(arr);

    sort(arr);

    System.out.println("Array after sorting");
    printArray(arr);
  }

}
