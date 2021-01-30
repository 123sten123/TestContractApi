package com.contract.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "date_contract")
    Date dateContract;

    @Column(name = "number")
    int number;

    @Column(name = "dateChek")
    Date dataChek;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDataChek() {
        return dataChek;
    }

    public void setDataChek(Date dataChek) {
        this.dataChek = dataChek;
    }
}
