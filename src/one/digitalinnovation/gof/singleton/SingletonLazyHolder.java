package one.digitalinnovation.gof.singleton;

/*
Singleton "Lazy Holder"

 */

public class SingletonLazyHolder {

    private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return instancia;
    }
}
