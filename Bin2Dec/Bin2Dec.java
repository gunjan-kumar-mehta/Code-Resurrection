// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binaryInput;
        int decimalOutput = 0;

        System.out.print("Enter a binary number up to 8 digits: ");
        binaryInput = input.nextLine();
        
         if(binaryInput.length() > 8) {
            System.out.println("Error: Only 8 digits are allowed.");
            return;
        }
        
        System.out.println(convertBin2Dec(Integer.parseInt(binaryInput)));
    }
    
    public static int convertBin2Dec(int binaryInput){
        int n=0;
        int decimal=0;
        while(true){
            if(binaryInput==0){
                break;
            }else{
                int temp=binaryInput%10;
                decimal+=temp * Math.pow(2, n);
                binaryInput=binaryInput/10;
                n++;
            }
        }
        return decimal;
    }
}
