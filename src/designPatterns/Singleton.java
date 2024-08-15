package designPatterns;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton  getInstance() {

        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/*
singleton instances can be created through synchronised block or through inner class.
The inner class holds the singleton instance and it is considered the best method.

 */




class SingletonBillPugh {
    private SingletonBillPugh(){}

    private static class SingletonHolder{
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance(){
        return SingletonHolder.instance;
    }
}