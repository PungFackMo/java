package chapter19;

public class Card {
	
	private String Kind;
	private int number;
	public Card() {
		this("SPADE",1);
	}
	
	public Card(String kind, int number) {
		this.Kind=kind;
		this.number=number;
	}

	@Override
	public String toString() {
		return "Card [Kind=" + Kind + ", number=" + number + "]";
	}

}
