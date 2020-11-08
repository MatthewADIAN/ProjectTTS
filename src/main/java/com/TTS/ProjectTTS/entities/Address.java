/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.entities;

import lombok.Data;

/**
 *
 * @author USER
 */
@Data
public class Address {

    private String id;
    private String street1;
    private String street2;
    private String city;
    private String province;
    private String zipCode;

    public Address() {
    }

    public Address(String id, String street1, String street2, String city, String province,
            String zipCode) {
        this.id = id;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.province = province;
        this.zipCode = zipCode;
    }
}
