/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.pweb.business;

import ec.edu.ups.pweb.model.Carro;
import java.util.List;

/**
 *
 * @author 
 */
public interface GestionCarrosRemoto {
    public void guardarCarros(Carro carro);
	public void actualizarCarro(Carro carro) throws Exception;
	public Carro getCarroPorPlaca(String placa) throws Exception;
	public void borrarCarro(String placa);
	public List<Carro> getCarros(); // // Obtiener la lista de todos los vehiculos registrados.
}
