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
        respond BookService.save(book)
    }

    def delete(Long id) {
        BookService.delete(id) 
        respond BookService.list()
    }

    def update(Book book){
        respond BookService.update(params.id, book)      
    }

    def getByName(String name){
        respond BookService.getByName(name)
    }

}
