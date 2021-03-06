public class Rock {
	
	private String color;
	private float weight;
	
	public Rock(String color, float weight) {
		this.color = color;
		this.weight = weight;
	}

	public Rock() {
		this.color = "black";
		this.weight = 1.5f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Rock [color=" + color + ", weight=" + weight + "]";
	}

	
}
