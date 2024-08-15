package designPatterns.factoryPattern;

public class AwsS3Storage implements CloudStorage
{

    public void uploadFile(String fileName, byte[] data){
        System.out.println("uploading " + fileName + " to AWS S3 ....");
    }
    public byte[] downloadFile(String fileName){
        return null;
    }
    public void deleteFile(String fileName){
        System.out.println("deleting " + fileName + " from AWS S3 ....");
    }
}
