package springcompleteannotate.model;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PopupConsumer implements Consumer {

	private Product product;
	
	
	
	

	public Product getProduct() {
		return product;
	}

	@Autowired
	@Qualifier("electricalProduct")
	public void setProduct(Product p) {
		
		System.out.println("Product Setted to " + p);
		this.product = p;

	}
	
	public void consumer() {
		JOptionPane.showMessageDialog(null, product.getProduct()+"," + product.getName());

	}

}
