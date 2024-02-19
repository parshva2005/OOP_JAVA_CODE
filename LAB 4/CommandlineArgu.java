public class CommandlineArgu{
	public static void main(String[] args) {
		int i=0;
		while(i<args[i].length()){
			if(args[i].charAt(0)>='a' && args[i].charAt(0)<='z'){
				System.out.println("ERROR DEFINED!");
				break;
			}
			System.out.println(args[i]);
			i++;
		}
	}
}