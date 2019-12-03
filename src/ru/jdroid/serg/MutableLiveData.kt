package ru.jdroid.serg

class MutableLiveData<T> : LiveData<T> {

    constructor(value: T) : super(value)

    constructor() : super()

    public override fun setValue(value: T) {
        super.setValue(value)
    }
}
