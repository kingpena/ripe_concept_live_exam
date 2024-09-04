import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inputLength = sc.nextInt();
        int[] numbers = new int[inputLength];
        
        if(inputLength >= 1 && inputLength <= 1000000){
            for(int x = 0; x < inputLength; x++){
                int element = sc.nextInt();
                if(element >= 1 && element <= 1000000000){
                 numbers[x] = element; 
                }
            }
            
        }
        if(numbers.length % 2 == 0){
            System.out.print("Not valid length of Element");
        }else{
            System.out.print("Unpaired Element: " + solution(numbers));
        }
	}
	public static int solution(int[] numbers){
	    int unpairedElement = 0;
	    for (int number : numbers){
	        unpairedElement ^= number;
	    } 
	    return unpairedElement;
	}
}
