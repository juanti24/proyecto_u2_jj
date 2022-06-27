package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {
	
	private static Logger log = Logger.getLogger(ProyectoU2JjApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.info("Hola Mundo.");

//		#DEBUG. Usado para escribir mensajes de depuración
//		#INFO. Mensajes de estilo verbose. Puramente informativos de determinada acción
//		#WARN. Para alertar de eventos de los que se quiere dejar constancia pero que no afectan al funcionamiento de la aplicación
//		#ERROR. Usado para los mensajes de eventos que afectan al programa pero lo dejan seguir funcionando. Algún parámetro no
//		#es correcto pero se carga el parámetro por defecto, por ejemplo
//		#FATAL. Usado para errores críticos. Normalmente después de guardar el mensaje el programa terminará

	}

}
