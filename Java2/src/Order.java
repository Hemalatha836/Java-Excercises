import java.io.Serializable;
import java.util.Collections;

public class Order implements Serializable{
	
		private static final long serialversionTID=2L;
	    private int orderId;
	    private String productName;
	    transient static  String customerName;

	   
	
	

	    Order(int orderId,String productName, String customerName) {
			
			this.orderId = orderId;
			this.productName = productName;
			this.customerName = customerName;
	    }




		


		@Override
	    public String toString() {
	        return "Order Id=" + getOrderId() + "\nProduct Name= " + getProductName();
	    }







		public int getOrderId() {
			return orderId;
		}







		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}







		public String getProductName() {
			return productName;
		}







		public void setProductName(String productName) {
			this.productName = productName;
		}







		public static String getCustomerName() {
			return customerName;
		}







		public static void setCustomerName(String customerName) {
			Order.customerName = customerName;
		}







		public static long getSerialversiontid() {
			return serialversionTID;
		}


	

		

	

}
