package Collections.ArrayList;

public class PaintColorPicker {
	private String paintColor;
	private int Stock;
	private boolean inStock;

	public PaintColorPicker(String paintColor, int stock) {
		this.paintColor = paintColor;
		this.Stock = stock;
	}

	public String getPaintColor() {
		return paintColor;
	}

	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public boolean isInStock() {
		return (getStock() == 0 )? false:true;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	@Override
	public String toString() {
		return "PaintColorPicker{" +
				"paintColor='" + paintColor + '\'' +
				", Stock=" + Stock +
				'}';
	}
}
