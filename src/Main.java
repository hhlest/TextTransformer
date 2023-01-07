
public class Main {
    public static void main(String[] args) {
        TextTransformer myTextTransformer = new TextTransformer();
        InverseTransformer myInverseTransformer = new InverseTransformer();
        UpDownTransformer myUpDownTransformer = new UpDownTransformer();

        TextSaver ts1 = new TextSaver(myTextTransformer);
        ts1.saveTextToFile("Hello");

//        TextSaver ts2 = new TextSaver(myInverseTransformer);
//        ts2.saveTextToFile("Hello");
//
//        TextSaver ts3 = new TextSaver(myUpDownTransformer);
//        ts3.saveTextToFile("Hello");
    }
}
