package week1.day1;

public class Mobile {
	
	
	public void makeCall()
	{
		String mobileModel= "iPhone 15";
		float mobileWeight= 200;
		System.out.println("Mobile Model is: "+mobileModel+" and mobile weight is: "+mobileWeight+"gm");
	}
	
	public void sendMsg()
	{
		boolean isFullCharged= true;
		int mobileCost =100000;
		System.out.println("Is mobile charged: "+isFullCharged+" and mobile cost is: "+mobileCost);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is my mobile");
		Mobile mobile= new Mobile();
		mobile.makeCall();
		mobile.sendMsg();
		
		
		
	}


}
