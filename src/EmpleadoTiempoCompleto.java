public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado{
    private int horasTrabajadas;

    //Porcentaje con el que se calcula el incentivo
    public final double INCENTIVO = .05;

    public EmpleadoTiempoCompleto(){

    }

    public EmpleadoTiempoCompleto(String nombre, int ID, double salario, int horasTrabajadas){
        super(nombre, ID, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //Para calcular el salario se dividen las horas entre 8 para obtener los días y de ahí entre 5 suponiendo que
    //trabaja 5 días a la semana, eso por el salario base
    @Override
    public double calcularSalario() {
        return ((getHorasTrabajadas()/8)/5)* getSalario();
    }

    @Override
    public double calcularIncentivo() {
        return getSalario() * INCENTIVO;

    }

    @Override
    public String toString() {
        return "Nombre del empleado: " + getNombre() + "\nSalario Mensual: $" + calcularSalario() + "\nIncentivo de: $" + calcularIncentivo();
    }
}
