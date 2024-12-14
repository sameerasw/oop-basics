import config.Configuration;
import core.TicketPool;
import logging.Logger;
import threads.Customer;
import threads.Vendor;
import ui.CommandLineInterface;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Configuration config = CommandLineInterface.configureSystem();
        config.saveToFile("./resources/config.json");
        TicketPool ticketPool = new TicketPool();
        Thread vendor = new Thread(new Vendor(ticketPool,
                config.getTicketReleaseRate()));
        Thread customer = new Thread(new Customer(ticketPool));
        vendor.start();
        customer.start();
        try {
            vendor.join();
            customer.join();
        } catch (InterruptedException e) {
            Logger.log("Main thread interrupted.");
        }
        Logger.log("System terminated.");
    }
}