package com.wizpanda
import com.wizpanda.Book
class Author {
    String firstName;
    String lastName;
    Address address;
    static hasMany = [books:Book]

    static constraints = {
        firstName blank: false, nullable: false
        lastName blank: false, nullable: false
    }

    static mapping = {
        books joinTable: [name: "author_books", key: 'author_id']
        books cascade: 'all-delete-orphan'
        address cascade: 'all-delete-orphan'
        //address lazy: false
        //version false
    }
}
