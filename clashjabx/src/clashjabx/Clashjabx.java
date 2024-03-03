/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clashjabx;

import generated.*;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * author: AluCiclesGS1
 */
public class Clashjabx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        menu();
        Scanner entrada = new Scanner(System.in);
        int opcio = entrada.nextInt();

        switch (opcio) {

            case 1:
                exercici1();
                break;
            case 2:
                exercici2();
                break;
            default:
                break;

        }
    }

    private static void menu() {
        System.out.println("******MENU********");
        System.out.println("1.- Exercise 1: List players & cards");
        System.out.println("2.- Exercise 2: Create player or card");
        System.out.println("EXIT");
        System.out.println("");
        System.out.println("Enter the desired option: ");
    }

    private static void exercici1() throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(ClashType.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    ClashType clash = (ClashType) unmarshaller.unmarshal(new File("./src/clashjabx/clash_1.xml"));

    ArrayList<JugadorType> jugadors = (ArrayList<JugadorType>) clash.getJugador();

    for (JugadorType j : jugadors) {
        System.out.println("Name:" + j.getNom());
        System.out.println("Trophies:" + j.getCopes());
        System.out.println("Level:" + j.getNivell());

        ArrayList<CartaType> cartes = (ArrayList<CartaType>) j.getCarta();

        for (CartaType c : cartes) {
            System.out.println("Card name:" + c.getNomcart());
            System.out.println("Card level:" + c.getNivellcart());
            System.out.println("Rarity:" + c.getRaresa());
        }

        ClanType clan = j.getClan();
        if (clan != null) { // Check if clan is not null
            System.out.println("Clan trophies:" + clan.getCopesclan());
            System.out.println("Clan name:" + clan.getNomclan());
            System.out.println("Clan type:" + clan.getTipusclan());
        } else {
            System.out.println("Clan information not available for this player.");
        }
    }
}


    private static void exercici2() throws JAXBException {
        menu2();
        Scanner entrada = new Scanner(System.in);
        int opcio = entrada.nextInt();

        switch (opcio) {

            case 1:
                exercici21();
                break;
            case 2:
                exercici22();
                break;
            default:
                break;

        }
    }

    private static void menu2() {
        System.out.println("******MENU********");
        System.out.println("1.- Exercise 1: Create player");
        System.out.println("2.- Exercise 2: Create and add card to a player");
        System.out.println("EXIT");
        System.out.println("");
        System.out.println("Enter the desired option: ");
    }

    private static void exercici21() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ClashType.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        ClashType clash = (ClashType) unmarshaller.unmarshal(new File("./src/clashjabx/clash_1.xml"));

        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter the player's name:");
        String nom = entrada.nextLine();
        System.out.println("Enter the player's level:");
        int nivell = entrada.nextInt();
        System.out.println("Enter the player's trophies:");
        BigInteger copes = entrada.nextBigInteger();

        JugadorType jugador1 = new JugadorType();

        jugador1.setNom(nom);
        jugador1.setCopes(copes);
        jugador1.setNivell(nivell);
        
        
        clash.getJugador().add(jugador1);

        try {
            File file = new File("./src/clashjabx/clash_1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ClashType.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            //  jaxbMarshaller.marshal(new JAXBElement<ClashType>(new QName("clash"), ClashType.class, c), file);
            //  jaxbMarshaller.marshal(new JAXBElement<ClashType>(new QName("clash"), ClashType.class, c), System.out);
            jaxbMarshaller.marshal(clash, file);
            jaxbMarshaller.marshal(clash, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void exercici22() throws JAXBException {
    // Implement the functionality for Exercise 2 - Option 2 here
    System.out.println("Exercise 2 - Option 2: Create and add a card to an existing player");

    // Prompt the user to enter player name
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter player name to add the card to: ");
    String playerName = scanner.nextLine();

    // Prompt the user to enter card details
    System.out.println("Enter card name: ");
    String cardName = scanner.nextLine();
    System.out.println("Enter card level: ");
    int cardLevel = scanner.nextInt();
    System.out.println("Enter card rarity: ");
    String cardRarity = scanner.next();

    // Create a new card object
    CartaType newCard = new CartaType();
    newCard.setNomcart(cardName);
    newCard.setRaresa(cardRarity);

    // Find the player in the XML data
    JAXBContext context = JAXBContext.newInstance(ClashType.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    ClashType clash = (ClashType) unmarshaller.unmarshal(new File("./src/clashjabx/clash_1.xml"));
    ArrayList<JugadorType> jugadors = (ArrayList<JugadorType>) clash.getJugador();
    boolean playerFound = false;
    for (JugadorType jugador : jugadors) {
        if (jugador.getNom().equalsIgnoreCase(playerName)) {
            // Add the new card to the player's list of cards
            jugador.getCarta().add(newCard);
            playerFound = true;
            break; // Exit loop after finding the player
        }
    }

    if (!playerFound) {
        System.out.println("Player not found.");
        return;
    }

    // Save the updated XML data
    try {
        File file = new File("./src/clashjabx/clash_1.xml");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.marshal(clash, file);
        marshaller.marshal(clash, System.out);
        System.out.println("Card added successfully to player: " + playerName);
    } catch (JAXBException e) {
        e.printStackTrace();
    }
  }

}
