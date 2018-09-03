package com.kodilla.good.patterns.challenges;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveSellingInfoToFile {


    public void writeFile(SellingDto sellingDto, String filePath) throws IOException {
        String[] informationsAboutTransaction = {"Buyer: " + sellingDto.getUser(),
                "Everything went well?: " + sellingDto.isValid(), sellingDto.getInformation()};
        Path path = Paths.get(filePath);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
        try {
            for (String line : informationsAboutTransaction) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch(IOException e) {
            throw new IOException();
        }finally {
            bufferedWriter.close();
        }
    }
}
