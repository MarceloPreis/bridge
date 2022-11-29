package bridge;

public class Tv implements Dispositivo {
	private String name;
	private int volume;
	private boolean status;
	
	public Tv () {
		this.name = "Televisão";
		this.volume = 0;
		this.status = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean isEnabled() {
		return status;
	}

	@Override
	public void enable() {
		status = true;
	}

	@Override
	public void disable() {
		status = false;
	}

	@Override
	public void setVolume(int value) {
		volume = value;
	}

	@Override
	public int getVolume() {
		return volume;
	}
	
}
