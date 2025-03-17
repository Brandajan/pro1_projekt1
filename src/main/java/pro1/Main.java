package pro1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args)
    {
        System.out.println(new Fraction(1400,150));
        System.out.println(new Fraction(52440,3620));
        System.out.println(new Fraction(1300,1260));
        File inputDir = new File("C:/data/input");
        File[] inputFiles = inputDir.listFiles();
        for(File inputFile : inputFiles)
        {
            // System.out.println("Reading "+ inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());
            System.out.println("Ukázka: "+records[0].getName());
            createCSV(records, inputFile.getName());
        }
    }

    public static ExamRecord[] readInputFile(Path path) //vstupní soubor
    {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            return new ExamRecord[0];
        }
        List<ExamRecord> resultList = new ArrayList<>();
        for(String line : lines)
        {
            String[] split= line.split("[:=;]");
            resultList.add(new ExamRecord(
                    split[0],
                    Fraction.parse(split[1])
            ));
        }
        return resultList.toArray(new ExamRecord[0]);
    }
    public static void createCSV(ExamRecord[] records, String inputFileName){ //pole vstupních záznamů, název vstupního souboru
        File outputDir = new File("C:/data/output");
        if (!outputDir.exists()){  //pokud složka ještě neexistuje, vytvoří novou
            outputDir.mkdir();
        }
        String outputFileName = inputFileName + "_output.csv";

        try {
        FileWriter writer =  new FileWriter(outputFileName);
        writer.append("Jméno, Zlomek\n");
        for (ExamRecord record : records) { //projde celé records a zapíše do output souboru
            writer.append(record.getName());
            writer.append(", ");
            writer.append(record.getScore().toString());
            writer.append("\n");
        }} catch (IOException e) {
            System.out.println("chyba");
        }

    }
}
