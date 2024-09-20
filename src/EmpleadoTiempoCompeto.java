import java.io.Serializable;

public class EmpleadoTiempoCompeto  extends Empleado implements IEmpleado{
    private int horasTrabajadas;
    public final double PORCENTAJEINCENTIVO = .5;

    public EmpleadoTiempoCompeto(){

    }
    public EmpleadoTiempoCompeto(String nombre, int ID, double salario,  int horasTrabajadas){
        super(nombre, ID, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * getSalario();
    }

    @Override
    public double calcularIncentivo() {
        return getSalario() * PORCENTAJEINCENTIVO;

    }

    @Override
    public String toString() {
        return "Nombre del empleado: " + getNombre() + "\nSalario Mensual: " + calcularSalario() + "\nIncentivo de: " + calcularIncentivo();
    }
}
