package bridge;

public interface Dispositivo {
	public boolean isEnabled();
	public void enable();
	public void disable();
	public int getVolume();
	public void setVolume(int value);
	public String getName();
}
