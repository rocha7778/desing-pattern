package desing.pattern.creational.singleton;

public class Singleton {
    // La única instancia de la clase se almacena como una variable estática privada.
    private static Singleton instance;

    // El constructor es privado para evitar la instanciación directa desde fuera de la clase.
    private Singleton() {
    	System.out.println("Singleton");
    }

    // Este método público estático proporciona un punto de acceso global a la instancia.
    // Si la instancia no ha sido creada aún, se crea. Si ya existe, simplemente se devuelve.
    public static Singleton getInstance() {
        // Comprobamos si la instancia es null, y en caso de serlo, creamos una nueva.
        if (instance == null) {
            // Aquí se aplica el patrón de "lazy initialization".
            instance = new Singleton();
        }
        // Devolvemos la instancia existente.
        return instance;
    }

    // Métodos de ejemplo que demuestran la funcionalidad de la clase.
    public void doSomething() {
        System.out.println("Haciendo algo...");
    }
}