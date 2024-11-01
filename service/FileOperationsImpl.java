package service;

import model.familyTree;
import java.io.*;

public class FileOperationsImpl implements fileOperations {
    @Override
    public void saveToFile(familyTree familyTree, String fileName)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(familyTree);
        }
    }

    @Override
    public familyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (familyTree) ois.readObject();
        }
    }
}