package es.viajeselcaminito.utilities;

public class utils {

    public static RoomType getRoomType(String roomType) {
        switch (roomType) {
            case "st":
                return RoomType.STANDARD;
            case "su":
                return RoomType.SUITE;
        }
        return null;
    }

}
