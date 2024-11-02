package service;

import model.familyTree;
import java.io.*;

public class FileOperationsImpl<T> implements fileOperations<T> {
    @Override
    public void saveToFile(familyTree<T> familyTree, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(familyTree);
        }
    }

    @Override
    public familyTree<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (familyTree<T>) ois.readObject();
        }
    }
}