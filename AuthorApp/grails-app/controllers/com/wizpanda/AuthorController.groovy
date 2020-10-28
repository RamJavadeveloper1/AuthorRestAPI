package com.wizpanda
import grails.rest.*
import grails.converters.*
import com.wizpanda.Author
import com.wizpanda.Book
import com.wizpanda.service.AuthorService

class AuthorController {
	static responseFormats = ['json', 'xml']
	def AuthorService;
    
    def index() { 
        respond AuthorService.list()
    }

    def show(Long id) {
        respond AuthorService.get(id)
    }

    def create() {
        respond new Author(params)
    }

    def save(Author author) {
        println("author === "+author);
        respond AuthorService.save(author)
    }

    def delete(Long id) {
        AuthorService.delete(id)
        respond AuthorService.list()
    }

    def update(Author author){
        respond AuthorService.update(params.id, author)
        }

    def getByName(String name){
        respond AuthorService.getByName(name)
    }


}
