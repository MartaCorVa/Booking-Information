package es.viajeselcaminito;

import es.viajeselcaminito.utilities.ResortHotels;

import java.io.IOException;
import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) {

        try {

            // Get all information from Resort Hotels provider
            String resortHotels = ResortHotels.getAllFromResort();
            System.out.println(resortHotels);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}