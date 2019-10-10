package ch6.例子5;

public class BlackLandCorp implements Advertisement {
	public void showAdvertisement() {
		System.out.println("**************");
		System.out.printf("劳动是爹\n土地是妈\n想种啥来\n就往外接\n");
		System.out.println("**************");
	}

	public String getCorpName() {
		return "黑土集团";
	}
}
