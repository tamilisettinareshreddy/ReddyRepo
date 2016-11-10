public class Test{
private static int no;
private static String name;

	public static void main(String args[]){
		System.out.println("Hello World");
		String status = getDetails(10,"Navya");
		System.out.println("The status of the "+name+"is :"+status);
	}
	public static String getDetails(int number1,String name1){
		//condition takes place
		if(no==number1 ||name.equals(name1)){
		return "true";
		}
		else
			return "false";
	}
}
