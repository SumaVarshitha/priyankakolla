
public class reverse {

	public int reverse(int n){
		// TODO Auto-generated method stub
		int r,sum=0,temp;   
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    

	}
		  return sum;

}}
