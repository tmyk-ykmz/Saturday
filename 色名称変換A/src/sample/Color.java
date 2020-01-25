package sample;

public class Color {
	private String colorName;

	public Color(String colorName) {
		super();
		this.colorName = colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorName() {
		switch(colorName){
		case "Blue":
			return "青";
		case "Red":
			return "赤";
		case "Green":
			return "緑";
		default:
			return "";
		}
	}

}