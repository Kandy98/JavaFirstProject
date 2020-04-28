package part2;

public class FigWords {
	
	private String[] tensNames = {"", " ten", " twenty", " thirty",
		    " forty", " fifty", " sixty", 
		    " seventy", " eighty", " ninety"};

	private String[] numNames = {"", " one", " two", 
			" three", " four", " five"," six",
		    " seven"," eight", " nine", " ten", 
		    " eleven", " twelve", " thirteen", 
			" fourteen", " fifteen", " sixteen", 
			" seventeen", " eighteen", " nineteen"};
	
	private String[] vVal = {"crores", "lakhs", "thousand", "hundred", "only" };
	 
	long [] nVal = {10000000, 100000, 1000, 100, 1};
	String word = "";
	
	public String getWords(long num) {
		
		for(int i=0; i<nVal.length; i++) {
			int v1 = (int) (num/nVal[i]);
			num = num % nVal[i];
			
			if(v1>0) {
				if(v1>19) {
					word += tensNames[v1/10] + numNames[v1%10] + vVal[i]; 
				}
				
				else {
					word += numNames[v1] + vVal[i];
				}
			}
		}
		
		return word;
	}
/*
	private static String[] power = {" hundred", " thousand"};
	
	public static void figToWords(long fig) {
		
		if(fig==0) {
			System.out.println("zero");
			return;
		}
		
		else if(fig<20) {
			System.out.print(numNames[(int)fig]);
			return;
		}
		
		else if(fig<1000) {
			int temp = (int)fig;
			String word = "";
			word = numNames[temp/100] + power[0];
			temp %= 100;
			word = word + tensNames[temp/10];
			temp %= 10;
			word = word + numNames[temp];
			System.out.println(word);
			return;
		}
		
		else if(fig<20000) {
			int temp = (int)fig;
			String word = "";
			word = numNames[temp/1000] + power[1];
			temp %= 1000;
			word = word + numNames[temp/100] + power[0];
			temp %= 100;
			word = word + tensNames[temp/10];
			temp %= 10;
			word = word + numNames[temp];
			System.out.println(word);
			return;
		}
	}
	*/
}
