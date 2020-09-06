package com.company.houseComponents;

import com.company.types.MediaType;
import com.company.types.RoomType;

import java.util.List;

public class Room {

    private Integer id;
    private RoomType type;
    private Double surface;
    private String description;
    private List<MediaType> availableMedia;

    public Room(Integer id, RoomType type, Double surface, String description, List<MediaType> availableMedia) {
        this.id = id;
        this.type = type;
        this.surface = surface;
        this.description = description;
        this.availableMedia = availableMedia;
    }

    public void displayRoomInfo() {
        StringBuilder media = new StringBuilder();
        for (MediaType mediaType : availableMedia) {
            media.append(mediaType).append(" ");
        }
        System.out.println("\n\nRoom id: " + id
                + "\nRoom Type: " + type
                + "\nRoom surface: " + surface
                + "\nRoom description: " + description
                + "\nAvailable media: " + media.toString());
    }

    public List<MediaType> getAvailableMedia() {
        return availableMedia;
    }

    public void setAvailableMedia(List<MediaType> availableMedia) {
        this.availableMedia = availableMedia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
