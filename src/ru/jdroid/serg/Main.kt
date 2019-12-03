package ru.jdroid.serg

fun main() {
    val model = ViewModel()

    model.text.observe(Observer {
        println(it)
    })

    model.update("22")
    model.update("23")
    model.update("Hello")
}