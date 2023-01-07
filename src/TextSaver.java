import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
            Files.write(Paths.get("/Users/ac/IdeaProjects/TextTransformer/src/Text.txt"), text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
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
