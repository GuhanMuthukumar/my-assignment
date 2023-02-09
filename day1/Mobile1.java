package week1.day1;

public class Mobile1 {

		public void makecall() {
			String mobileModel="Oppo";
			float mobileWeight=0.193f;
			System.out.println("calling my friend");
			System.out.println("name of Mobile model =" +mobileModel);
	        System.out.println("weight of the mobile =" +mobileWeight);
	       
		}
			public void sendsms() {
				boolean fullycharged= true;
				int mobileCost= 19500;
				System.out.println("messege sent");
				System.out.println("is it charged fully =" +fullycharged);
				System.out.println("cost of the mobile =" +mobileCost);
				}

			public static void main(String[] args) {
				Mobile obj=new Mobile();
				obj.makecall();
				obj.sendsms();
				System.out.println("This is my mobile");
				
			}

}
