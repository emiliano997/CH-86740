package edu.coderhouse.real.state.project;

import edu.coderhouse.real.state.project.entities.Address;
import edu.coderhouse.real.state.project.entities.Client;
import edu.coderhouse.real.state.project.services.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private DaoFactory daoFactory;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Client client1 = new Client("Juan", "Perez", 12345678);
			Client anderson = new Client("Anderson", "Ocaña", 23456789);

			Address address1 = new Address("Calle Falsa", "Springfield", 123);
			Address address2 = new Address("Avenida Siempre Viva", "Springfield", 643);
			Address address3 = new Address("Avenida Siempre Viva", "Springfield", 644);
			Address address4 = new Address("Avenida de la Libertad", "Springfield", 321);

			address1.setClient(client1);
			address2.setClient(client1);
			address3.setClient(anderson);
			address4.setClient(anderson);

			List<Address> addressList = new ArrayList<>();
			addressList.add(address1);
			addressList.add(address2);

			List<Address> addressList2 = new ArrayList<>();
			addressList2.add(address3);
			addressList2.add(address4);

			client1.setAddresses(addressList);
			anderson.setAddresses(addressList2);

			// Crear los objetos en la base de datos
			daoFactory.create(client1);
			daoFactory.create(anderson);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
