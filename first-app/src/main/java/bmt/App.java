package bmt;

import java.util.Scanner;

public class App 
{
	static double startTime;
	static double endTime;
	static double elapsedTime;
	
	public static void main(String[] args) 
	{
        Shell shell = new Shell();
        QuickSort quickSort = new QuickSort();
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Choose an algorithm to run:");
        System.out.println("1. ShellSort");
        System.out.println("2. QuickSort");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        
	       if(choice == 1)
	       {
	    	   System.out.println("Choose a file to process:");
	           System.out.println("1. random_10k.txt");
	           System.out.println("2. random_20k.txt");
	           System.out.println("3. random_40k.txt");
	           System.out.println("4. random_80k.txt");
	           System.out.println("5. random_180k.txt");
	           System.out.print("Enter your choice (1-5): ");
	
	           int fileChoice = scanner.nextInt();
	           
	           switch (fileChoice) 
	           {
		           case 1:
		        	   shell.setFile("random_10k.txt");
		        	   runShell(shell);
		               break;
		           case 2:
		        	   shell.setFile("random_20k.txt");
		        	   runShell(shell);
		               break;
		           case 3:
		        	   shell.setFile("random_40k.txt");
		        	   runShell(shell);
		               break;
		           case 4:
		        	   shell.setFile("random_80k.txt");
		        	   runShell(shell);
		               break;
		           case 5:
		        	   shell.setFile("random_160k.txt");
		        	   runShell(shell);
		               break;
		           default:
		               System.out.println("Invalid choice. Please choose a file between 1 and 5.");
		               break;
	           }
	      
	           
	       }
	       else 
	       {
	    	   System.out.println("Choose a file to process:");
	           System.out.println("1. random_10k.txt");
	           System.out.println("2. random_20k.txt");
	           System.out.println("3. random_40k.txt");
	           System.out.println("4. random_80k.txt");
	           System.out.println("5. random_180k.txt");
	           System.out.print("Enter your choice (1-5): ");
	
	           int fileChoice = scanner.nextInt();
	           
	           switch (fileChoice) 
	           {
		           case 1:
		        	   quickSort.setFile("random_10k.txt");
		        	   runQuickSort(quickSort);
		               break;
		           case 2:
		        	   quickSort.setFile("random_20k.txt");
		        	   runQuickSort(quickSort);
		               break;
		           case 3:
		        	   quickSort.setFile("random_40k.txt");
		        	   runQuickSort(quickSort);
		               break;
		           case 4:
		        	   quickSort.setFile("random_80k.txt");
		        	   runQuickSort(quickSort);
		               break;
		           case 5:
		        	   quickSort.setFile("random_160k.txt");
		        	   runQuickSort(quickSort);
		               break;
		           default:
		               System.out.println("Invalid choice. Please choose a file between 1 and 5.");
		               break;
	           }
	       }
	       
	       
	       
	       scanner.close();
    }

	
	
	private static void runQuickSort(QuickSort quickSort) {
		startTime = System.currentTimeMillis();
        
        quickSort.QuickSortMain();
  
        endTime = System.currentTimeMillis();
        elapsedTime = (endTime - startTime) / 1000;
        
        System.out.println("QuickSort execution time: " + elapsedTime + "s");
	}

	
	
	private static void runShell(Shell shell) {
		startTime = System.currentTimeMillis();
        
        shell.ShellMain();
  
        endTime = System.currentTimeMillis();
        elapsedTime = (endTime - startTime) / 1000;
        
        System.out.println("Shell execution time: " + elapsedTime + "s");
	}
        
}


