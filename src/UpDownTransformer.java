
public class UpDownTransformer extends TextTransformer {

    public UpDownTransformer() {
    }

    @Override
    public String transform(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                result += Character.toUpperCase(text.charAt(i));
            } else {
                result += Character.toLowerCase(text.charAt(i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "UpDownTransformer{}";
    }
}
