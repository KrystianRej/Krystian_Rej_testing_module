package com.kodilla.good.patterns.challenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SellingDto {
    private User user;
    private boolean isValid;
    private String information;

    public SellingDto(User user, boolean isValid, String information) {
        this.user = user;
        this.isValid = isValid;
        this.information = information;
    }

    public User getUser() {
        return user;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getInformation() {
        return information;
    }

    public void writeFile(String filePath) throws IOException {
        String[] informationsAboutTransaction = {"Buyer: " + user, "Everything went well?: " + isValid, information};
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {
            for (String line : informationsAboutTransaction) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch(IOException e){
            throw new IOException();
        }finally {
            bufferedWriter.close();
        }
    }
}
