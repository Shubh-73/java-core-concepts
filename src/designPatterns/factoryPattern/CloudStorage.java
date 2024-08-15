package designPatterns.factoryPattern;

public interface CloudStorage {

    void uploadFile(String fileName, byte[] data);
    byte[] downloadFile(String fileName);
    void deleteFile(String fileName);

}
