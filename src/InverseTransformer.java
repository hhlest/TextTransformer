
public class InverseTransformer extends TextTransformer {

    public InverseTransformer() {
    }

    @Override
    public String transform(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    @Override
    public String toString() {
        return "InverseTransformer{}";
    }
}
