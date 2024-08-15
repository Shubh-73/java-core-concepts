package designPatterns.factoryPattern;

public class AwsEC2Instance implements CloudCompute{

    public void startInstance(String instanceId){
        System.out.println("Starting AWS EC2 instance " + instanceId);
    }
    public void stopInstance(String instanceId){
        System.out.println("Stopping AWS EC2 instance " + instanceId);
    }
}
