package com.rdpaas.demo.ext.entity;

/**
 CREATE TABLE `tab_user` (
 `id` bigint(64) NOT NULL AUTO_INCREMENT,
 `name` varchar(32) NOT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
 */
public class User1 {
    private Long id;
    private String name;
    private String remark="user1-1111";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "User1{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
