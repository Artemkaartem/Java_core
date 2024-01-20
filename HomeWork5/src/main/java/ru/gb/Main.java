package ru.gb;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        int[] initialState = {2, 1, 0, 2, 0, 2, 0, 1, 3};
        Game game = new Game(initialState);

        try {
            game.writeToFile("gameBoard.bin");
            game.readFromFile("gameBoard.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        game.printBoard();

        String sourcePath = "./";
        String destinationPath = "./backup/";

        String[] fileNames = getFiles(sourcePath);
        try {
            backupFiles(fileNames, destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String[] getFiles(String sourceFilePath){
        File file = new File(sourceFilePath);
        String[] fileNames = file.list();
        return fileNames;
    }

    public static void backupFiles(String[] files, String destinationFilePath) throws IOException {
        new File(destinationFilePath).mkdirs();
        try {
            for (String fileName : files){
                Files.copy(Path.of("./" + fileName), Path.of(destinationFilePath + fileName));
            }
        } catch (FileAlreadyExistsException e){
            System.out.println("File already exists " + e.getMessage());
        }
    }
}