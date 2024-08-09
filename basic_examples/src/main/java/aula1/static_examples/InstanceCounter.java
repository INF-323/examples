package aula1.static_examples;

public class InstanceCounter {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    /**
     * Construtor
     */
    InstanceCounter() {
        super();
    }
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {

        //Note que o método getCount() é estático, ou seja, ele não precisa de uma instância da classe para ser chamado.
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");

        //Cria 500 instâncias da classe InstanceCounter. 
        for (int i = 0; i < 500; ++i) {
            new InstanceCounter();
        }

        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }
}
