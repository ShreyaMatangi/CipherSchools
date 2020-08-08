
import java.util.*;

public class BracesMatching
{
	public boolean isBalanced(String s)
	{
		Stack stack=new Stack();
		if(s.length()==0)
			return true;
		else
		{
			char[] a=s.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				if(a[i]=='(' || a[i]=='{' || a[i]=='[')
				{
					stack.push(a[i]);
				}
				else if(a[i]=='}' || a[i]==')'|| a[i]==']')
				{
					if(stack.isEmpty())
						return false;
					if(a[i]=='}' && (char)stack.peek()=='{' && ((char)stack.peek()!='(' || (char)stack.peek()!='['))
						stack.pop();
						// System.out.println("bjdfkkv");
					else if(a[i]==']' && (char)stack.peek()=='[' && ((char)stack.peek()!='(' || (char)stack.peek()!='{'))
						stack.pop();
					else if(a[i]==')' && (char)stack.peek()=='(' && ((char)stack.peek()!='[' || (char)stack.peek()!='{'))
						stack.pop();
					else
						return false;
				}
			}
			
		}
		if(stack.isEmpty())
			{
				return true;
			}
		return false;
	}
	public static void main(String[] args) {
		BracesMatching bm=new BracesMatching();
		System.out.println("enter:");
		Scanner s=new Scanner(System.in);
		String string=s.nextLine();
		System.out.println(bm.isBalanced(string));
	}
}