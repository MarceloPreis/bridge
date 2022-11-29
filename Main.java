package bridge;

public class Main {

	public static void main(String[] args) {		
		Tv tv = new Tv();
		Controle controle = new Controle(tv);
		
		System.out.println(controle.ligaDesliga());
		System.out.println(controle.volumeUp());
		System.out.println(controle.volumeDown());
		System.out.println(tv.getVolume());

	}

}
