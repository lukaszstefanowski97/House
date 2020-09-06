package com.company;

import com.company.houseComponents.ConstructionElement;
import com.company.houseComponents.Room;
import com.company.types.ConstructionElementType;
import com.company.types.MediaType;
import com.company.types.RoomType;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        List<ConstructionElement> constructionElements = new ArrayList<>();
        rooms.add(new Room(1, RoomType.BATHROOM, 10.3, "desc", Arrays.asList(MediaType.ELECTRICITY, MediaType.WATER)));
        rooms.add(new Room(1, RoomType.KITCHEN, 10.3, "desc", Arrays.asList(MediaType.ELECTRICITY, MediaType.WATER, MediaType.INTERNET)));
        rooms.add(new Room(1, RoomType.BED, 10.3, "desc", Arrays.asList(MediaType.ELECTRICITY, MediaType.WATER, MediaType.INTERNET)));
        rooms.add(new Room(1, RoomType.LIVING, 10.3, "desc", Arrays.asList(MediaType.ELECTRICITY, MediaType.WATER, MediaType.INTERNET)));
        rooms.add(new Room(1, RoomType.BED, 10.3, "desc", Arrays.asList(MediaType.ELECTRICITY, MediaType.WATER, MediaType.INTERNET)));

        constructionElements.add(new ConstructionElement(ConstructionElementType.BASEMENT, 5.0));
        constructionElements.add(new ConstructionElement(ConstructionElementType.FENCE, 44.9));
        constructionElements.add(new ConstructionElement(ConstructionElementType.ROOF, 34.1));
        constructionElements.add(new ConstructionElement(ConstructionElementType.WINDOW, 14.6));
        constructionElements.add(new ConstructionElement(ConstructionElementType.FLOOR, 20.2));

        House house = new House(constructionElements, rooms, 374928.91, LocalDate.of(2011, Month.APRIL, 14));

        house.displayHouseInfo();

    }
}
