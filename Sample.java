public class Sample{

   public int add(int x, int y){
   	return x+y;
   }

   public static void main(String args[]){
	Sample s = new Sample();
        int result = s.add(10,20);
        System.out.println("The result is : "+result);
   }

}
