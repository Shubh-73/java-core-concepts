package designPatterns.factoryPattern;

public interface CloudServiceFactory
{
    CloudDatabase createDatabae();
    CloudCompute createCompute();
    CloudStorage createStorage();

}
