package bridge;

public class AbstractControle {
	protected Dispositivo dispositivo;
	
	public AbstractControle (Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public String ligaDesliga() {
		if (dispositivo.isEnabled()) {
			dispositivo.disable();
			return "Desligando " + dispositivo.getName();
		} else {
			dispositivo.enable();
			return "Ligando " + dispositivo.getName();
		}
	}

	public String volumeUp() {
		if (!dispositivo.isEnabled())
			return "TV desligada";
		
		dispositivo.setVolume(dispositivo.getVolume() + 10);
		return "Volume em :" + dispositivo.getVolume();
	}

	public String volumeDown() {
		if (!dispositivo.isEnabled())
			return "TV desligada";
		
		dispositivo.setVolume(dispositivo.getVolume() - 10);
		return "Volume em :" + dispositivo.getVolume();
	}
}
