package criacionais.singleton;

public class SingletonClass {

    //Cria o atributo da classe que vai armazenar a instância
    private static SingletonClass singletonClass;

    //Construtor privado
    private SingletonClass() {}

    //Cria um método estático no qual vai retornar a mesma instância, caso não for nula.
    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }
    public String HelloWorld() {
        return "Hello World";
    }
}
