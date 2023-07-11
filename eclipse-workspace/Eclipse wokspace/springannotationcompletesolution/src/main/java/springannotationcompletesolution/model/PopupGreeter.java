package springannotationcompletesolution.model;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PopupGreeter implements Greeter {

	 private Visitor visitor;
	 
	 
	 public Visitor getVisitor() {
		 return visitor;
	 }
	 
    @Autowired
    @Qualifier("jerseyVisitor")
	public void setVisitor(Visitor v) {
		System.out.println("Visitor set to " + v);
		this.visitor = v;

		
	}

	public void greet() {
		JOptionPane.showMessageDialog(null, visitor.getGreeting()+","+ visitor.getName());
	}
}
