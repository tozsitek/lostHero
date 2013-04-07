
public class MyOwnClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names = new String[5];
		
		if (args.length == 0){
			System.exit(0);
		}
		
		for(int counter=0; counter<args.length; counter++){
			names[counter] = args[counter];
			System.out.println("Name " + counter + " is: " + names[counter]);
		}
		generateNewName(names);
		
	}
	
	public static void generateNewName(String[] pnames){
		String str = "";
		System.out.println("The new name is: ");
		for(int i=0; i< pnames.length; i++){
			System.out.print(pnames[i].charAt(1));	
			char x = pnames[i].charAt(1);
			str = str + x;
			
		}
		System.out.println("\nThe new name is for str: " + str);
	}

}
