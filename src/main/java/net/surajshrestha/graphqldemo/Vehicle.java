package net.surajshrestha.graphqldemo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Document("vehicles")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    public int id;

    public String type;

    public String modelCode;

    public String brandName;

    public LocalDate launchDate;

    public transient String formattedDate;

    // Getter and setter
    public String getFormattedDate() {
        return launchDate.toString();
    }
}