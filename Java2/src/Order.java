import java.io.Serializable;
import java.util.Collections;

public class Order implements Serializable{
	
	    private int orderId;
	    private String productName;
	    private String customerName;

	   
	
	Order(int orderId,String productName, String customerName) {
			
			this.orderId = orderId;
			this.productName = productName;
			this.customerName = customerName;
	    }


	    @Override
	    public String toString() {
	        return "Order Id=" + orderId + "\nProduct Name= " + productName  ;
	    }

}
