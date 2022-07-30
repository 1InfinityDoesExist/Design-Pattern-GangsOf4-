package Proxy;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName2) {
		// TODO Auto-generated method stub
		System.out.println("Loading : " + fileName);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying : " + fileName);
	}

}
