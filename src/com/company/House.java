package com.company;

import com.company.houseComponents.ConstructionElement;
import com.company.houseComponents.Room;
import com.company.types.ConstructionElementType;
import com.company.types.RoomType;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {

    private List<ConstructionElement> constructionElements;
    private Map<ConstructionElementType, Integer> constructionElementsQuantity = new HashMap<>();
    private List<Room> rooms;
    private Map<RoomType, Integer> roomsQuantity = new HashMap<>();
    private Double totalSurface = 0.0;
    private Double worth;
    private LocalDate dateOfBuild;

    public House(List<ConstructionElement> constructionElements,
                 List<Room> rooms,
                 Double worth,
                 LocalDate dateOfBuild) {

        this.constructionElements = constructionElements;
        this.rooms = rooms;
        this.worth = worth;
        this.dateOfBuild = dateOfBuild;

        populateConstructionElementsMap(constructionElements);
        populateRoomsMap(rooms);

        for (Room room: rooms) {
            this.totalSurface += room.getSurface();
        }
    }

    private void populateConstructionElementsMap(List<ConstructionElement> constructionElements) {
        for (ConstructionElement element : constructionElements) {
            if (constructionElementsQuantity.containsKey(element.getType())) {
                constructionElementsQuantity.replace(element.getType(),
                        constructionElementsQuantity.get(element.getType()) + 1);
            } else {
                constructionElementsQuantity.put(element.getType(), 1);
            }
        }
    }

    private void populateRoomsMap(List<Room> rooms) {
        for (Room room : rooms) {
            if (roomsQuantity.containsKey(room.getType())) {
                roomsQuantity.replace(room.getType(),
                        roomsQuantity.get(room.getType()) + 1);
            } else {
                roomsQuantity.put(room.getType(), 1);
            }
        }
    }

    public List<ConstructionElement> getConstructionElements() {
        return constructionElements;
    }

    public void setConstructionElements(List<ConstructionElement> constructionElements) {
        this.constructionElements = constructionElements;
    }

    public Double getTotalSurface() {
        return totalSurface;
    }

    public void setTotalSurface(Double totalSurface) {
        this.totalSurface = totalSurface;
    }

    public Double getWorth() {
        return worth;
    }

    public void setWorth(Double worth) {
        this.worth = worth;
    }

    public LocalDate getDateOfBuild() {
        return dateOfBuild;
    }

    public void setDateOfBuild(LocalDate dateOfBuild) {
        this.dateOfBuild = dateOfBuild;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Map<RoomType, Integer> getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(Map<RoomType, Integer> roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

    public Map<ConstructionElementType, Integer> getConstructionElementsQuantity() {
        return constructionElementsQuantity;
    }

    public void setConstructionElementsQuantity(Map<ConstructionElementType, Integer> constructionElementsQuantity) {
        this.constructionElementsQuantity = constructionElementsQuantity;
    }

    public void displayHouseInfo() {
        System.out.println("Date of build: " + dateOfBuild
                + "\nRoom quantity: " + rooms.size()
                + "\nWoth: " + worth
                + "\nTotal surface: " + totalSurface);

        System.out.println("\n\nConstruction Element Quantity:\n");
        for (ConstructionElementType key : constructionElementsQuantity.keySet()) {
            System.out.println(key + ": " + constructionElementsQuantity.get(key));
        }

        System.out.println("\n\nRooms quantity:\n");
        for (RoomType key : roomsQuantity.keySet()) {
            System.out.println(key + ": " + roomsQuantity.get(key));
        }

        System.out.println("\n\nRooms info:\n");
        for (Room room : rooms) {
            room.displayRoomInfo();
        }

        System.out.println("\n\nConstruction elements info:\n");
        for (ConstructionElement constructionElement : constructionElements) {
            constructionElement.displayInfo();
        }
    }
}
