package com.wizpanda.service

import grails.gorm.transactions.Transactional
import com.wizpanda.Author
import com.wizpanda.Book
import com.wizpanda.Address

@Transactional
class AuthorService {

    def serviceMethod() {}

    def list() {
       return Author.list()
    }

    def save(Author author) {
        return author.save()
    }

    def delete(id) {
       return Author.get(id).delete()
    }

    def get(id){
      return Author.get(id)
    }

    def getByName(name) {
       return Author.findByFirstName(name)
    }

    def update(id, author){
        def auth = Author.get(id)
        println(auth)
        if(auth && auth?.getBooks() && auth?.getAddress() != null){
           auth.properties = author.properties
           auth = auth.merge flush:true
           return auth
        }else{
           return "Not Found"
        }
       
        }

}
