
public class test_pizza {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Pizza testpizza = new Pizza();
		testpizza.setName("Veggie pizza");
		try {
			testpizza.bake();
			testpizza.deliver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
