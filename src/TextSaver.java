import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {
    private TextTransformer tt;
    private File f;

    public TextSaver(TextTransformer tt, File file) {
        this.tt = tt;
        this.f = file;
    }

    public TextSaver(TextTransformer tt) {
        this.tt = tt;
    }

    public TextTransformer getTt() {
        return tt;
    }

    public void setTt(TextTransformer tt) {
        this.tt = tt;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public void saveTextToFile(String text) {
        writeUsingFiles(tt.transform(text));
    }

    private static void writeUsingFiles(String text) {
        try {
            FileWriter writer = new FileWriter("/Users/ac/IdeaProjects/TextTransformer/src/Text.txt", true);
            writer.append(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TextSaver{" +
                "tt=" + tt +
                ", file=" + f +
                '}';
    }
}
