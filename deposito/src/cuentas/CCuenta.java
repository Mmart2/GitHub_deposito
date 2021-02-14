package cuentas;
/**La clase CCuenta simula una cuenta en el banco, con el nombre
* del propietario, n�mero de cuenta, saldo disponible y tipo de
* inter�s
* @author marta
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**M�todo para la obtenci�n del nombre*/
    public String getNombre() {
		return nombre;
	}
    /**M�todo para el establecimiento del nombre*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**M�todo para la obtenci�n de la cuenta*/
	public String getCuenta() {
		return cuenta;
	}
	/**M�todo para el establecimiento de la cuenta*/
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**M�todo para la obtenci�n del saldo*/
	public double getSaldo() {
		return saldo;
	}
	/**M�todo para el establecimiento del saldo*/
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**M�todo para la obtenci�n del tipo de inter�s*/
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**M�todo para el establecimiento del tipo de inter�s*/
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
/**M�todo para conocer el estado de la cuenta: el saldo*/
    public double estado()
    {
        return saldo;
    }
/**M�todo para ingresar una cantidad de dinero*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**M�todo para retirar una cantidad de dinero*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
