package authorapp

class UrlMappings {

    static mappings = {
        delete "/authorApp/$controller/$id(.$format)?"(action:"delete")
        get "/authorApp/$controller(.$format)?"(action:"index")
        get "/authorApp/$controller/$id(.$format)?"(action:"show")
        post "/authorApp/$controller(.$format)?"(action:"save")
        put "/authorApp/$controller/update/$id(.$format)?"(action:"update")
        patch "/authorApp/$controller/$id(.$format)?"(action:"patch")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
