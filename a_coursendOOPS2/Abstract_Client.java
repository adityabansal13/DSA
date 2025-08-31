package a_coursendOOPS2;

public class Abstract_Client {

	public static void main(String[] args) {

		// error
		// Abstract_Demo ab = new Abstract_Demo();

		// child class ka object banao
		PaymentMethod pb = new PaymentMethod();
		pb.Payment();

		// java 8 ka feature
		// har baar object banane pe methods likhne padenge
		Abstract_Demo ab = new Abstract_Demo() {
			@Override
			public void Payment() {
				// TODO Auto-generated method stub

			}

			@Override
			public int No_of_item() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		ab.Payment();
	}

}
