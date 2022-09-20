package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;

public class ReservationService {
    public void addRoom(IRoom room){}
    public IRoom getARoom(String roomId)
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){}
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){}
    public Collection<Reservation> getCustomersReservation(Customer customer){}
    public void printAllReservation(){}
}
