import java.util.*;
interface stack
{ 
	public void push();  
	public void pop();
}
class MyStack
{
	public static void main( String args[])
	{
	int n,ch,item,tos=-1;
	System.out.println("enter limit of stack:1");
	Scanner sc = new Scanner (System.in);
	do
	{
		System.out.println("1.PUSH 2.POP 3.EXIT");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
	{
			if(tos>1)
		{
			System.out.println("OVERFLOW");
		}
		else
		{	
			System.out.println("ENTER ITEM:");
			item=sc.nextInt();
			tos++;
			tos=item;
			System.out.println("ITEM INSERTED:"+item);
		}
	}
				break;
		case 2:
	{
		if(tos==0)
		{
			System.out.println("UNDERFLOW");
		}
		else
		{
			item=tos;
			tos--;
			
			System.out.println("ITEM DELETED:"+item);
		}
	}
				break;
		case 3: break;
		default:
		System.out.println("INVALID INPUT");		
		}
	}while(ch!=3);
	}
}






















