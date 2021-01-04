package com.company.learn;

import java.util.ArrayList;

public class Payment {

    public static class AmountOfProducts{

        private ArrayList <Product> products;

        public AmountOfProducts (){
            this.products = new ArrayList<>();
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void addProduct (Product product){
            getProducts().add(product);
        }

        public void removeProduct (Product product) {
            for (int i = 0; i <getProducts().size(); i++){
                if(getProducts().get(i).getName().equals(product.getName())){
                    getProducts().remove(product);
                }
            }
        }

        public int numberOfProducts (){
            int count = 0;
            for (int i = 0; i < getProducts().size(); i++){
                if (getProducts().get(i) != null){
                    count++;
                }
            }
            return count;
        }

        public int totalPrice(){
            int count = 0;
            for (int i = 0; i < getProducts().size(); i++){
                if (getProducts().get(i) != null){
                    count = count + getProducts().get(i).getPrice();
                }
            }
            return count;
        }



        @Override
        public String toString() {
            return "В корзине "+ numberOfProducts() +" товаров на общую сумму: " ;
        }
    }
}
