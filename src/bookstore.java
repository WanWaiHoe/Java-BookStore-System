import java.util.Scanner;
public class bookstore
{
	public static void main(String[]args)
	{
	Scanner scanner=new Scanner(System.in);
	String []book=new String[100];
	Double []price=new Double[100];
	int a=0;
	int e=1;
	double payment=0;
	double total=0;
	String title =("NO\tBook Title\t\t\tPrice\n\n--------------------------------------------------\n");
	String title1=("\t\t\t\tOrder Summary\t\t\t\t\t\nNo.\tTitle\t\t\tPrice\t\tQuantity\tSubtotal\n\n--------------------------------------------------------------------------\n");
	String title2=("\t\t\t\tReceipt\t\t\t\t\t\t\nNo.\tTitle\t\t\tPrice\t\tQuantity\tSubtotal\n\n--------------------------------------------------------------------------\n");

	do{
	System.out.print("Please Enter Title (Press Enter again for end of book) of Book "+(a+1)+" : ");
	book[a]=scanner.nextLine();
	if(book[a].equals("")){
		System.out.println(" ");
		break;
		}
	a++;
	}while(a < 100);
	
	for(int b=0;b<a;b++){
	System.out.print("Please Enter Price for book "+book[b]+" :RM");
	price[b]=scanner.nextDouble();

	title+=(b+1)+"\t"+book[b]+"\t\t\tRM"+price[b]+"0\n";
	}

	System.out.print(title);
	
	for(int f=1;e==1;f++){
		System.out.print("Please select the book no. that you want to purcase:");
		int c=scanner.nextInt();
	
		System.out.print("You selected "+book[c-1]+" .\nPlease key in the quantity of book that you want to purchase :");
		int d=scanner.nextInt();

		System.out.print("Do you want to add new book order ?\n1.=Yes\n2.=No\nContinue Order :");
		e=scanner.nextInt();
	
		title1+=f+"\t"+book[c-1]+"\t\t"+price[c-1]+"\t\t"+d+"\t\tRM"+(price[c-1]*d)+"0\n";

		total+=price[c-1]*d;

			if(e==2){
			title1+="\t\t\t\t\t\tTotal\t\tRM"+total+"0";
			title2+="\t\t\t\t\t\tTotal\t\tRM"+total+"0";
			break;
			}
		}
	System.out.print(title1);

	System.out.print("\n\n\t\t\t\tPayment\n\n--------------------------------------------------------------------------\nPlease Enter Payment:RM");
	payment=scanner.nextDouble();

	while(payment<total){
		System.out.print("Not enought !\n");
		System.out.print("Please Enter Payment :RM");
		payment=scanner.nextDouble();

		if(payment>=total){
			title2+="\n\n\t\t\t\t\t\tPayment\t\tRM"+payment+"0\n\t\t\t\t\t\tChange\t\tRM"+(payment-total)+"0";
			System.out.print("\n"+title2);
			System.out.print("\n\nThank You ! You Change is RM"+(payment-total)+"0. Please come Again!");
			}
		}
		
	}
}
