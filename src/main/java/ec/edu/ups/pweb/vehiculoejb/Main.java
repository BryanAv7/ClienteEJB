/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.pweb.vehiculoejb;

import ec.edu.ups.pweb.business.GestionCarrosRemoto;
import ec.edu.ups.pweb.model.Carro;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author 
 */
public class Main {

    public static void main(String[] args) {
        try {
            // Configuración del cliente JNDI para conectar con el servidor EJB.
            
            final Hashtable<String, String> jndiProperties = new Hashtable<>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");   // URL del servidor.
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
            jndiProperties.put("jboss.naming.client.ejb.context", "true");

            // Inicializa el contexto JNDI para buscar el EJB remoto.
            final Context context = new InitialContext(jndiProperties);
            
            // Busca la referencia del EJB remoto usando su nombre JNDI.
            GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");

            // Registro de un nuevo carro.
            // Uso del EJB
            Carro carro = new Carro();
            carro.setPlaca("ZZZ-543");
            carro.setModelo("R100");
            carro.setMarca("Audi");
            gestionCarros.guardarCarros(carro);
            
             // Mensaje de confirmación.
            System.out.println("Vehiculo Registrado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
