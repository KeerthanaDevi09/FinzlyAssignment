package OopConcepts;

public class DVD extends LibraryItem{
	private int audioDuration;
	
	public DVD(int audioDuration,String title,int itemId) {
		super(title,itemId);
		this.audioDuration = audioDuration;
	}

	public int getAudioDuration() {
		return audioDuration;
	}

	public void setAudioDuration(int audioDuration) {
		this.audioDuration = audioDuration;
	}

	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Audio duration of the DVD is: "+audioDuration+" minutes");
	}
}
