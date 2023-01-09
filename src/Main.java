
public class Main {
    public static void main(String[] args) {
        String test = "Loremipsum";
        TextTransformer myTextTransformer = new TextTransformer();
        InverseTransformer myInverseTransformer = new InverseTransformer();
        UpDownTransformer myUpDownTransformer = new UpDownTransformer();

        TextSaver ts1 = new TextSaver(myTextTransformer);
        ts1.saveTextToFile(test);

        TextSaver ts2 = new TextSaver(myInverseTransformer);
        ts2.saveTextToFile(test);

        TextSaver ts3 = new TextSaver(myUpDownTransformer);
        ts3.saveTextToFile(test);
    }
}
