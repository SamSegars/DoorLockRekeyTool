import java.util.Scanner;
public class Main {
    static int getInt(){
    Scanner input = new Scanner(System.in);
    while (true)
    {
        try
        {
            int amount = input.nextInt();
            return amount;
        } 
        catch (java.util.InputMismatchException e)
        {
            input.nextLine();
        }
    }
}
    static double getDouble(){
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {double amount = input.nextDouble();
            return amount;
            }
            catch (java.util.InputMismatchException e){
                input.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] pinArray = new double[5];
        System.out.println("Which Brand are we working with?\n1. Kwikset\n2. Schlage\n3. Defiant");
        int brand = getInt(); 
        String brandName = "";
        if (brand <= 1 || brand >= 3) {
        while (brand < 1 || brand > 3 ){
            System.out.println("Invalid Choice, Please input 1-3");
            brand = getInt();
        }
        }
        switch (brand) {
            case 1: brandName = "Kwikset";
            break;

            case 2:  brandName = "Schlage";
            break;
            case 3:  brandName = "Defiant";
            break;
        }
            
        
        System.out.println(brandName + " has been selected.");
        System.out.println("What is the First pin depth?");
        pinArray[0] = getDouble();
        System.out.println("What is the Second pin depth?");
        pinArray[1] = getDouble();
        System.out.println("What is the Third pin depth?");
        pinArray[2] = getDouble();
        System.out.println("What is the Fourth pin depth?");
        pinArray[3]= getDouble();
        System.out.println("What is the Fifth pin depth?");
        pinArray[4] = getDouble();
        if (brand == 1) {
            kwikset.kwikset(pinArray);
        } else if (brand == 2) {
            System.out.println("Function not implemented. Please check again later.");
        } else if (brand == 3) {
            System.out.println("Function not implemented. Please check again later.");
        }
    }
}