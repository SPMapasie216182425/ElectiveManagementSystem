package za.ac.cput.elective.entity;

public class Room {
    private String roomNum;
    private int roomNumSeats;


    private  Room (Room builder){
        this.roomNum = builder.roomNum;
        this.roomNumSeats = builder.roomNumSeats;
    }


    public String getRoomNum(){
        return roomNum;
    }

    public int getRoomNumSeats(){
        return roomNumSeats;
    }


    @Override
    public String toString() {
        return "Room{" +
                "Room number=" + roomNum +
                ", Room number seats='" + roomNumSeats + '\'' +
                '}';
    }


    public static class Builder{
        private String roomNum;
        private int roomNumSeats;
    }




    public Room setRoomNum (String roomNum){
        this.roomNum = roomNum;
        return this;
    }
    public Room setRoomNumSeats (int roomNumSeats) {
        this.roomNumSeats = roomNumSeats;
        return this;
    }

    public Room copy (Room room){
        this.roomNum = room.roomNum;
        this.roomNumSeats = room.roomNumSeats;
        return this;
    }

    public Room build (){
        return new Room(this);
    }

    public void SeatsFull (){

    }

    public void AvailSeats(){

    }

}

