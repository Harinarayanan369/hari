package DSA;
import java.util.*;

public class StackDSA {
	
	public static void main(String args[])
	{
		/*Stack<String> games=new Stack<String>();
		games.push("coc");
		games.push("free fire");
		games.push("shadow figth");
		System.out.println(games.search("coc"));
		games.pop();
		System.out.println(games);
		System.out.println(games.peek());
		System.out.println(games.isEmpty());*/
		Stack<String> datas=new Stack<String>();
		Stack<String> redo=new Stack<String>();
		boolean check=true;
		String data;
		Scanner scan=new Scanner(System.in);
		while(check)
		{
			data=scan.next();
			if(data.equals("<")&& !(datas.isEmpty()))
			{
				String s=datas.pop();
				redo.push(s);
				System.out.println(s);
				
				
			}
			else if(data.equals(">")&& !(redo.isEmpty()))
			{
				String s=redo.pop();
				datas.push(s);
				System.out.println(s);
				
			}
			else
			{
				datas.push(data);
				
			}
				
			
		}
	}

}
