package ru.mrroot.my_test_6.repository

import retrofit2.Response
import ru.mrroot.my_test_6.model.SearchResponse

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}