
import java.util.Scanner;


/* Code Created: Feb 22nd 2015
 * CSVTestEngineering/InterviewQuestions
 * Number 3: Calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. For simplicity of implementation, all transactions are measured in cents (pennies).
 */
public class Taxperson {

	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);
		System.out.println("How many items you have bought: ");
		
		int numberOfItems = enter.nextInt();

		try{

			if(numberOfItems<=0 ){
				System.out.println("Invalid number of items have been entered.");
			}
			else{

				int[] arrItems = new int[numberOfItems];
				int selectedItem;
				float[] arrItemsCost = new float[numberOfItems];

				for(int i = 0; i < numberOfItems; i++){

					System.out.println("Enter the cost of the item number " + (i+1) + " in cents: ");
					arrItems[i] = enter.nextInt();
					int checkCatogary = 0;

					while(checkCatogary == 0){

						System.out.println("Is this item a necessary or for luxury?");
						System.out.println("Please enter 1 if it's necessary item and 2 for luxury item.");
						selectedItem = enter.nextInt();

						if(selectedItem == 1){
							arrItemsCost[i] = (float) (arrItems[i] * 1.01);
							checkCatogary = 1;
						}else if(selectedItem == 2){
							arrItemsCost[i] = (float) (arrItems[i] * 1.09);
							checkCatogary = 1;
						}else{

							System.out.println("You have entered invaid value. Please enter either 1 or 2");
						}						
					}
				}
				float total = (float) 0.0;
				for(int i = 0 ; i < numberOfItems; i++){

					System.out.println("The cost of an item number "+ (i+1)+ " is: " + arrItemsCost[i] + " cents");
					total = total + arrItemsCost[i];

				}
				System.out.println("Total cost of the items is: " + total + " cents");
			}
		}catch(Exception e){

			System.out.println("Error has been occured. Please enter a valid integer number.");
		}
	}
}