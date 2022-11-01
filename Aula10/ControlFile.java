package Aula10;
import java.io.IOException;

public interface ControlFile {
    public void readDirectory(String path) throws IOException;
    public void createFile(String path, String name) throws IOException;
    public void readFile(String path, String name) throws IOException;
    public void openFile(String path, String name) throws IOException;
}