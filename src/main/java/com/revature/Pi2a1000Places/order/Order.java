package com.revature.Pi2a1000Places.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

        @Id
        private String id;
        private String menuItem;
        private String comment;
        private String isFavorite;
        private String orderDate;
        private String customerUsername;


        public Order( String id, String menuItem, String comment,String isFavorite, String orderDate, String customerUsername){
            super();
            this.id = id;
            this.menuItem = menuItem;
            this.comment = comment;
            this.isFavorite = isFavorite;
            this.orderDate = orderDate;
            this.customerUsername = customerUsername;
        }

        public Order(){

        }

        //Getters And Setters
        public String getId(){return id;}

        public void setId(String id){this.id = id;}

        public String getMenuItem(){return menuItem;}

        public void setMenuItem(String menuItem){this.menuItem = menuItem;}

        public String getComment(){return comment;}

        public void setComment(String comment){this.comment = comment;}

        public String getIsFavorite(){return isFavorite;}

        public void setIsFavorite(String isFavorite){this.isFavorite = isFavorite;}

        public String getOrderDate(){return orderDate;}

        public void setOrderDate(String orderDate){this.orderDate = orderDate;}

        public String getCustomerUsername(){return customerUsername;}

        public void setCustomerUsername(String customerUsername){this.customerUsername = customerUsername;}





        @Override
        public String toString() {
            return "User Info{" +
                    "Order ID ='" + id + '\'' +
                    ", Menu Item ='" + menuItem + '\'' +
                    ", Comment ='" + comment + '\'' +
                    ", Favorite ='" + isFavorite + '\'' +
                    ", Order Date ='" + orderDate + '\'' +
                    '}';
        }

    }






