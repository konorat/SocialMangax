package com.example.rockway.Dto;

public class MangaDto {
    private Integer id;
    private String name;
    private String vol;
    private Integer idAuthor;
    private Integer userId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVol() {
        return vol;
    }
    public void setVol(String vol) {
        this.vol = vol;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getIdAuthor() {
        return idAuthor;
    }
    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }
    
}
