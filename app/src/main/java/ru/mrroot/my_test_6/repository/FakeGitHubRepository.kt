package ru.mrroot.my_test_6.repository

import retrofit2.Response
import ru.mrroot.my_test_6.model.SearchResponse
import ru.mrroot.my_test_6.presenter.RepositoryContract

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}