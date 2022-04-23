import java.util.Scanner;
public class VegTest {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter to add stock");
		int n=scanner.nextInt();
		int vegId[]=new int[10];
		String vegName[]=new String[10];
		float vegRate[]=new float[10];
		int vegQu[]=new int[10];
		
		
		
		
		for(int i=0;i<n;i++)   {
			System.out.println("Enter veg id ");
			vegId[i]=scanner.nextInt();
			System.out.println("Enter veg name");
			vegName[i]=scanner.next();
			System.out.println("Enter veg rate");
			vegRate[i]=scanner.nextFloat();
			System.out.println("Enter veg quantity");
			vegQu[i]=scanner.nextInt(); 
			
		}
		
			System.out.println("Id      VegName     VegRate      Quantity");
        for (int i=0;i<n;i++)   {
        	System.out.println(vegId[i]+"     "+vegName[i]+"     "+vegRate[i]+"     "+vegQu[i]);
        }
        String choice;
        int quantity;
        float bill=0;
         
        for (int i=0;i<n;i++)   {
        	System.out.println(vegId[i]+"     "+vegName[i]+"     "+vegRate[i]+"     "+vegQu[i]);
        	  System.out.println("customer buy section");
        	  System.out.println("did u want add from the list");
              System.out.println("y for yes");
              choice=scanner.next();
              
        if (choice.equals("y") ||  choice.equals("Y") ) {			
       System.out.println("How much quantity u want");
        quantity=scanner.nextInt();      
        bill=bill+quantity*vegRate[i];
        vegQu[i]=vegQu[i]-quantity;
        System.out.println( "The bill amount is  "+bill);
        }       
        }
        System.out.println("Any new customer");
        String newCustomer;
        newCustomer=scanner.next();
        
        if (newCustomer.equals("y")) {
        	for (int i=0;i<n;i++)   {
            	System.out.println(vegId[i]+"     "+vegName[i]+"     "+vegRate[i]+"     "+vegQu[i]);
            	  System.out.println("customer buy section");
            	  System.out.println("did u want add from the list");
                  System.out.println("y for yes");
                  choice=scanner.next();
                  
            if (choice.equals("y") ||  choice.equals("Y") ) {			
           System.out.println("How much quantity u want");
            quantity=scanner.nextInt();      
            bill=bill+quantity*vegRate[i];
            vegQu[i]=vegQu[i]-quantity;
            System.out.println("The bill amount is  "+bill);
            }       
            }
        }
	}

}
