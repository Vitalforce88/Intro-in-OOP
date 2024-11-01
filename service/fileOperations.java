package service;
import model.familyTree;
import java.io.IOException;

public interface fileOperations {
    void saveToFile(familyTree familyTree, String fileName) throws IOException;
    familyTree loadFromFile(String fileName) throws IOException,
            ClassNotFoundException;
}