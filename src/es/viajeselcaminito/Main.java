package es.viajeselcaminito;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.viajeselcaminito.generic.HotelGeneric;
import es.viajeselcaminito.generic.HotelListGeneric;
import es.viajeselcaminito.utilities.Atalaya;
import es.viajeselcaminito.utilities.ResortHotels;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {

            // Get all information from Resort Hotels provider
            ArrayList<HotelGeneric> resortHotels = ResortHotels.getAllFromResort();

            // Get all information from Atalaya provider
            ArrayList<HotelGeneric> atalayaHotels = Atalaya.getAllFromAtalaya();

            ArrayList<HotelGeneric> hotels = new ArrayList<>();
            hotels.addAll(resortHotels);
            hotels.addAll(atalayaHotels);

            HotelListGeneric hotelListGeneric = new HotelListGeneric(hotels.toArray(new HotelGeneric[0]));

            Gson prettyHotels = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            System.out.println(prettyHotels.toJson(hotelListGeneric));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}