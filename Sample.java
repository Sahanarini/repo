class Sample
{
  public void Div(int a,int b){
	int result = a/b;
	System.out.println(result);


  }
  
  public void Mul(int a,int b){
	  int result = a*b;
	  System.out.println(result);
  }
  
  
 public void sub(int a, int b){
	 int c = a-b;
	 System.out.println("after subraction :" +c);
 }
 public void add(int a, int b){
	 int c = a+b;
   System.out.println("after addition :" +c);
 }
   public static void main(String args[]){
     System.out.println("Github");
	   Sample ob=new Sample();
	   int a=10;
	   int b=5;
	   ob.add(a,b);
	   ob.sub(a,b);
	   ob.Mul(a,b);
	   ob.Div(a,b);
	   
     //Create the object and call the method to perform the operation.
     
	
 }	 

}
