import java.util.Scanner;
public class Negocio {
	
	    private Modelagem model;

	    public Negocio(Modelagem model) {
	        this.model = model;
	    }

	    public void processNumbers() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 10 numbers:");
	        for (int i = 0; i < 10; i++) {
	            int number = scanner.nextInt();
	            model.setNumber(i, number);
	        }
	        model.bubbleSort();
	        int[] sortedNumbers = model.getNumbers();
	        for (int number : sortedNumbers) {
	            System.out.print(number + " ");
	        }
	    }
	}
