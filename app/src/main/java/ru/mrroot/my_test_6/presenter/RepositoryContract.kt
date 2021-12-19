package ru.mrroot.my_test_6.presenter

import ru.mrroot.my_test_6.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}