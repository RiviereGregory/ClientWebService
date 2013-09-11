package fr.treeptik.clientservice.runtime;

import fr.treeptik.clientservice.wsimport.Employe;
import fr.treeptik.clientservice.wsimport.ManagerWebSevice;
import fr.treeptik.clientservice.wsimport.ManagerWebSeviceService;
import fr.treeptik.clientservice.wsimport.ServiceException_Exception;

public class Main {

	public static void main(String[] args) {
		ManagerWebSeviceService service = new ManagerWebSeviceService();

		ManagerWebSevice managerWebSevicePort = service.getManagerWebSevicePort();

		Employe e = new Employe();
		e.setLogin("Login2");
		e.setNom("NomWS");
		e.setPassword("123465");
		e.setPrenom("PrenomWS");

		try {
			e = managerWebSevicePort.register(e);
		} catch (ServiceException_Exception e1) {
			e1.printStackTrace();
		}

	}

}
