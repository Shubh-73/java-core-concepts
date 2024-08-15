package designPatterns.factoryPattern;

public class AwsRds implements CloudDatabase
{


    public void createDatabase(String dbName)
    {
        System.out.println("Creating AWS RDS database");
    }


    public void dropDatabase(String dbName)
    {
        System.out.println("Dropping AWS RDS database");
    }


}
