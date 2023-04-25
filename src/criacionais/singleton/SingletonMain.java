package criacionais.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        //O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas
        // uma instância, enquanto provê um ponto de acesso global para essa instância.


        var classe = SingletonClass.getInstance();
        var classe2 = SingletonClass.getInstance();

        System.out.println(classe.HelloWorld());
        System.out.println(classe);
        System.out.println(classe2);

        //Percebemos que a classe e classe2 tem o mesmo nome de refêrencia, ou seja, é a mesma instância.
    }
}
