package com.wizpanda


import grails.rest.*
import grails.converters.*
import com.wizpanda.Author
import com.wizpanda.Book
import com.wizpanda.service.BookService

class BookController {
	static responseFormats = ['json', 'xml']
	def BookService;

     def index() { 
        respond BookService.list()
    }

    def show(Long id) {
        respond BookService.get(id)
    }

    def create() {
        respond new Book(params)
    }

    def save(Book book) {
        println("book === "+book);
        respond BookService.save(book)
    }

    def delete(Long id) {
        respond BookService.delete(id) 
    }

    def update(Book book){
        respond BookService.update(params.id, book)      
    }

    def getByName(String name){
        respond BookService.getByName(name)
    }

}
