import java.util.Scanner;

/**
 * 
 */
/**

*

* Name: Hongjiao Hu

* Teacher: Mr. Hardman 

* Assignment 5, Program 3

* Date Last Modified: 2016/11/29

*

*/
/**
 * @author h.hu
 *
 */
/**
 * @author h.hu
 *
 */
public class A5L3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] userArray = new int[5];
		int userValue = 0;
		
		System.out.println("Please enter five marks to begin.");
		
		for(int i = 0; i < userArray.length; i++){
        	System.out.print("Please enter a mark: ");
        	userArray[i] = userInput.nextInt();
        }
		
		
		
		for(int i = 0;i < userArray.length;i++){
			if(userArray[i]>userValue){
				userValue = userArray[i];
			}
		}
		
		System.out.println("The Value " + userValue + " is the largest.");
		userValue = userInput.nextInt(); 
		
		userInput.close();
		
	}

}
