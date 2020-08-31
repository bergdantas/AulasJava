/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula composição
 */

package model;
import java.util.Date;

public class Contrato{
	private Date data;
	private Double valorPorHora;
	private Integer horas;

//CONSTRUTORES	
	public Contrato() {

	}

	public Contrato(Date _data, double _valorPorHora, int _horas) {
		valorPorHora = _valorPorHora;
		horas = _horas;
		data = _data;
	}

/**
* 
* CALCULA O CUSTO DO TRABALHO
* 
* @return double
*/
	public double valorDosContratos() {
		return horas * valorPorHora;
	}

/**
* SOBRESCRITA
*/
	public String toString() {
		return "Contrato [data=" + data + ", valorPorHora=" + valorPorHora + ", horas=" + horas + "]";
	}

//SETTERS E GETTERS 	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
