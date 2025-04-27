package Assignment1;

public class RGBToGrayscale {
	public static int toGrayscale(int red, int green, int blue) {
        int gray = (red * 299 + green * 587 + blue * 114) / 1000;
        return (gray << 16) | (gray << 8) | gray;
    }
    public static void main(String[] args) {
        int red = 100, green = 150, blue = 200;
        int grayscale = toGrayscale(red, green, blue);
        System.out.printf("Grayscale color: #%06X\n", grayscale);
    }
}
