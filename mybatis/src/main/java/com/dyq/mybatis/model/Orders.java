package com.dyq.mybatis.model;

/**
 * @program: mybatis-test
 * @ClassName: Orders
 * @description:
 * @author: Dengyq
 * @create: 2019-02-25 16:11
 **/
public class Orders {
    private Long    id;

    private Long    userId;

    private Double price;

    private String  content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }
}
