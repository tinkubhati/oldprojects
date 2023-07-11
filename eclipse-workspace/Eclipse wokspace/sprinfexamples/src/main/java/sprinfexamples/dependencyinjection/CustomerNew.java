package sprinfexamples.dependencyinjection;

public class CustomerNew implements IAddressInjector {

	IAddress iaddress;
	
	public void injectAddress(IAddress iaddress) {
		this.iaddress=iaddress;
	}
	
}
