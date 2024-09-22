import java.io.Serializable;
import java.math.*;

public class EmpleadoTiempoParcial extends Empleado implements IEmpleado {
    public final double PORCENTAJEINCENTIVO = .03;
    private int horasPorSemana;

    public EmpleadoTiempoParcial(){

    }
    public EmpleadoTiempoParcial(String nombre, int ID, double salario,  int horasPorSemana){
        super(nombre, ID, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    @Override
    public double calcularSalario(){
        return getSalario() * getHorasPorSemana();
    }

    @Override
    public double calcularIncentivo() {
        return Math.round((getSalario() * PORCENTAJEINCENTIVO) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Nombre del empleado: " + getNombre() + "\nSalario Semanal: " + calcularSalario() + "\nIncentivo de: " + calcularIncentivo();
    }
}
