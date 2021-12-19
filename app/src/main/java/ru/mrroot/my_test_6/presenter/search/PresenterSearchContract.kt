package ru.mrroot.my_test_6.presenter.search

import ru.mrroot.my_test_6.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}