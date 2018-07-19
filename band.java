
public class band {

	private String bandName;
	private String singers[];
	private String guitarists[];
	private String drummer;
	private String keyBoardPlayer;

	public void setBandDetails(String bandName, String[] singers, String[] guitarists, String drummer,
			String keyBoardPlayer) {
		this.bandName = bandName;
		this.singers = singers;
		this.guitarists = guitarists;
		this.drummer = drummer;
		this.keyBoardPlayer = keyBoardPlayer;
	}

	public void printBandDetails() {
		System.out.println(this.toString());
	}

}
