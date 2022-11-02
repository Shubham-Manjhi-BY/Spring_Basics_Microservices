package com.edge.service.edgeService;

import lombok.Data;

@Data
class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

