package designPatterns.factoryPattern;

public interface CloudDatabase
{
    void createDatabase(String dbName);
    void dropDatabase(String dbName);
}
