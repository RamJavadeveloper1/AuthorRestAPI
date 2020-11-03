package com.wizpanda
import com.wizpanda.Author
//import grails.gorm.hibernate.*
//implements HibernateEntity<Author>clear
class Book   {
    String title
    static belongsTo = Author
    static hasMany = [authors: Author]
    static mappedBy = [authors: 'none']

    static mapping = {
         authors joinTable: [name: "author_books", key: 'book_id' ]
         
    }
    static constraints = {

        title blank:false, nullable: false;
    }

     
}
