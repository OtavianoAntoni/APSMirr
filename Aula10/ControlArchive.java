package Aula10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ControlArchive implements ControlFile {

    public void readDirectory(String path) throws IOException {
        File cafe = new File(path);
        if (cafe.exists() && cafe.isDirectory()) {
            File[] files = cafe.listFiles().clone();
            for(File f: files) {
                if(f.isFile()) {
                    System.out.println("   \t" + f.getName());
                } else {
                    System.out.println("<DIR>\t" + f.getName());
                }
            }
        } else {
            System.out.println("Directory doesn't exists!");
        }
    }

    public void createFile(String path, String name) throws IOException {
        File cafe = new File(path);
        File fil = new File(path, name);
        if(cafe.exists() && cafe.isDirectory()) {
            boolean exist = false;
            if (fil.exists()) {
                exist = true;
                System.out.println("Directory already exists!");
            }
            String content = genTxt();
            FileWriter fw = new FileWriter(fil, exist);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(content + "\n");
            pw.flush();
            pw.close();
            fw.close();
        } else {
            throw new IOException("Directory doesn't exists");
        }
    }

    private String genTxt() {
        StringBuffer buffer = new StringBuffer();
        String line ="";
        while(!line.equalsIgnoreCase("End")) {
            line = JOptionPane.showInputDialog(null, "Digit some text", "Text entrance", JOptionPane.INFORMATION_MESSAGE);
            if(!line.equalsIgnoreCase("end")) {
                buffer.append(line);
            }
        }
        return line;
    }

    public void readFile(String path, String name) throws IOException {
        
    }

    public void openFile(String path, String name) throws IOException {
        
    }

}