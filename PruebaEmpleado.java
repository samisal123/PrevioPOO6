public class PruebaEmpleado {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luis Aguilar", 16000, 8524, 50000);
        
        // Gerente hereda todos los atributos y métodos de Empleado (reutiliza código)
        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Número de empleado: " + gerente.getNumEmpleado());
        System.out.println("Sueldo: " + gerente.getSueldo());
        
        gerente.aumentarSueldo(10);
        System.out.println("Nuevo sueldo: " + gerente.getSueldo());
        
        // Y tiene métodos y atributos propios
        System.out.println("Presupuesto: " + gerente.getPresupuesto());
        gerente.asignarPresupuesto(65000);
        System.out.println("Nuevo presupuesto: " + gerente.getPresupuesto());
    }
}

