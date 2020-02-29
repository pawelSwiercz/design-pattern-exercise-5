package model;

import java.time.LocalDateTime;

public class Auction {
    private int id;

    private String item;
    private String description;
    private LocalDateTime dueDate;

    private Customer seller;

    private double highestBid;
    private Customer buyer;

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", seller=" + seller +
                ", highestBid=" + highestBid +
                ", buyer=" + buyer +
                '}';
    }

    public Auction(int id, String item, String description, LocalDateTime dueDate, Customer seller, double highestBid, Customer buyer) {
        this.id = id;
        this.item = item;
        this.description = description;
        this.dueDate = dueDate;
        this.seller = seller;
        this.highestBid = highestBid;
        this.buyer = buyer;
    }

    public Auction() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Customer getSeller() {
        return seller;
    }

    public void setSeller(Customer seller) {
        this.seller = seller;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(double highestBid) {
        this.highestBid = highestBid;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }

    public static AuctionBuilder builder() {
        return new AuctionBuilder();
    }

    public static class AuctionBuilder {
        private int id;
        private String item;
        private String description;
        private LocalDateTime dueDate;
        private Customer seller;
        private double highestBid;
        private Customer buyer;

        public AuctionBuilder auctionBuilderWithID (int id) {
            this.id = id;
            return this;
        }

        public AuctionBuilder auctionBuilderWithItem (String item) {
            this.item = item;
            return this;
        }

        public AuctionBuilder auctionBuilderWithDescription (String description) {
            this.description = description;
            return this;
        }

        public AuctionBuilder auctionBuilderWithDueDate (LocalDateTime dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public AuctionBuilder auctionBuilderWithSeller(Customer seller) {
            this.seller = seller;
            return this;
        }

        public AuctionBuilder auctionBuilderWithHighestBid (double highestBid) {
            this.highestBid = highestBid;
            return this;
        }

        public AuctionBuilder auctionBuilderWithBuyer (Customer buyer) {
            this.buyer = buyer;
            return this;
        }

        public Auction build() {
            Auction auction = new Auction();
            auction.id = this.id;
            auction.item = this.item;
            auction.description = this.description;
            auction.dueDate = this.dueDate;
            auction.seller = this.seller;
            auction.highestBid = this.highestBid;
            auction.buyer = this.buyer;

            return auction;
        }

    }
}
