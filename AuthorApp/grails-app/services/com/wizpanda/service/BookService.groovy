package com.wizpanda.service

import grails.gorm.transactions.Transactional
import com.wizpanda.Author
import com.wizpanda.Book
import com.wizpanda.Address

@Transactional
class BookService {

    def serviceMethod() {

    }

    def list() {
        Book.list()
    }

    def save(Book book) {
        book.save()
    }

    def delete(id) {
        Book.get(id).delete()
    }

    def get(id){
        Book.get(id)
    }

    def getByName(name) {
        Book.findByFirstName(name)
    }

    def update(id, book){
        Book b = Book.get(id)
        b.properties = book.properties
        book.save flush: true
    }

}
