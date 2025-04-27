package Assignment1;

public class IntegerCompression {
	public static byte[] encodeInteger(int number) {
        byte[] encoded = new byte[5];
        int index = 0;
        
        while ((number & ~0x7F) != 0) {
            encoded[index++] = (byte) ((number & 0x7F) | 0x80);
            number >>>= 7;
        }
        encoded[index++] = (byte) number;
        
        byte[] result = new byte[index];
        System.arraycopy(encoded, 0, result, 0, index);
        return result;
    }

    public static int decodeInteger(byte[] encoded) {
        int number = 0;
        int shift = 0;
        
        for (byte b : encoded) {
            number |= (b & 0x7F) << shift;
            if ((b & 0x80) == 0) break;
            shift += 7;
        }
        
        return number;
    }

    public static void main(String[] args) {
        int num = 123456;
        byte[] encoded = encodeInteger(num);
        int decoded = decodeInteger(encoded);
        
        System.out.print("Encoded bytes: ");
        for (byte b : encoded) {
            System.out.printf("%02X ", b);
        }
        System.out.println("\nDecoded integer: " + decoded);
    }
}
