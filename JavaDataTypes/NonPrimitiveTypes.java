public class NonPrimitiveTypes {
    public static void main(String[] args) {
        
        // 1. Tienen métodos propios (el punto . te da opciones)
        String texto = "java";
        System.out.println(texto.toUpperCase()); 
        // Imprime: JAVA

        // 2. Comparten referencia en memoria
        int[] cajaA = {5, 10};
        int[] cajaB = cajaA; // Apuntan al mismo lugar
        cajaB = 99;       // Cambias B y también cambia A
        System.out.println(cajaA); // Imprime: 99

        // 3. Pueden ser nulos (vacíos)
        String nada = null;
    }
}
