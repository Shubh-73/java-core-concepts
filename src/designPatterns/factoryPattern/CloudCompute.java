package designPatterns.factoryPattern;

public interface CloudCompute
{
    void startInstance(String instanceId);
    void stopInstance(String instanceId);
}
