package service;

import model.familyTree;
import java.io.IOException;

public interface fileOperations<T> {
    void saveToFile(familyTree<T> familyTree, String fileName)
            throws IOException;

    familyTree<T> loadFromFile(String fileName) throws IOException,
            ClassNotFoundException;
}