package bridge;

public class Controle extends AbstractControle {
	
	public Controle(Dispositivo dispositivo) {
		super(dispositivo);
	}

	public void mute() {
		dispositivo.setVolume(0);
	}
}
