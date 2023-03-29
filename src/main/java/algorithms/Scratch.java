package algorithms;
class Scratch {

    public static void main(String[] args) {
        Example example = new Example();

        for (int i = 0; i < 10; ++i) {
            System.out.println("======== " + i + " ========");

            // Создаём два потока, один выполняет oneMethod,
            // а второй — anotherMethod
            Thread thread1 = new Thread((Runnable) () -> example.oneMethod());
            Thread thread2 = new Thread((Runnable) () -> example.anotherMethod());

            // Стартуем оба потока, а потом дожидаемся их выполнения
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Example {

    // Объекты-мониторы
    private static final Object cacheLock = new Object();
    private static final Object tableLock = new Object();


    // Первый метод сначала захватывает монитор cacheLock,
    // затем — tableLock, а потом выполняет работу.
    public void oneMethod() {
        System.out.println("Thread 1 -> oneMethod");
        synchronized(cacheLock) {
            System.out.println("Thread 1 -> oneMethod -> cacheLock");
            synchronized(tableLock) {
                System.out.println("Thread 1 -> oneMethod -> cacheLock -> tableLock");
                // do something
            }
        }
    }

    // Второй метод делает наоборот: сначала захватывает монитор
    // tableLock, затем — cacheLock, а потом выполняет работу.
    public void anotherMethod() {
        System.out.println("Thread 2 -> anotherMethod");
        synchronized(cacheLock) {
            System.out.println("Thread 2 -> anotherMethod -> tableLock");
            synchronized(tableLock) {
                System.out.println("Thread 2 -> anotherMethod -> tableLock -> cacheLock");
                // do something else
            }
        }
    }

}