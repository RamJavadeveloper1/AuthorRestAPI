package com.wizpanda
import com.wizpanda.Author

class Book {
    String title
    static belongsTo = Author
    static hasMany = [authors: Author]

    static constraints = {
        title blank:false, nullable: false;

    }

     static mapping = {
         authors joinTable: [name: "author_books", key: 'book_id' ]
    }
}
