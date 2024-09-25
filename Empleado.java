public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado(String nombre, int sueldo, int numEmpleado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.numEmpleado = numEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getNumEmpleado() {
        return this.numEmpleado;
    }

    public void setSueldo(int sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        }
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void aumentarSueldo(int porcentaje) {
        this.sueldo = (int) (this.sueldo * (1 + porcentaje / 100.0));
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nNúmero: " + this.numEmpleado + "\nSueldo: " + this.sueldo;
    }
}
