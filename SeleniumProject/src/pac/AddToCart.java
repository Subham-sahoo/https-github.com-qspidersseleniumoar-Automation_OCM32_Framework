package pac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddToCart {

	@Test(dataProvider="getDataForAddCart")
	public void addCart(String cat, String productNAme, int qty) {
	
		   System.out.println("execute ==>"+cat + "=====>"+productNAme+"==>"+qty);
		
	}
	
	@DataProvider
	public Object[][] getDataForAddCart() {
		  Object[][] objArr = new Object[5][3];
		  objArr[0][0] = "mobile";
		  objArr[0][1] = "A50"; 
		  objArr[0][2] = 10; 
		  
		  objArr[1][0] = "mobile";
		  objArr[1][1] = "A70"; 
		  objArr[1][2] = 100; 
		  
		  objArr[2][0] = "mobile";
		  objArr[2][1] = "iphone-11"; 
		  objArr[2][2] = 90; 
		  
		  objArr[3][0] = "tv";
		  objArr[3][1] = "lg"; 
		  objArr[3][2] = 15; 
		  
		  objArr[4][0] = "sunglass";
		  objArr[4][1] = "rayban";
		  objArr[4][2] = 10; 
		return objArr; 
	}
	

}
