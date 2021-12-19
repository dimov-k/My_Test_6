package ru.mrroot.my_test_6.view.details

import ru.mrroot.my_test_6.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}