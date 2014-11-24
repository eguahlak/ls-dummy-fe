/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledummefrontend;

import com.sun.xml.registry.uddi.infomodel.PersonNameImpl;
import dk.cphbusiness.people.contract.PeopleManager;
import dk.cphbusiness.people.contract.dto.PersonSummary;
import javax.ejb.EJB;

/**
 *
 * @author anders
 */
public class Main {
  @EJB
  private static PeopleManager manager;
  

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Starting...");
    for (PersonSummary person : manager.listPeople()) {
      System.out.println(person.getEmail()+": "+person.getName());
      }
    System.out.println("Ended");
    }
  
}
