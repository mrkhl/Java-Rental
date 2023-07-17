package om.gov.omantax;

import om.gov.omantax.entity.Customer;
import om.gov.omantax.entity.Date;
import om.gov.omantax.entity.Rental;
import om.gov.omantax.entity.rentalStatus;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment(1, 50.00);
        Rental rental = new Rental(1, rentalStatus.BOOKED);
        Date date = new Date("10/10/2023 | 10:30PM","11/10/2023 | 10:30AM");
        Customer customer = new Customer(1,"Mohammed","97364188");

        try {
            FileWriter fileWriter = new FileWriter("Rental-Form.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Rental Form     :- "  + "\n"+
                    "   Apartment ID :" + apartment.getApartmentID() +"\n"+
                    "Price :" + apartment.getApartmentPrice() +"\n"+
                    "StartDate :" + date.getStartDateAndTime()+"\n"+
                    "EndDate :" + date.getEndDateAndTime()+"\n"+
                    "customer ID :"+ customer.getCustomerId()+"\n"+
                    "customer Name :"+ customer.getCustomerName()+"\n"+
                    "customer Mobile :"+ customer.getCustomerMobile()


            );
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}