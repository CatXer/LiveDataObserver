package ru.jdroid.serg


class ViewModel {
    private val _text = MutableLiveData<String>().apply {
        setValue("")
    }
    val text: LiveData<String> = _text

    fun update(data: String) {
        _text.setValue(data)
    }
}