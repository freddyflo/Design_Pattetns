package Iterator;

public class Channel {
	
	private double frequency;
	private ChannelTypeEnum TYPE;
	
	public Channel(double frequency, ChannelTypeEnum Type) {
		this.frequency = frequency;
		TYPE = Type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Frequency="+this.frequency+", Type="+this.TYPE;
	}
	
	
	

}
