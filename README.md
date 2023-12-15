The Singleton pattern 

Is a design pattern that ensures that a class has a single instance and provides a global access point
to that instance. This means that no matter how many times an object is requested to be created, only a
single instance of the class will be created and that same instance will be returned on each subsequent
request.

Some key points about the Singleton pattern are:

1. Single Instance:

The Singleton ensures that there is only one instance of the class in the entire system.

2. Global Access Point:

Provides a method or property that acts as a global access point for the single instance, allowing 
other objects to easily access it.

3. Private Builder:

To avoid creating multiple instances, the Singleton class constructor is usually private. 
This means that only the class itself can be instantiated.

4. Lazy Initialization or Lazy Initialization:

The instance is created only when it is first requested. This is known as lazy initialization and 
helps improve performance if creating the instance is expensive.

5. Thread Management (Thread-Safe):

In multi-threaded environments, it is crucial to handle instance creation in a way that is thread-safe.
Various mechanisms, such as locking, can be applied to ensure the secure creation of the single instance.

Java Code Example:

    public class Singleton {

    private static Singleton instance;
    int counter;

    private Singleton() {} // Private constructor to avoid direct instantiation

    //Public method getInstance() to obtain the single instance and return it:

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
--------------------------------------------------------------------------
Uml Diagram Class Singleton Pattern:

                  +------------------------------+
                  |           Class Main         |
                  +------------------------------+
                  |         - main(args)         |
                  +------------------------------+
                  |                              |
                  | + main(args: String[]): void |
                  +------------------------------+                              
                                  
                                  
                  +-------------------------------+
                  | Class Aplication (Singleton)  |
                  +-------------------------------+
                  | - aplication: Aplication      |
                  | ~ isRunning: boolean          |
                  +-------------------------------+
                  | - <<Constructor>> Aplication()| 
                  | + getInstance(): Aplication   |
                  | + Run(): void                 |
                  +-------------------------------+

--------------------------------------------------------------------------
Resume Singleton Diagram Class Uml:

                +----------------------------------+
                |             Singleton            |
                +----------------------------------+
                | - instance: Singleton            | 
                | ~ Counter : int                  | 
                +----------------------------------+
                |- <<Constructor>> Singleton()     |  
                |+ getInstance() : Singleton       | 
                |+ getCounter () : int             | 
                |+ setCounter(counter : int) : void| 
                +----------------------------------+



