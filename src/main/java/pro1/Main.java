package pro1;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args)
    {
        File inputDir=new File("C:/data/input");
        File[] inputFiles= inputDir.listFiles();
        for(File inputFile : inputFiles)
        {
            System.out.println("Reading "+inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());
            System.out.println("Ukázka: "+records[0].getName());
        }
    }

    public static ExamRecord[] readInputFile(Path path)
    {
        double x=5;
        x = Math.sqrt(6);
        return new ExamRecord[0];
    }
}