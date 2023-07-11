package springannotationcompletesolution.model;

/**
 * Greets a Visitor
 * @author tinkubhati
 *
 */
public interface Greeter {

	public void greet();
	public void setVisitor(Visitor v);
}
