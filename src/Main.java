import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
	static String answer = "No";
	static void f(int[] numbers, int index, int sum, int demand)
	{
		if (index == numbers.length)
		{
			if(sum == demand){
				answer = "Yes";
				return;
			}
			return;
			
		}
		
		// include numbers[index]
		f(numbers, index + 1, sum + numbers[index], demand);

		// exclude numbers[index]
		f(numbers, index + 1, sum, demand);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(scan.readLine());
		while(cases > 0){
			answer = "No";
			String tokens[] = scan.readLine().split("\\s+");
			int notes = Integer.parseInt(tokens[0]);
			int demand = Integer.parseInt(tokens[1]);
			int money[] = new int[notes];
			for(int i = 0; i < notes; i++){
				
				money[i]=Integer.parseInt(scan.readLine());
				
			}
			f(money, 0,0, demand);
			
			System.out.println(answer);
			
			cases--;
			
		}
	
		
	}

}
