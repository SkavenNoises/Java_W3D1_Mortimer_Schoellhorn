package Classes;

public class ElectronicBook extends Book{
	private String url;

	public ElectronicBook(String name, String description, double price, String url) {
		super(name, description, price);
		this.url = url;
	}

	@Override
	public String toString() {
		return "name: " + getName() +
				", description: " + getDescription() +
				", price: €" + getPrice() +
				", weight: " + getUrl();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
