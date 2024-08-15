package designPatterns.factoryPattern;

public class AwsFactory implements CloudServiceFactory {

    public CloudDatabase createDatabae(){
        return new AwsRds();
    }
    public CloudCompute createCompute(){
        return new AwsEC2Instance();
    }
    public CloudStorage createStorage(){
        return new AwsS3Storage();
    }
}
