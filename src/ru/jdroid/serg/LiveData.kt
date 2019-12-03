package ru.jdroid.serg


abstract class LiveData<T> {


    private val observers: ArrayList<Observer<in T?>?> = ArrayList()
    private var mData: T? = null


    private var mVersion: Int = 0

    internal constructor()
    internal constructor(value: T) {
        mData = value
    }

    fun observe(observer: Observer<in T?>?) {
        observers.add(observer)
    }

    protected open fun setValue(value: T) {
        mVersion++;
        mData = value
        dispatchingValue()
    }

    private fun dispatchingValue() {
        for (o in observers) {
            o?.onChanged(mData)
        }
    }


}