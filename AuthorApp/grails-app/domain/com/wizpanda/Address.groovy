package com.wizpanda
//import grails.gorm.hibernate.*
//implements HibernateEntity<Author>
  class Address {

    String city;
    String addressLine1;
    String addressLine2;
    String state;
    String country;
    static constraints = {
        city blank: false, nullable:false
        addressLine1 blank: false
        addressLine2 blank: false, nullable:true
        state blank: false, nullable:true
        country blank: false, nullable:true
    }
}
