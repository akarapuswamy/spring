package pojo;

public class NetWorkTest {
	public static void main(String[] args) {
		// tight coupling
		AirtelNetwork airtel= new AirtelNetwork();
		Jionetwork jio = new Jionetwork();
		airtel.calls();
		airtel.sms();
		airtel.data();
		// loose couplin
		Container c = new Container();
		Network network=(Network) c.getContainer("network");
		airtel.calls();
		airtel.sms();
		airtel.data();
		Jionetwork nt=(Jionetwork) c.getContainer("network");
		jio.calls();
		jio.sms();
		jio.data();
	}

}
