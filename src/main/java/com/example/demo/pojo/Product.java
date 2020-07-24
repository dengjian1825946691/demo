package com.example.demo.pojo;

public class Product {
    private Integer id;
    private String name;
    private String location;
    private String version;
    private String unit;
    private Double price;
    private Integer repository;
    private String remarks;
    private Integer category_id;

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", version='" + version + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", repository=" + repository +
                ", remarks='" + remarks + '\'' +
                ", category_id=" + category_id +
                '}';
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRepository() {
        return repository;
    }

    public void setRepository(Integer repository) {
        this.repository = repository;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Product(Integer id, String name, String location, String version, String unit, Double price, Integer repository, String remarks, Integer category_id) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.version = version;
        this.unit = unit;
        this.price = price;
        this.repository = repository;
        this.remarks = remarks;
        this.category_id = category_id;
    }

    public Product() {
    }
}
