package cuentas;
/**La clase CCuenta simula una cuenta en el banco, con el nombre
* del propietario, número de cuenta, saldo disponible y tipo de
* interés
* @author marta
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**Método para la obtención del nombre*/
    public String getNombre() {
		return nombre;
	}
    /**Método para el establecimiento del nombre*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**Método para la obtención de la cuenta*/
	public String getCuenta() {
		return cuenta;
	}
	/**Método para el establecimiento de la cuenta*/
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**Método para la obtención del saldo*/
	public double getSaldo() {
		return saldo;
	}
	/**Método para el establecimiento del saldo*/
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**Método para la obtención del tipo de interés*/
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**Método para el establecimiento del tipo de interés*/
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**Método para conocer el estado de la cuenta: el saldo*/
    public double estado()
    {
        return saldo;
    }
/**Método para ingresar una cantidad de dinero*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**Método para retirar una cantidad de dinero*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
