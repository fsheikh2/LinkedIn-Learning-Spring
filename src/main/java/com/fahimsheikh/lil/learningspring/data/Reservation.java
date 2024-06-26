package com.fahimsheikh.lil.learningspring.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RESERVATION_ID")
    private Long id;

    @Column(name="ROOM_ID")
    private long roomId;

    @Column(name="GUEST_ID")
    private long guestId;

    @Column(name="RES_DATE")
    private Date reservationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
