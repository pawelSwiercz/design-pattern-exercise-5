package main;

import model.Auction;
import model.AuctionService;
import model.Customer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer seller = new Customer("Jan Kowalski");
        Auction auction = Auction.builder()
                .auctionBuilderWithID(1)
                .auctionBuilderWithItem("Coffee")
                .auctionBuilderWithDueDate(LocalDateTime.now().plusDays(2))
                .auctionBuilderWithSeller(seller)
                .build();



        AuctionService.getInstance().bid(auction,new Customer("Anna Kowalik"),20);

        AuctionService.getInstance().bid(auction,new Customer("Krzysztof Adamowicz"),25);


        System.out.println("Auction with id: " + auction.getId()+ " finished. Highest bid: " + auction.getHighestBid() + " PLN.");
        System.out.println(auction.toString());
    }
}
